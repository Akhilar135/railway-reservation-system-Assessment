package com.railway.reservation.railway.ticket.services;

import com.railway.reservation.railway.ticket.sqlschema.Booking;

import java.util.List;
import java.util.Optional;

public interface BookingService {
    String bookSeat(List<Booking> bookings);


    Optional<Booking> getBookingsById(int userId);

}
