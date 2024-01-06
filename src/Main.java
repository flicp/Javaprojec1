//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Car BMW = new Car();

        BMW.color = "Blue";
        BMW.name = "BMW 5";
        BMW.model = "e39";
        BMW.drive();




        Car nissan = new Car();

        nissan.color = "black";
        nissan.name = "nissan 1";
        nissan.model = "sedan";
        nissan.drive();

        new Car();

//        System.out.println(nissan.color);
//
//        System.out.println(BMW.color);


    }
}