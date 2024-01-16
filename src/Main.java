//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Kawasaki kawasaki = new Kawasaki("kawasaki", "super model", "white", 5.5,2000);
        kawasaki.jump();

        Ural ural = new Ural("ural", "new model", "red",  5.7, true);
        ural.showInfo();

    }
}