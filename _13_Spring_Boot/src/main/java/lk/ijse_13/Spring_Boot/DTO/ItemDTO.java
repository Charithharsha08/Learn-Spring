package lk.ijse_13.Spring_Boot.DTO;

public class ItemDTO {
    private int itemId;
    private String name;
    private double price;
    private int qty;

    public ItemDTO() {
    }

    public ItemDTO(int itemId, String name, double price, int qty) {
        this.itemId = itemId;
        this.name = name;
        this.price = price;
        this.qty = qty;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }


}
