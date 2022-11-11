package pl.kurs;

import java.util.Arrays;
import java.util.Random;

public class Runner {
    public static void main(String[] args) {

//        Task1
        System.out.println("Task1");

        System.out.println("Two-digit numbers for which the number of tens is greater than the unity digit:");
        Task1.printNumbers();
        System.out.println("Placed in array:");
        Task1.printNumbersInArray();

        System.out.println();

//        Task2
        System.out.println("Task2");

        Random random = new Random();
        int[] ints = new int[20];
        int cnt = 0;
        while (cnt < ints.length)
            ints[cnt++] = random.nextInt(202) - 100;

        System.out.println("Created array: " + Arrays.toString(ints));

        System.out.println("Reversed array: " + Arrays.toString(Task2.reverseArray(ints)));

        System.out.println("Maximum value from the array: " + Task2.max(ints));

        System.out.println("Minimum value from the array: " + Task2.min(ints));

        System.out.println("Sum of elements = " + Task2.sumOfElements(ints));

        System.out.println("Median of elements = " + Task2.medianOfElements(ints));

        System.out.println();

//        Task3
        System.out.println("Task3");

        int[] ints1 = new int[15];
        int cnt1 = 0;
        while (cnt1 < ints1.length)
            ints1[cnt1++] = random.nextInt(10) + 1;

        int[] ints2 = new int[10];
        int cnt2 = 0;
        while (cnt2 < ints2.length)
            ints2[cnt2++] = random.nextInt(10) + 1;

        System.out.println("Array 1: " + Arrays.toString(ints1));
        System.out.println("Array 2: " + Arrays.toString(ints2));

        Task3.sharedNumbers(ints1, ints2);

        System.out.println();

//        Task4
        System.out.println("Task4");

        String[] names = {"Amelia", "Teodora", "Jakuba", "Agnieszka", "Bartosza", "Filipa", "Marcelina", "Amadeusz",
                "Maja", "Franciszek", "Pelagia", "Maciej", "Zenon", "Zuzanna", "Czesław", "Leon", "Gabriela", "Hela"};

        System.out.println("The longest name(s): " + Task4.longestName(names));
        System.out.println("The shortest name(s): " + Task4.shortestName(names));
        System.out.println("Number of female names: " + Task4.femaleNamesQty(names));
        System.out.println("Female names make up " + Task4.percentOfFemaleNames(names) + "% of the total.");


    }
}
