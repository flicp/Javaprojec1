//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Car car = new Car("a", "b", "c", 10);

        System.out.println("car.getColor() = " + car.getColor());
        System.out.println("car.getModel() = " + car.getModel());
        System.out.println("car.getName() = " + car.getName());
        System.out.println("car.getNumber() = " + car.getNumber());;
//        car.setName("BMW");
//        car.drive();


    }
}