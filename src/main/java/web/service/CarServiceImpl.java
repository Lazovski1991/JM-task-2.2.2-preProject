package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    @Override
    public List<Car> getCar(int count) {
        List<Car> cars = Car.cars;
        if (count >= 5) {
            return cars;
        }
        return cars.subList(0, count);
    }
}
