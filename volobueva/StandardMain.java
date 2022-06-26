package ru.vsu.cs.volobueva;

import java.util.ArrayList;
import java.util.List;

public class StandardMain {
    public static void standardMain() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(4);
        list.add(1);
        list.add(1);

        List<Integer> result = SearchPositionWithStandardLibrary.searchPosition(list);

        System.out.println("Search for the largest of the most common values with standard library: ");

        for (Integer integer : result) {
            System.out.println(integer);
        }
    }
}
