package com.project.shopapp;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/categories")
public class CategoryController {
    //Hiển thị tất cả categories
    @GetMapping("")  //http://localhost:8088/api/v1/categories
    public ResponseEntity<String> getAllCategories() {
        return ResponseEntity.ok("chào bạn, haha");
    }

    @PostMapping("")
    public ResponseEntity<String> insertCategories() {
        return ResponseEntity.ok("This is insert categories");
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> updateCategories(@PathVariable(name = "id") Long id) {
        return ResponseEntity.ok("This is update categories with id = " + id);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteCategories(@PathVariable(name = "id") Long id) {
        return ResponseEntity.ok("delete categories with id = " + id);
    }
}
