import java.util.Arrays;
import java.util.Scanner;

public class Lab18_91 {
    public static void main(String[] args){
        int[] arr={1,4,5,3,6,7,2,8,9,11};
        Arrays.sort(arr); 
        System.out.println("Sorted array is here: " + Arrays.toString(arr));
        System.out.println("Enter an element you want to search index:");
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        int Left=0;
        int Right=arr.length-1;
        while(Right>=Left){
            int mid=(Left+Right)/2;
            if(arr[mid]==n){
                System.out.println("Element is found at index : " + mid);
                return;
            }
            else{
                if(arr[mid]<n){
                    Left=mid+1;
                }else{
                    Right=mid-1;
                }
            }
        }
        
        System.out.println("Element is not found");
    }
}