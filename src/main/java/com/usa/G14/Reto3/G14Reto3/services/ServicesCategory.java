/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.usa.G14.Reto3.G14Reto3.services;

import com.usa.G14.Reto3.G14Reto3.model.Category;
import com.usa.G14.Reto3.G14Reto3.repository.RepositoryCategory;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author edgarchaparro
 */
@Service
public class ServicesCategory {
    @Autowired
    private RepositoryCategory metodCrud;
    
    public List<Category> getAll(){
        return metodCrud.getAll();
    }
    
    public Optional<Category> getCategory(int idCategory){
        return metodCrud.getCategory(idCategory);
    }
    
    public Category save(Category category){
        if(category.getId()==null){
            return metodCrud.save(category);
        }
        else {
            Optional<Category> evt=metodCrud.getCategory(category.getId());
            if(evt.isEmpty()){
                return metodCrud.save(category);
            }
            else{
                return(category);
            }
        }
    }
    
}
