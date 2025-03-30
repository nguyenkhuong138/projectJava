package uth.edu.project2.models;
import jakarta.persistence.*;
@Entity
@Table(name="reviews")
public class Review { @Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private User customer;

    @ManyToOne
    @JoinColumn(name = "service_id")
    private Service service;

    private int rating; // 1-5 sao
    private String comment;
}
