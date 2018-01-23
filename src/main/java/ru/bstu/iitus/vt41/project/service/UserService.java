package ru.bstu.iitus.vt41.project.service;

import ru.bstu.iitus.vt41.project.entity.User;

public interface UserService {
    void save (User user);
    User findByName(String name);
}
