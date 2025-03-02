package lk.ijse_13.Spring_Boot.controller;

import lk.ijse_13.Spring_Boot.DTO.ItemDTO;
import lk.ijse_13.Spring_Boot.service.ItemServiceImpl;
import lk.ijse_13.Spring_Boot.util.ResponseUtil;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/items")
@CrossOrigin(origins = "*")
public class ItemController {
    @Autowired
    private ItemServiceImpl itemService;

    @PostMapping(path = "save")
    public ResponseUtil saveItem(@RequestBody ItemDTO itemDto){
        itemService.saveItem(itemDto);
        return new ResponseUtil(201, "Item saved",null);
    }
    @PutMapping(path = "update")
    public ResponseUtil updateItem(@RequestBody ItemDTO itemDto){
        System.out.println("Item dto : " + itemDto.getItemId());
        System.out.println("Item dto : " + itemDto.getName() +" " + itemDto.getPrice() + " " + itemDto.getQty());
           itemService.updateItem(itemDto);
           return new ResponseUtil(201, "Item saved",null);
    }

    @GetMapping(path = "getAll")
    public ResponseUtil getAllItems(){
        List<ItemDTO> allItems = itemService.getAllItems();
        return new ResponseUtil(200, "Success", allItems);
    }

    @DeleteMapping(path = "delete", params = "id")
    public ResponseUtil deleteItem(@RequestParam("id") int id){
        itemService.deleteItem(id);
        return new ResponseUtil(200, "Item deleted", null);
    }
}
