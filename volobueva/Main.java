package ru.vsu.cs.volobueva;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(89);
        list.add(89);
        list.add(5);
        list.add(2);
        list.add(89);
        list.add(5);
        list.add(5);
        list.add(89);
        list.add(6);

        List<Integer> result = SearchPositions.searchPosition(list);

        System.out.println("Search for the largest of the most common values with MySimpleHashMap: ");

        for (Integer integer : result) {
            System.out.println(integer);
        }

        StandardMain.standardMain();
    }
}