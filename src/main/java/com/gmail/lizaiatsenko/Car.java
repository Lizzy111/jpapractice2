package com.gmail.lizaiatsenko;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by liza on 21/03/2017.
 */

@Entity
@Table
@NamedQuery(name = "Car.getAll", query = "Select c from Car c ")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;

    @Column
    private String name;      //Название авто

    @Column
    @Temporal(TemporalType.TIMESTAMP)
    private Date releaseDate; //дата выпуска

    @Column
    private float cost;       //стоимость

    public Car(String name, Date releaseDate, float cost) {
        this.name = name;
        this.releaseDate = releaseDate;
        this.cost = cost;
    }

    public Car() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", releaseDate=" + releaseDate +
                ", cost=" + cost +
                '}';
    }
}
