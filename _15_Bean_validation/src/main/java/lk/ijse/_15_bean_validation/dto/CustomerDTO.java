package lk.ijse._15_bean_validation.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public class CustomerDTO {
    @NotBlank(message = "Name is required")
    @Pattern(regexp = "^[A-Za-z]+$", message = "Name must contain only letters and spaces")
    @Size(min = 3, max = 50, message = "Name must contain 3-50 characters")
    private String name;
    @Email(message = "Invalid email")
    private String email;
    @Pattern(regexp = "^[0-9]{10}$", message = "Invalid phone number")
    public String phoneNumber;

    public CustomerDTO(String name, String email, String phoneNumber) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
