/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.usa.G14.Reto3.G14Reto3.services;

import java.util.List;
import java.util.Optional;
import com.usa.G14.Reto3.G14Reto3.model.Cabin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.usa.G14.Reto3.G14Reto3.repository.RepositoryCabin;

/**
 *
 * @author edgarchaparro
 */
@Service
public class ServicesCabin {
    
    @Autowired
    private RepositoryCabin metodCrud;
    
    public List<Cabin> getAll(){
        return metodCrud.getAll();
    }
    
    public Optional<Cabin> getCabin(int idCabin){
        return metodCrud.getCabin(idCabin);
    }
    
    public Cabin save(Cabin cabin){
        if(cabin.getId()==null){
            return metodCrud.save(cabin);
        }
        else {
            Optional<Cabin> evt=metodCrud.getCabin(cabin.getId());
            if(evt.isEmpty()){
                return metodCrud.save(cabin);
            }
            else{
                return(cabin);
            }
        }
    }
}
