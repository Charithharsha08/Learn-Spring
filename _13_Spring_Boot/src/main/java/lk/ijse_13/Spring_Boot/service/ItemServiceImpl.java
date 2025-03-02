package lk.ijse_13.Spring_Boot.service;

import lk.ijse_13.Spring_Boot.DTO.ItemDTO;
import lk.ijse_13.Spring_Boot.entity.Item;
import lk.ijse_13.Spring_Boot.repo.ItemRepo;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemServiceImpl implements ItemService {
    @Autowired
    private ItemRepo itemRepo;

    @Autowired
    private ModelMapper modelMapper;
    @Override
    public void saveItem(ItemDTO itemDTO){
        if (itemRepo.existsById(itemDTO.getItemId())) {
            throw new RuntimeException("Item already exists");
        }
        itemRepo.save(modelMapper.map(itemDTO , Item.class));
    }
    @Override
    public void deleteItem(int id){
        if (!itemRepo.existsById(id)) {
            throw new RuntimeException("Item does not exist");
        }
        itemRepo.deleteById(id);
    }
    @Override
    public void updateItem(ItemDTO itemDTO){
        if (itemRepo.existsById(itemDTO.getItemId())) {
            itemRepo.save(modelMapper.map(itemDTO, Item.class));
            return;
        }
        throw new RuntimeException("Item not found");
    }
    @Override
    public List<ItemDTO> getAllItems(){
        if (itemRepo.findAll().isEmpty()) {
            throw new RuntimeException("No Items found");
        }
return modelMapper.map(
        itemRepo.findAll(),
        new TypeToken<List<ItemDTO>>(){}.getType()
    );
    }
}
