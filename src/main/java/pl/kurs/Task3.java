package pl.kurs;

import java.util.Arrays;

public class Task3 {

    public static void sharedNumbers(int[] array1, int[] array2) {

        int[] sharedNumbers = new int[Math.min(array1.length, array2.length)];

        int cnt = 0;
        for (int i : array1) {
            for (int j : array2) {
                if (i == j) {
                    boolean isAlreadyOnList = false;
                    for (int l = 0; l < cnt; l++) {
                        if (sharedNumbers[l] == i) {
                            isAlreadyOnList = true;
                            break;
                        }
                    }
                    if (!isAlreadyOnList)
                        sharedNumbers[cnt++] = i;
                }
            }
        }

        if (cnt == 0)
            System.out.println("There are no common elements in compared arrays.");
        else
            System.out.println("Numbers that occur in both arrays: " +
                    Arrays.toString(Arrays.copyOf(sharedNumbers, cnt)));
    }

}
