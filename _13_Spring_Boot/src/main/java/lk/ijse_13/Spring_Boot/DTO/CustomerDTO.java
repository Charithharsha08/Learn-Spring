package lk.ijse_13.Spring_Boot.DTO;


public class CustomerDTO {
    private int customerId;
    private String name;
    private String address;
    private int age;

    public CustomerDTO() {
    }

    public CustomerDTO(int customerId, String name, String address, int age) {
        this.customerId = customerId;
        this.name = name;
        this.address = address;
        this.age = age;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "CustomerDTO{" +
                "customerId=" + customerId +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", age=" + age +
                '}';
    }
}
