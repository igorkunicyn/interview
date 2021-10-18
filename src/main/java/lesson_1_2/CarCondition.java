package lesson_1_2;

public class CarCondition implements Moveable, Stoppable{
    private final Car car;

    public CarCondition(Car car) {
        this.car = car;
    }

    @Override
    public void move() {
        System.out.println(car.getName() + "  is moving");
    }

    @Override
    public void stop() {
        System.out.println(car.getName() + "  is stopping");
    }

    public void open() {
        System.out.println(car.getName() + "  is opening");
    }

    public void start() {
        System.out.println(car.getName() + "  is starting");
    }

}
