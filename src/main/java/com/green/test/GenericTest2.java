package com.green.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenericTest2 {
    public static void main(String[] args) {
        List<?>[] lists = new ArrayList<?>[1];
        lists[0] = Arrays.asList(1);

        List<Integer> lists2 = Arrays.asList(1);

        List<Integer> lists3 = MyArray.asList(1);
    }
}

class MyArray {
    public static <T> List<T> asList(T ...items) {
        List<T> list = new ArrayList<T>();
        for(T t : items) {
            list.add(t);
        }
        return list;
    }
}
