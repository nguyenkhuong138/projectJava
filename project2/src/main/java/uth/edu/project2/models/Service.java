package uth.edu.project2.models;
import jakarta.persistence.*;

@Entity
@Table(name="Services")
public class Service {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private String description;
    private double price;

}
