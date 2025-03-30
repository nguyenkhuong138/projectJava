package uth.edu.project2.models;
import jakarta.persistence.*;
import java.util.List;
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String fullName;
    private String email;
    private String password;
    private String phoneNumber;

    @Enumerated(EnumType.STRING)
    private UserRole role; // CUSTOMER, STAFF, SPECIALIST, ADMIN

    @OneToMany(mappedBy = "customer")
    private List<Booking> bookings;

    public enum UserRole {
        CUSTOMER, STAFF, SPECIALIST, ADMIN;
    }
}
