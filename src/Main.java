//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Car nissan = new Car("nissan" , "sedan" , "black" , 355);

//        BMW.setColor("blue");
//        BMW.setName("BMW 5");
//        BMW.setModel("e39");
//
//        BMW.drive();

        nissan.setColor("blue");
        nissan.setName("nissan");
        nissan.setModel("sedan");


        nissan.drive();
        int result = nissan.sumNambers(1, 5);

        System.out.println("result = " + result);
//        System.out.println(nissan.getName() );

//        System.out.println(BMW.getName());


    }
}