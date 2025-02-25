package lk.ijse_13.Spring_Boot.embeded;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class OrderDetailPK implements Serializable {

    private int customerId;
    private int itemId;

    public OrderDetailPK() {}

    public OrderDetailPK(int customerId, int itemId) {
        this.customerId = customerId;
        this.itemId = itemId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderDetailPK that = (OrderDetailPK) o;
        return customerId == that.customerId && itemId == that.itemId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(customerId, itemId);
    }

}