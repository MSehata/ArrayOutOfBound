package org.example;

import java.util.Scanner;

public class ArrayOutOfBounds {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        Scanner scanner = new Scanner(System.in);

        try {
            int index;
            System.out.print("Enter an index number from 0 - 4: ");
            index = scanner.nextInt();
            int value = numbers[index];
            System.out.println("Value at index " + index + ": " + value);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
