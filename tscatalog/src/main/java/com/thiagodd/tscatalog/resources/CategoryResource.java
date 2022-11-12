package com.thiagodd.tscatalog.resources;


import com.thiagodd.tscatalog.entities.Category;
import com.thiagodd.tscatalog.services.CategoryService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/categories")
public class CategoryResource {

    @Autowired
    private CategoryService service;

    @GetMapping
    public ResponseEntity<List<Category>> findAll(){
        List<Category> categoryList = service.findAll();
        return ResponseEntity.ok().body(categoryList);
    }

}
