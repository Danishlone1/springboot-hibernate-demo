package comm.example.model;

import lombok.Data;
import lombok.extern.apachecommons.CommonsLog;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Data
@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NotNull(message = "Field cannot be empty")
    @Size(min=1, message="is required")
    @Column(name = "first_name")
    private String firstName;
    @NotNull(message = "Field cannot be empty")
    @Size(min=1, message="is required")
    @Column(name = "last_name")
    private String lastName;
    @NotNull(message = "Field cannot be empty")
    @Email(message="Please provide a valid email address")
    @Pattern(regexp=".+@.+\\..+", message="write email as name@email.com")
    @Column(name = "email")
    private String email;
}