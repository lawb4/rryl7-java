package lesson18;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Month march = Month.MARCH;
        doSomething(march);

        System.out.println(fromName("APRIL"));

        // How many days are there in September?
        System.out.println(Month.SEPTEMBER.getNumOfDays()); //30
        // using ListUtils class
        System.out.println("using ListUtils class");

        List<Integer> ints = List.of(1, 3, -90, 200, 31);

        Decider<Integer> isLess = new Decider<Integer>() {
            @Override
            public boolean isOptimal(Integer first, Integer second) {
                return first < second;
            }
        };

        Decider<Integer> isMore = new Decider<Integer>() {
            @Override
            public boolean isOptimal(Integer first, Integer second) {
                return first > second;
            }
        };

        System.out.println(ListUtils.findOptimal(ints, Integer.MIN_VALUE, isMore));
        System.out.println(ListUtils.findOptimal(ints, Integer.MAX_VALUE, isLess));

        List<String> months = List.of("JANUARY", "FEBRUARY", "DECEMBER", "MAY");
        Decider<String> isLonger = new Decider<String>() {
            @Override
            public boolean isOptimal(String first, String second) {
                return first.length() > second.length();
            }
        };
        System.out.println(ListUtils.findOptimal(months, "", isLonger));

    }

    public static void doSomething(Month month) {
        System.out.println(month);
    }

    public static Month fromName(String name) {
        return Month.valueOf(name);
    }
}
