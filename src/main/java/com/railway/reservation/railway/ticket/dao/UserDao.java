package com.railway.reservation.railway.ticket.dao;

import com.railway.reservation.railway.ticket.sqlschema.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User, Integer> {
}
