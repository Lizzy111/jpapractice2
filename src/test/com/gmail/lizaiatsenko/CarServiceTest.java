package com.gmail.lizaiatsenko;

import org.junit.Assert;
import org.junit.Test;

import java.util.Date;
import java.util.List;

public class CarServiceTest {
    CarService service = new CarService();

    @Test
    public void getCar() throws Exception {
        Car car1 = new Car();
        car1.setName("Citroen‎");
        car1.setCost(30000);
        car1.setReleaseDate(new Date());

        //Записываем в БД
        Car car = service.addCar(car1);

        //Получние с БД Citroen‎
        Car carFromDB = service.getCar(car.getId());
        System.out.println(carFromDB);

    }

    @Test
    public void deleteCar() throws Exception {
        Car car1 = new Car();
        car1.setName("Ferrari");
        car1.setCost(100000);
        car1.setReleaseDate(new Date());

        //Записуем его в БД
        Car car = service.addCar(car1);

        //Удвлем его с БД
        service.deleteCar(car.getId());
    }

    @Test
    public void addCar() throws Exception {
        Car car1 = new Car();
        car1.setName("BMW");
        car1.setCost(20000);
        car1.setReleaseDate(new Date());

        //Записали в БД
        Car car = service.addCar(car1);

        //Вывели записанную в БД запись
        System.out.println(car);
    }

    @Test
    public void getAll() throws Exception {
//Создаем автомобиль для записи в БД
        Car car1 = new Car();
        car1.setName("Lexus");
        car1.setCost(300000);
        car1.setReleaseDate(new Date());

        //Создаем автомобиль для записи в БД
        Car car2 = new Car();
        car2.setName("Fiat");
        car2.setCost(20000);
        car2.setReleaseDate(new Date());

        //Создаем автомобиль для записи в БД
        Car car3 = new Car();
        car3.setName("Porsche");
        car3.setCost(458000);
        car3.setReleaseDate(new Date());

        //Сохраняем все авто
        service.addCar(car1);
        service.addCar(car2);
        service.addCar(car3);

        //Получаем все авто с БД
        List<Car> cars = service.getAll();

        //Выводим полученый список авто
        for (Car c : cars) {
            System.out.println(c);
        }
    }
}
