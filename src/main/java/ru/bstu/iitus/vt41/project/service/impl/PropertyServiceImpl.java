package ru.bstu.iitus.vt41.project.service.impl;

import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import ru.bstu.iitus.vt41.project.entity.Property;
import ru.bstu.iitus.vt41.project.repository.PropertyRepository;
import ru.bstu.iitus.vt41.project.service.PropertyService;
import java.util.List;

@Service
public class PropertyServiceImpl implements PropertyService{
    PropertyRepository propertyRepository;

    @Override
    public Property addProperty(Property property) {
        Property savedProperty = propertyRepository.saveAndFlush(property);
        return savedProperty;
    }

    @Override
    public void delete(long id) {propertyRepository.delete(id);}

    @Override
    public Property editProperty(Property property) { return null; }

    @Override
    public Property findByName(String name) {return propertyRepository.findByName(name);}

    @Override
    public List<Property> findAll() {return propertyRepository.findAll();}

    public List<Property> findAll(Sort name){ return null;}
}
