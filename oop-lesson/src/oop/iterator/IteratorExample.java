package oop.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorExample {

    public static void main(String[] args) {
        List<Integer> sourceList = List.of(1, 2, 3, 4, 5, 6);
        List<Integer> list = new ArrayList<>(sourceList);

//        for (int i = 0; i < list.size(); i++) {
//            Integer integer = list.get(i);
//        }

        for (Integer integer :list) {
            System.out.println(integer);
        }
        for (Integer integer :list) {
            System.out.println(integer);
        }
        list.forEach(System.out::println);
    }
}
