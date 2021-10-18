package lesson_1_2;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Car car1 = new Lorry(new Engine(), "Lada", "red");
        Car car2 = new LightWeightCar(new Engine(), "Volga", "blue");
        List<Car> cars = new ArrayList<>();
        cars.add(car1);
        cars.add(car2);
        for (Car car : cars ) {
            CarCondition carCondition = new CarCondition(car);
            carCondition.open();
            carCondition.start();
            carCondition.move();
            carCondition.stop();
        }
    }
}
