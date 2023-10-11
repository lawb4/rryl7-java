package lesson16;

public class Yokozuna implements Comparable<Yokozuna>{
    private final String name;
    private final int weight;

    public Yokozuna(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    @Override
    public int compareTo(Yokozuna o) {
        return Integer.compare(weight, o.weight);
    }

    @Override
    public String toString() {
        return "Yokozuna{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }
}
