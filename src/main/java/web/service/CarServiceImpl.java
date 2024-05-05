package web.service;

import org.springframework.stereotype.Component;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarServiceImpl implements CarService {
    private static int CAR_ID;
    private final List<Car> carList;

    {
        carList = new ArrayList<>();

        carList.add(new Car(++CAR_ID, "Honda", 12345));

        carList.add(new Car(++CAR_ID, "Lada", 78961));

        carList.add(new Car(++CAR_ID, "BMW", 23456));

        carList.add(new Car(++CAR_ID, "Suzuki", 34567));

        carList.add(new Car(++CAR_ID, "Toyota", 45678));
    }

    @Override
    public List<Car> getCarList(int count) {

        return carList.stream().filter(s -> s.getId() <= count).toList();
    }

}
