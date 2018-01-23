package ru.bstu.iitus.vt41.project.controller;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//категории недвижимости
@Controller
@RequestMapping("/category/getcats")
public class CategoryController {
@RequestMapping(method = RequestMethod.GET)
    public String getCategories() { return null;}
}
