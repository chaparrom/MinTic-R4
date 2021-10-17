/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.usa.G14.Reto3.G14Reto3.repository;

import java.util.List;
import java.util.Optional;
import com.usa.G14.Reto3.G14Reto3.model.Cabin;
import com.usa.G14.Reto3.G14Reto3.interfaces.InterfaceCabin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author edgarchaparro
 */
@Repository
public class RepositoryCabin {
    @Autowired
    private InterfaceCabin crud;
    
    public List<Cabin> getAll(){
        return (List<Cabin>) crud.findAll();
    }
    
    public Optional <Cabin> getCabin(int id) {
        return crud.findById(id);
    }
    
    public Cabin save(Cabin cabin){
        return crud.save(cabin);
    }
    
}
