package ru.bstu.iitus.vt41.project.service;

import org.springframework.data.domain.Sort;
import ru.bstu.iitus.vt41.project.entity.Property;

import java.util.List;

public interface PropertyService {
    Property addProperty(Property property);
    void delete(long id);
    Property editProperty(Property property);
    Property findByName(String name);
    List<Property> findAll();
    List<Property> findAll(Sort name);
    //сортировки
}
