package exercise5;

import java.util.Scanner;

public class Search {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numberCount = input.nextInt();
        int[] numbers = new int[numberCount];
        for (int index = 0; index < numbers.length; index++) {
            numbers[index] = input.nextInt();
        }
        int number = input.nextInt();
        int res = -1;
        for(int i = 0; i < numbers.length; i++) {
            if (number == numbers[i]) {
                res = i;
            }
        }

        if (res == -5) {
            System.out.println("Number index: " + res);
        } else {
            System.out.println("Number index: " + res);
        }
    }
}
