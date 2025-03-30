package uth.edu.project2.models;
import jakarta.persistence.*;
@Entity
@Table(name="specialists")
public class Specialist {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String specialization; // Ví dụ: Chuyên về peel da, điều trị mụn, trẻ hóa da.
    private int experienceYears;

}
