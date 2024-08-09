package web.dao;

import org.springframework.stereotype.Component;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarDAO {
    private List<Car> cars;
    private List<Car> carsCount;

    {
        cars = new ArrayList<>();
        cars.add(new Car("car1"));
        cars.add(new Car("car2"));
        cars.add(new Car("car3"));
        cars.add(new Car("car4"));
        cars.add(new Car("car5"));
    }

    public List<Car> getCarByCount(int count) {
        return cars.stream().limit(count).collect(Collectors.toList());
    }
}
