package com.thiagodd.tscatalog.resources;


import com.thiagodd.tscatalog.entities.Category;
import java.util.ArrayList;
import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/categories")
public class CategoryResource {

    @GetMapping
    public ResponseEntity<List<Category>> findAll(){
        List<Category> categoryList = new ArrayList<>();
        categoryList.add(new Category(1L, "Books"));
        categoryList.add(new Category(2L, "Electronics"));
        return ResponseEntity.ok().body(categoryList);
    }

}
