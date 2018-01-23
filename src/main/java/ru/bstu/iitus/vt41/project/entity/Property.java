package ru.bstu.iitus.vt41.project.entity;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.sql.Time;

@Entity
@Setter
@Getter
@Table(name="Property")
public class Property {
    @Id
    @Column(name="id")
    private long id;
    @Column(name="name")
    private String name;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "category_id", nullable = false)
    private Category category;
    //дополнить
    @Column(name="square")
    private long square;
    @Column(name="bet")
    private long bet;
    @Column(name="timetoend")
    private Time time;
    //id текущего победителя
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="winner_id")
    private User user;
}
