package pl.kurs;

import java.util.Arrays;

public class Task1 {

    public static void printNumbers() {
        for (int i = 10; i < 100; i++) {
            if (i / 10 > i % 10)
                System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void printNumbersInArray() {
        int[] array = new int[90];
        int cnt = 0;
        for (int i = 10; i < 100; i++) {
            if (i / 10 > i % 10)
                array[cnt++] = i;
        }
        System.out.println(Arrays.toString(Arrays.copyOf(array, cnt)));
    }

}