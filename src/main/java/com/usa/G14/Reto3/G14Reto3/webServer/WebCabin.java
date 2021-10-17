/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.usa.G14.Reto3.G14Reto3.webServer;

import java.util.List;
import java.util.Optional;
import com.usa.G14.Reto3.G14Reto3.model.Cabin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import com.usa.G14.Reto3.G14Reto3.services.ServicesCabin;

/**
 *
 * @author edgarchaparro
 */

@RestController
@RequestMapping("/api/Cabin")
public class WebCabin {
    @GetMapping("/holaMundo")
    public String saludar(){
        return "Hola Mundo";
    }
    
    @Autowired
    private ServicesCabin services;
    @GetMapping("/all")
    public List<Cabin> getCabin(){
        return services.getAll();
    }
    
    @GetMapping("/{id}")
    public Optional<Cabin> getCabin(@PathVariable("id") int idCabin){
        return services.getCabin(idCabin);
    }
    
    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Cabin save(@RequestBody Cabin cabin){
        return services.save(cabin);
    }
}
