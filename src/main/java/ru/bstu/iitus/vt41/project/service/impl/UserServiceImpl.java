package ru.bstu.iitus.vt41.project.service.impl;

import org.springframework.stereotype.Service;
import ru.bstu.iitus.vt41.project.entity.User;
import ru.bstu.iitus.vt41.project.repository.UserRepository;
import ru.bstu.iitus.vt41.project.service.UserService;

//предописание методов выполняемых в User
@Service
public class UserServiceImpl implements UserService {
    UserRepository userRepository;

    @Override
    public void save(User user){userRepository.save(user);}

    @Override
    public User findByName(String name) {return userRepository.findByName(name);}
}
