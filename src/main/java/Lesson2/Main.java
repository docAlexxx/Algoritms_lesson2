package Lesson2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class Main {
    public static void main(String[] args) {
        int n = 100000;
        int item;
        Random random = new Random();
        MyArrayList<Integer> list1 = new MyArrayList<>(n);
        MyArrayList<Integer> list2 = new MyArrayList<>(n);
        MyArrayList<Integer> list3 = new MyArrayList<>(n);

        for (int i = 0; i < n; i++) {
            item = random.nextInt(100);
            list1.add(item);
            list2.add(item);
            list3.add(item);
        }

        long startTime = System.currentTimeMillis();

        list1.selectionSort();
        System.out.println("Selection Sort time - " + (System.currentTimeMillis() - startTime) / 1000 + "sec");
        startTime = System.currentTimeMillis();

        list2.insertionSort();
        System.out.println("Insertion Sort time - " + (System.currentTimeMillis() - startTime) / 1000 + "sec");
        startTime = System.currentTimeMillis();

        list3.bubbleSort();
        System.out.println("Bubble Sort time - " + (System.currentTimeMillis() - startTime) / 1000 + "sec");


    }
}
