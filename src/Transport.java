
// класс общего поведения для всех транспортов
public class Transport {

    // свойства/поля
    private String name; // название
    private String model; // модель
    private String color; // цвет
    public String getName() {
        return name;
    }

    // get/set для свойств обьякта
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


    // бизнес методы
    public void drive() {
        System.out.println("drive transport");
    }

    public void stop() {
        System.out.println("stop transport");
    }



}
