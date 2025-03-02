package lk.ijse_13.Spring_Boot.DTO;

import java.util.List;

public class PlaceOrderDTO {
    CustomerDTO customerDTO;
    List<ItemDTO> itemDTOS;

    public PlaceOrderDTO() {
    }

    public PlaceOrderDTO(CustomerDTO customerDTO, List<ItemDTO> itemDTOS, double total) {
        this.customerDTO = customerDTO;
        this.itemDTOS = itemDTOS;
    }

    public CustomerDTO getCustomerDTO() {
        return customerDTO;
    }

    public void setCustomerDTO(CustomerDTO customerDTO) {
        this.customerDTO = customerDTO;
    }

    public List<ItemDTO> getItemDTOS() {
        return itemDTOS;
    }

    public void setItemDTOS(List<ItemDTO> itemDTOS) {
        this.itemDTOS = itemDTOS;
    }

    @Override
    public String toString() {
        return "PlaceOrderDTO{" +
                "customerDTO=" + customerDTO +
                ", itemDTOS=" + itemDTOS +
                '}';
    }
}