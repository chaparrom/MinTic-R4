/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.usa.G14.Reto3.G14Reto3.interfaces;

import com.usa.G14.Reto3.G14Reto3.model.Category;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author edgarchaparro
 */
public interface InterfaceCategory extends CrudRepository<Category, Integer> {
    
}
