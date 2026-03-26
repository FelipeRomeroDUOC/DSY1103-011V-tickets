package cl.duoc.felipromeroa.tickets.controller;

import cl.duoc.felipromeroa.tickets.model.Category;
import cl.duoc.felipromeroa.tickets.service.CategoryService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/categories")
public class CategoryController {
    private CategoryService categoryService;

    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping
    public List<Category> getAllCategories() {
        return ResponseEntity.ok(categoryService.getCategories()).getBody();
    }

    @PostMapping
    public Category create(@RequestBody Category category) {
        return ResponseEntity.status(HttpStatus.CREATED).body(categoryService.create(category)).getBody();
    }
}
