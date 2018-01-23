package ru.bstu.iitus.vt41.project.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;
// id, name
@Entity
@Setter
@Getter
@Table(name="category")
public class Category {
    @Id
    @Column(name="id")
    private long id;
    @Column(name="name")
    private String name;
}
