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
public class Booking {
    @Id
    private int bookingId;
    private String source;
    private String destination;
    private String tClass;
    private int seatNo;

    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name="userId", nullable = false)
    private User user;

    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name="trainId", nullable = false)
    private Train train;
}
