package lk.ijse_13.Spring_Boot.service;

import lk.ijse_13.Spring_Boot.DTO.ItemDTO;

import java.util.List;

public interface ItemService {
    void saveItem(ItemDTO itemDTO);
    void deleteItem(int id);
    void updateItem(ItemDTO itemDTO);
    List<ItemDTO> getAllItems();
}
