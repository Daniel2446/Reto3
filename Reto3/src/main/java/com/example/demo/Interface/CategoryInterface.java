
package com.example.demo.Interface;

import com.example.demo.Modelo.Category;
import org.springframework.data.repository.CrudRepository;
/**
 *
 * @author Daniel
 */
public interface CategoryInterface extends CrudRepository <Category, Integer>{
    
}