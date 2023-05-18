package com.railway.reservation.railway.ticket.services;

import com.railway.reservation.railway.ticket.dao.TrainDao;
import com.railway.reservation.railway.ticket.dao.UserDao;
import com.railway.reservation.railway.ticket.sqlschema.Train;
import com.railway.reservation.railway.ticket.sqlschema.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public String addUser(List<User> user) {
        userDao.saveAll(user);
        return "User added successfully";
    }
}
