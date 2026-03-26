package cl.duoc.felipromeroa.tickets.service;

import cl.duoc.felipromeroa.tickets.model.Category;
import cl.duoc.felipromeroa.tickets.repository.CategoryRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class CategoryService {
    private CategoryRepository categoryRepository;

    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    public List<Category> getCategories() {
        return this.categoryRepository.getAll();
    }

    public Category create(Category category) {
        return this.categoryRepository.save(category);
    }
}
