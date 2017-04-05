package com.gmail.lizaiatsenko;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.util.List;


/**
 * Created by liza on 21/03/2017.
 */
public class CarService {
    public EntityManager manager= Persistence.createEntityManagerFactory("jpapractice")
            .createEntityManager();

    public Car getCar(long id){
        return manager.find(Car.class, id);
    }

    public void deleteCar(long id){
        EntityTransaction transaction= manager.getTransaction();
        transaction.begin();
        manager.remove(getCar(id));
        transaction.commit();
    }

    public Car addCar(Car car){
        EntityTransaction transaction= manager.getTransaction();
        transaction.begin();
        Car carFromDB= manager.merge(car);
        transaction.commit();
        return carFromDB;
    }

    public List<Car> getAll(){
        TypedQuery<Car> namedQuery= manager.createNamedQuery("Car.getAll", Car.class);
        return  namedQuery.getResultList();
    }
}
