package lk.ijse_13.Spring_Boot.controller;

import lk.ijse_13.Spring_Boot.DTO.ItemDTO;
import lk.ijse_13.Spring_Boot.service.ItemServiceImpl;
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
    public String saveItem(@RequestBody ItemDTO itemDto){
       boolean resultSet = itemService.saveItem(itemDto);
       return resultSet ? "Success" : "failed";
    }
    @PutMapping(path = "update")
    public String updateItem(@RequestBody ItemDTO itemDto){
        boolean resultSet = itemService.updateItem(itemDto);
        return resultSet ? "Success" : "failed";
    }

    @GetMapping(path = "getAll")
    public List<ItemDTO> getAllItems(){
        List<ItemDTO> allItems = itemService.getAllItems();
        return allItems;
    }

    @DeleteMapping(path = "delete", params = "id")
    public String deleteItem(@RequestParam("id") int id){
        boolean resultSet = itemService.deleteItem(id);
        return resultSet ? "Success" : "failed";
    }
}
