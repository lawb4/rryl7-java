package lesson18;

import java.util.List;

public class ListUtils {

    public static <T> T findOptimal(List<T> list, T initialValue, Decider<T> decider) {
        T result = initialValue;
        for (T e : list) {
            if (decider.isOptimal(e, result)) {
                result = e;
            }
        }
        return result;
    }
}
