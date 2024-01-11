public class Car {


    public Car() {
    }

    public Car(String name, String model, String color) {
        this.name = name;
        this.model = model;
        this.color = color;
    }

    private String name; // название
    private String model; // модель
    private String color; // цвет

//  int number;
//  double number1;
//  boolean flag;


    public void drive() {
        System.out.println(name + " drive");
    }

    ;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void stop() {
        System.out.println(name + " stop");
    }

    public String showText() {
        return "test text";
    }


}
