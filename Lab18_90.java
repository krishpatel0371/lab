import java.util.Scanner;
public class Lab18_90 {
    public static void main(String[] args){
        int[] arr={1,4,5,3,6,76,23,45,78,92,34};
        for(int i=0;i<11;i++){
            System.out.print(+arr[i]+",");
        }
        System.out.println(" ");
        System.out.println("enter an element you want to search:");
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        for(int i=0;i<arr.length;i++){
            if(arr[i]==n){
                System.out.println("element found at index "+i);
                return;
            }
        }
        System.out.println("element not found");
    }
}
