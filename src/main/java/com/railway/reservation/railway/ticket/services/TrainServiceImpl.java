package com.railway.reservation.railway.ticket.services;

import com.railway.reservation.railway.ticket.dao.TrainDao;
import com.railway.reservation.railway.ticket.sqlschema.Train;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class TrainServiceImpl implements TrainService{
@Autowired
    private TrainDao trainDao;
    @Override
    public String addTrain(List<Train> train) {
        trainDao.saveAll(train);
        return "Train added successfully";
    }
}
