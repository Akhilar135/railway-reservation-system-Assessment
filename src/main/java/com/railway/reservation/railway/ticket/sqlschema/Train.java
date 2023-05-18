package com.railway.reservation.railway.ticket.sqlschema;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Train {
    @Id
    private int trainId;
    private String trainName;
    private String source;
    private String destination;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL,mappedBy = "train")
    private Booking booking;
}
