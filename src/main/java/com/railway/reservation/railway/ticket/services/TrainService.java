package com.railway.reservation.railway.ticket.services;

import com.railway.reservation.railway.ticket.sqlschema.Train;

import java.util.List;

public interface TrainService {
    String addTrain(List<Train> train);
}
