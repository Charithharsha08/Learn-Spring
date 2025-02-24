package lk.ijse_13.Spring_Boot.service;

import lk.ijse_13.Spring_Boot.DTO.ItemDTO;

import java.util.List;

public interface ItemService {
    boolean saveItem(ItemDTO itemDTO);
    boolean deleteItem(int id);
    boolean updateItem(ItemDTO itemDTO);
    List<ItemDTO> getAllItems();
}
