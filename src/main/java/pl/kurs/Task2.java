package pl.kurs;

import java.util.Arrays;

public class Task2 {

    public static int[] reverseArray(int[] array) {
        int[] reversedArray = new int[array.length];
        int cnt = array.length - 1;
        for (int i = 0; i < array.length; i++)
            reversedArray[i] = array[cnt--];
        return reversedArray;
    }

    public static int max(int[] array) {
        int max = array[0];
        for (int i : array) {
            if (i > max)
                max = i;
        }
        return max;
    }

    public static int min(int[] array) {
        int min = array[0];
        for (int i : array) {
            if (i < min)
                min = i;
        }
        return min;
    }

    public static int sumOfElements(int[] array) {
        int sum = 0;
        for (int i : array) {
            sum += i;
        }
        return sum;
    }

    public static double medianOfElements(int[] array) {
        double median;
        Arrays.sort(array);
        if (array.length % 2 != 0)
            median = array[array.length / 2];
        else
            median = (double) (array[array.length / 2 - 1] + array[array.length / 2]) / 2;
        return median;
    }


}
