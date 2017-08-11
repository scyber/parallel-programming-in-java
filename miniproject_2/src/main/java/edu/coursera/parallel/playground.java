package edu.coursera.parallel;

import java.util.HashMap;
import java.util.Map;

public class playground {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        System.out.printf("%d", new Integer(map.get("some_key") + 1));
    }
}
