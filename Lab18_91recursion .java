import java.util.Arrays;
import java.util.Scanner;

public class Lab18_91recursion {
    public static void main(String[] args) {
        int[] arr = {1, 4, 5, 3, 6, 7, 2, 8, 9, 11};
        Arrays.sort(arr);
        System.out.println("Sorted array is: " + Arrays.toString(arr));
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an element you want to search for:");
        
        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            sc.close();  // Close the Scanner
            
            int index = binarySearch(arr, 0, arr.length - 1, n);
            
            if (index != -1) {
                System.out.println("Element found at index: " + index);
            } else {
                System.out.println("Element not found.");
            }
        } else {
            System.out.println("Invalid input. Please enter an integer.");
            sc.close();  // Close the Scanner even if the input is invalid
        }
    }
    
    // Recursive binary search method
    public static int binarySearch(int[] arr, int left, int right, int target) {
        if (left > right) {
            return -1;  // Element not found
        }
        
        int mid = (left + right) / 2;
        
        if (arr[mid] == target) {
            return mid;
        } else if (arr[mid] < target) {
            return binarySearch(arr, mid + 1, right, target);
        } else {
            return binarySearch(arr, left, mid - 1, target);
        }
    }
}
