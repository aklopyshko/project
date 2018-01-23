package ru.bstu.iitus.vt41.project.entity;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
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
    @Column(name="categoryId")
    private long categoryId;
    //дополнить
    @Column(name="square")
    private long square;
    @Column(name="bet")
    private long bet;
    @Column(name="timetoend")
    private Time time;
    //id текущего победителя
    @Column(name="winnerId")
    private long winner;
}
