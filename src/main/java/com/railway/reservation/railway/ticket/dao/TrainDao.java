package com.railway.reservation.railway.ticket.dao;

import com.railway.reservation.railway.ticket.sqlschema.Train;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TrainDao extends JpaRepository<Train, Integer> {
}
