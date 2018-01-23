package ru.bstu.iitus.vt41.project.repository;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import ru.bstu.iitus.vt41.project.entity.Property;

import java.util.List;

public interface PropertyRepository extends JpaRepository<Property,Long> {
    Property findByName(@Param("nameToFind") String name);

    @Override
    List<Property> findAll();

    @Override
    List<Property> findAll(Sort name);
}
