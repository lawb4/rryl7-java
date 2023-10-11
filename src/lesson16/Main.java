package lesson16;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Integer> ints = Arrays.asList(1, -3, 15, 20, -222);
        System.out.println(onlyPositives(ints));

        System.out.println("-1-");

        ints.sort(Comparator.naturalOrder());
        System.out.println(ints);

        System.out.println("-2-");

        List<String> strings = Arrays.asList("aaa", "bbb", "xxx", " ", "  ");
        strings.sort(Comparator.reverseOrder());
        System.out.println(strings);

        System.out.println("-Yokozunas-");

        List<Yokozuna> wrestlers = Arrays.asList(
                new Yokozuna("Таконохана", 200),
                new Yokozuna("Амусасимару", 190),
                new Yokozuna("Кисеносато", 250)
        );
        wrestlers.sort(Comparator.naturalOrder());
        System.out.println(wrestlers);

        System.out.println("-__SETS__-");

        List<Integer> ints1 = List.of(1, 3, 4, 0, 1, 3);
        // use `new HashSet` to output only non-duplicates
        System.out.println(new HashSet<>(ints1));

        System.out.println("-__DEQUE__-");

        Deque<Integer> dints = new ArrayDeque<>();
        dints.addLast(1); // 1
        dints.addLast(2); // 1, 2
        dints.addLast(3); // 1, 2, 3
        dints.removeLast(); // 1, 2
        dints.removeFirst(); // 2
        System.out.println(dints);

        System.out.println("-__MAPS__-");

        Likes likes = new Likes();
        likes.print(); // empty {}
        likes.addLike("heart"); // {heart=1}
        likes.print();
        likes.addLike("heart"); // {heart=2}
        likes.print();
        likes.addLike("care"); // {heart=2, care=1}
        likes.print();
        System.out.println(likes.getTotalLikes());
        likes.printTypes();

    }

    static List<Integer> onlyPositives(List<Integer> list) {
        List<Integer> result = new ArrayList<>();

        for (Integer i : list) {
            if (i > 0) {
                result.add(i);
            }
        }
        return result;
    }
}
