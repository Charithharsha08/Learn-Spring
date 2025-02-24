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
    public boolean saveItem(ItemDTO itemDTO){
        itemRepo.save(modelMapper.map(itemDTO , Item.class));
        return true;
    }
    @Override
    public boolean deleteItem(int id){
        itemRepo.deleteById(id);
        return true;
    }
    @Override
    public boolean updateItem(ItemDTO itemDTO){
        itemRepo.save(modelMapper.map(itemDTO , Item.class));
        return true;
    }
    @Override
    public List<ItemDTO> getAllItems(){
return modelMapper.map(
        itemRepo.findAll(),
        new TypeToken<List<ItemDTO>>(){}.getType()
    );
    }
}
