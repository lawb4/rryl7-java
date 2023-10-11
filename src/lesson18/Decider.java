package lesson18;

public interface Decider<T> {
    boolean isOptimal(T first, T second);
}
