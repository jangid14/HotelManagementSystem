package com.example.hotelmanagement.controller;

import com.example.hotelmanagement.model.Booking;
import com.example.hotelmanagement.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BookingController {
    @Autowired
    private BookingService bookingService;

    @PostMapping("/bookRoom")
    public String bookRoom(Booking booking) {
        bookingService.createBooking(booking);
        return "redirect:/rooms";
    }
}
