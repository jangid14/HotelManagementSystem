package com.example.hotelmanagement.repository;

import com.example.hotelmanagement.model.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<Booking, Long> {
}
