package com.gmail.lizaiatsenko;

import org.junit.Assert;
import org.junit.Test;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by liza on 21/03/2017.
 */
public class Main {
    public static void main(String[] args){
//        Dog dog= new Dog(3, "dog" , true);
//        Cat cat= new Cat(2, "cat" , 15);
//        Dog dog2= new Dog(4, "dog2" , true);
//        Cat cat2= new Cat(1, "cat2" , 15);

        ContInf contInfLiza= new ContInf(223232, "ggm@mail");
        ContInf contInfLiza2= new ContInf(443232, "aaaaa@mail");
        ContInf contInfLola= new ContInf(35677, "somamail");

        List<ContInf> contlistLiza= new ArrayList<ContInf>();
        contlistLiza.add(contInfLiza);
        contlistLiza.add(contInfLiza2);

        List<ContInf> contlistLola= new ArrayList<ContInf>();
        contlistLola.add(contInfLola);

        Person liza= new Person("liza", 20, contlistLiza );
        Person lola= new Person("lola", 23, contlistLola);

        EntityManager manager= Persistence.createEntityManagerFactory("jpapractice")
                .createEntityManager();
        EntityTransaction transaction= manager.getTransaction();
        transaction.begin();
//        manager.persist(contInfLiza);
//        manager.persist(contInfLiza2);
        manager.persist(liza);
//        manager.persist(contInfLola);
        manager.persist(lola);
        transaction.commit();

        EntityTransaction transaction2= manager.getTransaction();
        transaction2.begin();
       Query query1= manager.createQuery("UPDATE Person c set c.age =33 where c.age= 20");
       query1.executeUpdate();
       transaction2.commit();

       Query query2= manager.createQuery("select c from Person c, ContInf i");
        List<Person> personList= query2.getResultList();
        for (Person p:personList) {
            System.out.println(p.name + " age "+ p.age);
        }


//        manager.merge(cat2);
//        transaction.commit();
//        EntityTransaction transaction2= manager.getTransaction();
//        transaction2.begin();
//        manager.merge(dog);
//        transaction2.commit();

//        CarService service = new CarService();
//        Car car1 = new Car();
//        car1.setName("Citroen‎");
//        car1.setCost(30000);
//        car1.setReleaseDate(new Date());
//        Car car = service.addCar(car1);
//
//        //Получние с БД Citroen‎
//        Car carFromDB = service.getCar(car.getId());
//        System.out.println(carFromDB);
    }
}
