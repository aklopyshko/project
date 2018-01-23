package ru.bstu.iitus.vt41.project.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import org.hibernate.annotations.GenericGenerator;
@Getter
@Setter
@Entity
@Table(name="User")
public class User {
    @Id
    @Column(name="id")
    private long id;
    @Column(name="name")
    private String name;
    @Column(name="email")
    private String email;
    @Column(name="pass")
    private String password;
    @Column(name="role")
    private String role;
    //текушие ставки (Set)
}
