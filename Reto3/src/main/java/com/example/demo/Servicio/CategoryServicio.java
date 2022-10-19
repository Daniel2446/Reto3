
package com.example.demo.Servicio;

import com.example.demo.Modelo.Category;
import com.example.demo.Repositorio.CategoryRepositorio;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Daniel
 */
@Service
public class CategoryServicio {
    @Autowired
    private CategoryRepositorio categoryRepositorio;
    
     public List<Category> getAll() {
        return categoryRepositorio.getAll();
    }

    public Optional<Category> getGama(int categoryId) {
        return categoryRepositorio.getCategory(categoryId);
    }

    public Category save(Category category) {
        if (category.getId() == null) {
            return categoryRepositorio.save(category);
        } else {
            Optional<Category> e = categoryRepositorio.getCategory(category.getId());
            if (e.isEmpty()) {
                return categoryRepositorio.save(category);
            } else {
                return category;
            }
        }
    }
}
