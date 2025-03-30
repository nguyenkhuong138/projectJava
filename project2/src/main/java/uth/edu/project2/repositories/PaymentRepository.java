package com.example.spa_management.repositories;

import com.example.spa_management.models.Payment;
import com.example.spa_management.models.PaymentStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface PaymentRepository extends JpaRepository<Payment, Long> {
    List<Payment> findByStatus(PaymentStatus status);
    List<Payment> findByBookingId(Long bookingId);
}
