package ru.bstu.iitus.vt41.project.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

import org.hibernate.annotations.GenericGenerator;
@Getter
@Setter
@Entity
@Table(name="user")
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
    @OneToMany(fetch = FetchType.EAGER,  mappedBy = "user")
    @JsonIgnore
    //КАКАЯТО ЕЩЕ АННОТАЦИЯ
    private List<Property> properties;
    //@Column(name="currentBets")
    //private long[] bets;
}
