package lk.ijse_13.Spring_Boot.DTO;

public class PlaceOrderDTO {
    private int oid;
    CustomerDTO customerDTO;
    ItemDTO itemDTO;
    private int qty;
    private double total;

    public PlaceOrderDTO() {
    }

    public PlaceOrderDTO(int oid, CustomerDTO customerDTO, ItemDTO itemDTO, int qty, double total) {
        this.oid = oid;
        this.customerDTO = customerDTO;
        this.itemDTO = itemDTO;
        this.qty = qty;
        this.total = total;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public int getOid() {
        return oid;
    }

    public void setOid(int oid) {
        this.oid = oid;
    }

    public CustomerDTO getCustomerDTO() {
        return customerDTO;
    }

    public void setCustomerDTO(CustomerDTO customerDTO) {
        this.customerDTO = customerDTO;
    }

    public ItemDTO getItemDTO() {
        return itemDTO;
    }

    public void setItemDTO(ItemDTO itemDTO) {
        this.itemDTO = itemDTO;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }
}
