import java.util.*;
import java.util.Scanner;

public class Lab3_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        int[] numbers = new int[n];

        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        System.out.println("Here are the numbers you entered:");
        for (int i = 0; i < n; i++) {
            System.out.println((i + 1) + ". " + numbers[i]);
        }
    }
}
