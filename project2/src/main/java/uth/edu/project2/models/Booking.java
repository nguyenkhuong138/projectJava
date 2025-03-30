package uth.edu.project2.models;
import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name="bookings")

public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private User customer;

    @ManyToOne
    @JoinColumn(name = "service_id")
    private Service service;

    @ManyToOne
    @JoinColumn(name = "specialist_id", nullable = true) // Có thể để trống nếu khách không chọn chuyên viên
    private Specialist specialist;

    private LocalDateTime bookingTime; // Thời gian đặt lịch
    private BookingStatus status; // PENDING, CONFIRMED, COMPLETED, CANCELED

    public enum BookingStatus {
        PENDING, CONFIRMED, COMPLETED, CANCELED;
    }
}
