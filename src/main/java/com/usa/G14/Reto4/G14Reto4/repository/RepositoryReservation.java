/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.usa.G14.Reto4.G14Reto4.repository;

import com.usa.G14.Reto4.G14Reto4.interfaces.InterfaceReservation;
import com.usa.G14.Reto4.G14Reto4.model.Reservation;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author edgarchaparro
 */
@Repository
public class RepositoryReservation {
    @Autowired
    private InterfaceReservation crud;
    
    public List<Reservation> getAll(){
        return (List<Reservation>) crud.findAll();
    }
    
    public Optional <Reservation> getReservation(int id) {
        return crud.findById(id);
    }
    
    public Reservation save(Reservation reservation){
        return crud.save(reservation);
    }

    public void delete(Reservation reservation){
        crud.delete(reservation);
    }
    
}
