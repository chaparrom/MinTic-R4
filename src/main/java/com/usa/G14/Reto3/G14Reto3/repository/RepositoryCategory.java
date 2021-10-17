/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.usa.G14.Reto3.G14Reto3.repository;

import com.usa.G14.Reto3.G14Reto3.model.Cabin;
import com.usa.G14.Reto3.G14Reto3.model.Category;
import com.usa.G14.Reto3.G14Reto3.interfaces.InterfaceCabin;
import com.usa.G14.Reto3.G14Reto3.interfaces.InterfaceCategory;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author edgarchaparro
 */
@Repository
public class RepositoryCategory {

    @Autowired
    private InterfaceCategory crud;
    
    public List<Category> getAll(){
        return (List<Category>) crud.findAll();
    }
    
    public Optional <Category> getCategory(int id) {
        return crud.findById(id);
    }
    
    public Category save(Category category){
        return crud.save(category);
    }
}
