package com.railway.reservation.railway.ticket.services;

import com.railway.reservation.railway.ticket.dao.BookingDao;
import com.railway.reservation.railway.ticket.sqlschema.Booking;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
@Component
public class BookingServiceImpl implements BookingService{
    @Autowired
    private BookingDao bookingDao;
    @Override
    public String bookSeat(List<Booking> bookings) {
        bookingDao.saveAll(bookings);
        return "Successfully booked ticket";
    }

    @Override
    public Optional<Booking> getBookingById(int bookingId) {
        return bookingDao.findById(bookingId);
    }


}
