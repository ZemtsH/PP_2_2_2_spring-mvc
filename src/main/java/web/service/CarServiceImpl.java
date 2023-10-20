package web.service;

import org.springframework.stereotype.Service;
import web.models.Car;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {
    private List<Car> carList = Arrays.asList(new Car(1, "model1", "country1"),
            new Car(2, "model2", "country2"),
            new Car(3, "model3", "country3"),
            new Car(4, "model4", "country4"),
            new Car(5, "model5", "country5"));

    @Override
    public List<Car> getCars(int count) {
        if (count >= 1 && count <5) {
            ArrayList<Car> newList = new ArrayList<>();
            for (int i = 0; i < count; i ++) {
                newList.add(carList.get(i));
            }
            return newList;
        } else {
            return carList;
        }
    }
}