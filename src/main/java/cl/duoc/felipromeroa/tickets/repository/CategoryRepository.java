package cl.duoc.felipromeroa.tickets.repository;

import cl.duoc.felipromeroa.tickets.model.Category;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CategoryRepository {
    List<Category> categories;
    Long currentId = 3L;
    public CategoryRepository(){
        categories = new ArrayList<>();
        categories.add(new Category(
            currentId++,
            "Bug",
            "Problema o error que afecta el funcionamiento esperado"
        ));
        categories.add(new Category(
            currentId++,
            "Feature",
            "Nueva funcionalidad solicitada por el usuario"
        ));
    }

    public List<Category> getAll() {
        return categories;
    }

    public Category save(Category newCategory){
        newCategory.setId(currentId);
        categories.add(newCategory);
        return newCategory;
    }
}
