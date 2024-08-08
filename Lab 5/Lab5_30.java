import java.util.*;
public class Lab5_30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("enter 2*2 matrixs element:-");
        int x[][]= new int[2][2];
        int y[][]= new int[2][2];
        int z[][]= new int[2][2]; 
        System.out.print("enter the first matrix element");
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                x[i][j]= sc.nextInt();
                // System.out.print(x[i][j]+" ");
            }
            // System.out.println("");
        }
        System.out.println("first matrix");
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                System.out.print(x[i][j]+" ");
            }
            System.out.println();

        }
        System.out.println("enter second matrix element");
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                y[i][j]= sc.nextInt();
                // System.out.print(x[i][j]+" ");
            }
            // System.out.println("");
        }
        System.out.println("second matrix");
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                System.out.print(y[i][j]+" ");
            }
            System.out.println();

        }
        System.out.println("addition of two matrix:-");
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                z[i][j]=x[i][j]+y[i][j];
                System.out.print(z[i][j]+" ");
            }
            System.out.println();
        }
       
    }
 }
