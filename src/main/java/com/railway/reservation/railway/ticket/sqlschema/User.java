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
public class User {
    @Id
   private int userId;
   private String userName;
   private String passWord;
   boolean Admin;

   @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL,mappedBy = "user")
   private Booking booking;
}
