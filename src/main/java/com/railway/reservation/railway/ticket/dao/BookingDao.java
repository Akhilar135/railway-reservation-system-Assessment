package com.railway.reservation.railway.ticket.dao;

import com.railway.reservation.railway.ticket.sqlschema.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingDao extends JpaRepository<Booking, Integer> {
}
