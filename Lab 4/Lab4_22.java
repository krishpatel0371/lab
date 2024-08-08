import java.util.Scanner;
public class Lab4_22 {
    
    
        public static void main(String[] args) 
        {
            int n, pos, x;
            Scanner s = new Scanner(System.in);
            System.out.print("Enter no. of elements you want in array:");
            n = s.nextInt();
            int a[] = new int[n+1];
            System.out.println("Enter all the elements:");
            for(int i = 0; i < n; i++)
            {
                a[i] = s.nextInt();
            }
            System.out.print("Enter the position where you want to delete your  element:");
            pos = s.nextInt();
            // System.out.print("Enter the element you want to delete:");
            // x = s.nextInt();
            for(int i = 1; i < (n+1); i++)
            {
                a[i-1] = a[i];
            }
            // a[pos-1] = x;
            System.out.print("After deleting:");
            for(int i = 0; i < n; i++)
            {
                System.out.print(a[i]+",");
            }
            System.out.print(a[n]);
        }
    }

