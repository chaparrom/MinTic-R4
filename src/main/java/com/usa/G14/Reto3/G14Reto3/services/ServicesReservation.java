/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.usa.G14.Reto3.G14Reto3.services;

import com.usa.G14.Reto3.G14Reto3.model.Reservation;
import com.usa.G14.Reto3.G14Reto3.repository.RepositoryReservation;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author edgarchaparro
 */
@Service
public class ServicesReservation {
    
    @Autowired
    private RepositoryReservation metodCrud;
    
    public List<Reservation> getAll(){
        return metodCrud.getAll();
    }
    
    public Optional<Reservation> getReservation(int idReservation){
        return metodCrud.getReservation(idReservation);
    }
    
    public Reservation save(Reservation reservation){
        if(reservation.getIdReservation()==null){
            return metodCrud.save(reservation);
        }
        else {
            Optional<Reservation> evt=metodCrud.getReservation(reservation.getIdReservation());
            if(evt.isEmpty()){
                return metodCrud.save(reservation);
            }
            else{
                return(reservation);
            }
        }
    }
    
}
