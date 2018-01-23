package ru.bstu.iitus.vt41.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import ru.bstu.iitus.vt41.project.entity.User;
import org.springframework.transaction.annotation.Transactional;


@Transactional(readOnly=true)
//предописание методов
public interface UserRepository extends JpaRepository<User,Long> {
    User findByName(@Param("nameToFind") String name);
    //ВЫВЕСТИ ВСЕ СТАВКИ ПОЛЬЗОВАТЕЛЯ
}
