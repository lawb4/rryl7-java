package lesson16;

import java.util.HashMap;
import java.util.Map;

public class Likes {

    Map<String, Integer> likes = new HashMap<>();

    public void addLike(String likeType) {
        //int counter = likes.getOrDefault(likeType, 0);
        // or `old school` way >>>
        int counter = 0;
        if (likes.containsKey(likeType)) {
            counter = likes.get(likeType);
        }
        counter++;
        likes.put(likeType, counter);
    }

    public int getTotalLikes() {
        int total = 0;
        for (int count : likes.values()) {
            total += count;
        }
        return total;
    }

    public void printTypes() {
        for (String likeType : likes.keySet()) {
            System.out.println(likeType);
        }
    }

    public void print() {
        System.out.println(likes);
    }
}
