package ru.bstu.iitus.vt41.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ru.bstu.iitus.vt41.project.entity.Property;

//недвижимость
@Controller
@RequestMapping("/property")
public class PropertyController {
    @RequestMapping(method = RequestMethod.GET)
    public Property getProperty() { return null;}
}
