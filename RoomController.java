package com.example.hotelmanagement.controller;

import com.example.hotelmanagement.model.Room;
import com.example.hotelmanagement.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RoomController {
    @Autowired
    private RoomService roomService;

    @GetMapping("/rooms")
    public String getRooms(Model model) {
        model.addAttribute("rooms", roomService.getAllRooms());
        return "room-list";
    }
}
