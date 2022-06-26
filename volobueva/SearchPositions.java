package ru.vsu.cs.volobueva;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SearchPositions {
    public static List<Integer> searchPosition(List<Integer> list) {
        MySimpleHashMap<Integer, List<Integer>> hashMap = new MySimpleHashMap<>(list.size());

        Integer mostCommonValue = 0;
        int frequency = 0;

        for (int i = 0; i < list.size(); i++) {
            Integer number = list.get(i);
            List<Integer> listResult;
            List<Integer> value = hashMap.get(number);
            if (value != null) {
                listResult = new ArrayList<>(value);
                listResult.add(i);
            } else {
                listResult = Collections.singletonList(i);
            }

            hashMap.put(number, listResult);

            if (hashMap.get(number).size() > frequency) {
                mostCommonValue = number;
                frequency = hashMap.get(number).size();
            }
        }
        return hashMap.get(mostCommonValue);
    }
}