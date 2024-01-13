//  все что умеет транспорт умеет и кар (доступный функционал)
public class Car extends Transport {

    public Car(String name, String model, String color) {
        super(name, model, color);
    }

    public Car(String name, String model, String color, int number) {
        super(name, model, color);
        this.number = number;
    }

    public Car(int number) {
        this.number = number;
    }

    public Car() { 
    }

    private int number;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void signal(){
        System.out.println("signal");
    }

    @Override
    public void drive() {
        super.drive();
        super.stop();
        System.out.println("drive car ");
    }

    @Override
    public void stop() {
        super.stop();
        System.out.println("stop car");
    }
}





