package lesson11;

public class Husky extends Dog {

    public Husky() {
        super("Хаски");
    }
    @Override
    public void say() {
        System.out.println(name + " говорит АААААААААААААА");
    }
}
