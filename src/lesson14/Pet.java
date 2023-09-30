package lesson14;

public class Pet implements IName{

    private final String name;
    private final String type;

    public Pet(String name, String type) {
        this.name = name;
        this.type = type;
    }

    @Override
    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }
}
