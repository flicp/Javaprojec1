public class Motorbike extends Transport {

    public Motorbike() {
    }

    public Motorbike(String name, String model, String color, double volume) {
        super(name, model, color);
        this.volume = volume;
    }

    public Motorbike(String name, String model, String color) {
        super(name, model, color);
    }

    private double volume;
    public final int whellCoount = 2;

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }
}
