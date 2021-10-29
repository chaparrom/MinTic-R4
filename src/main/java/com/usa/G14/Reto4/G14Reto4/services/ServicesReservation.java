/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.usa.G14.Reto4.G14Reto4.services;

import com.usa.G14.Reto4.G14Reto4.model.Reservation;
import com.usa.G14.Reto4.G14Reto4.repository.RepositoryReservation;
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

    public Reservation update(Reservation reservation){
        if(reservation.getIdReservation()!=null){
            Optional<Reservation> evt = metodCrud.getReservation(reservation.getIdReservation());
            if(!evt.isEmpty()){

                if(reservation.getStartDate()!=null){
                    evt.get().setStartDate(reservation.getStartDate());
                }
                if(reservation.getDevolutionDate()!=null){
                    evt.get().setDevolutionDate(reservation.getDevolutionDate());
                }
                if(reservation.getStatus()!=null){
                    evt.get().setStatus(reservation.getStatus());
                }
                if(reservation.getScore()!=null){
                    evt.get().setScore(reservation.getScore());
                }
                if(reservation.getCabin()!=null){
                    evt.get().setCabin(reservation.getCabin());
                }
                if(reservation.getClient()!=null){
                    evt.get().setClient(reservation.getClient());
                }
                metodCrud.save(evt.get());
                return evt.get();
            }
            else{
                return reservation;
            }
        }
        else{
            return reservation;
        }
    }

    public boolean delete(int idReservation) {
        Boolean result = getReservation(idReservation).map(reservation -> {
            metodCrud.delete(reservation);
            return true;
        }).orElse(false);
        return result;
    }
}
