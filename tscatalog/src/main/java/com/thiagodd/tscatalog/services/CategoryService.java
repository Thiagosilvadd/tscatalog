package com.thiagodd.tscatalog.services;

import com.thiagodd.tscatalog.entities.Category;
import com.thiagodd.tscatalog.repositories.CategoryRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository repository;

    public List<Category> findAll(){
        return repository.findAll();
    }
}
