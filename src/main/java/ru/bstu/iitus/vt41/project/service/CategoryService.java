package ru.bstu.iitus.vt41.project.service;

import ru.bstu.iitus.vt41.project.entity.Category;

import java.util.List;

public interface CategoryService {
    Category addCategory(Category category);
    void delete(long id);
    List<Category> getAll();
    //Category updateCategory(Category category);
}
