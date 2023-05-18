package com.railway.reservation.railway.ticket;

import com.railway.reservation.railway.ticket.dao.UserDao;
import com.railway.reservation.railway.ticket.sqlschema.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@SpringBootApplication
public class Application {
	@Autowired
	private UserDao userdao;
	@PostConstruct
	public void initUsers(){
		List<User> users = Stream.of(
				new User(1,"Akhila","akhila@1","Admin",null),
				new User(2,"Karthik","karti@12","User",null)
		).collect(Collectors.toList());
		userdao.saveAll(users);
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
