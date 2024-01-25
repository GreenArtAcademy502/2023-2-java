package com.green.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenericTest {
    public static void main(String[] args) {
        List<?>[] lists = new ArrayList<?>[1];
        lists[0] = Arrays.asList(1);

        List<Integer> lists2 = Arrays.asList(1);
    }
}
