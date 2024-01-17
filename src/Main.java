//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Engine engine = new Engine(10);

        Car car = new Car(10, engine);
        car.setEngine(engine);

        System.out.println("car.getEngine().getVolume = " + car.getEngine().getVolume());


    }
}