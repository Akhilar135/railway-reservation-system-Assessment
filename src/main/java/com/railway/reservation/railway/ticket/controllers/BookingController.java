package com.railway.reservation.railway.ticket.controllers;

import com.railway.reservation.railway.ticket.services.BookingService;
import com.railway.reservation.railway.ticket.sqlschema.Booking;
import com.railway.reservation.railway.ticket.sqlschema.Train;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class BookingController {
    @Autowired
    private BookingService bookingService;

    @PostMapping("/bookSeat")
    public String bookSeat(@RequestBody List<Booking> bookings)
    {
        return bookingService.bookSeat(bookings);
    }
    @GetMapping("/getBooking/{userId}")
    public Optional<Booking> getBookingsById(@PathVariable int userId){
        return bookingService.getBookingsById(userId);
    }
}
