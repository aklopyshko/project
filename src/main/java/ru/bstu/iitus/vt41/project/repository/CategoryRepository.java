package ru.bstu.iitus.vt41.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.bstu.iitus.vt41.project.entity.Category;
@Repository
public interface CategoryRepository extends JpaRepository<Category,Long> {

}
