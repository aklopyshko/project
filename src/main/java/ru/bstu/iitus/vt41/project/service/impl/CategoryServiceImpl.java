package ru.bstu.iitus.vt41.project.service.impl;

import org.springframework.stereotype.Service;
import ru.bstu.iitus.vt41.project.entity.Category;
import ru.bstu.iitus.vt41.project.repository.CategoryRepository;
import ru.bstu.iitus.vt41.project.service.CategoryService;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {
    private CategoryRepository categoryRepository;

    @Override
    public Category addCategory(Category category) {
        Category savedCategory = categoryRepository.saveAndFlush(category);
        return savedCategory;
    }

    @Override
    public void delete(long id) {
categoryRepository.delete(id);
    }

    @Override
    public List<Category> getAll() {
        return categoryRepository.findAll();
    }
}
