package com.railway.reservation.railway.ticket.controllers;

import com.railway.reservation.railway.ticket.services.TrainService;
import com.railway.reservation.railway.ticket.sqlschema.Train;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TrainController {

@Autowired
    private TrainService trainService;
@PostMapping("/addTrain")
public String addTrain(@RequestBody List<Train> trains)
{
    return trainService.addTrain(trains);
}
}
