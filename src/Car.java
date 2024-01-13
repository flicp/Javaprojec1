//  все что умеет транспорт умеет и кар (доступный функционал)
public class Car extends Transport {

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
}





