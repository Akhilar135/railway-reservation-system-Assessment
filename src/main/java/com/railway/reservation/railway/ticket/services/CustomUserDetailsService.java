package com.railway.reservation.railway.ticket.services;

import com.railway.reservation.railway.ticket.dao.UserDao;
import com.railway.reservation.railway.ticket.sqlschema.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.Collections;

public class CustomUserDetailsService implements UserDetailsService {
    @Autowired
    UserDao userDao;
    @Override
    public UserDetails loadUserByUsername(String user_name) throws UsernameNotFoundException {
        User user = userDao.findByUserName(userName);
        return new org.springframework.security.core.userdetails.User(user.getUserName(),user.getPassWord(), Collections.EMPTY_LIST);
    }
}
