/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.usa.G14.Reto3.G14Reto3.services;

import com.usa.G14.Reto3.G14Reto3.model.Client;
import com.usa.G14.Reto3.G14Reto3.repository.RepositoryClient;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author edgarchaparro
 */
@Service
public class ServicesClient {
    @Autowired
    private RepositoryClient metodCrud;
    
    public List<Client> getAll(){
        return metodCrud.getAll();
    }
    
    public Optional<Client> getClient(int idClient){
        return metodCrud.getClient(idClient);
    }
    
    public Client save(Client client){
        if(client.getIdClient()==null){
            return metodCrud.save(client);
        }
        else {
            Optional<Client> evt=metodCrud.getClient(client.getIdClient());
            if(evt.isEmpty()){
                return metodCrud.save(client);
            }
            else{
                return(client);
            }
        }
    }
    
    
}
