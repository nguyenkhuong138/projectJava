package uth.edu.project2.models;
import jakarta.persistence.*;
import java.time.LocalDateTime;
@Entity
@Table(name = "schedules")
public class Schedule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "specialist_id")
    private Specialist specialist;

    private LocalDateTime startTime;
    private LocalDateTime endTime;
}
