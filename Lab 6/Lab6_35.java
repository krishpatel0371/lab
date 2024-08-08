import java.util.Scanner;
class stu{
    int EN;
    String name;
    int Sem;
    double cpi;
    public void Students(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Enroll no. of the student");
        EN=sc.nextInt();
        System.out.println("Enter the name of the student: ");
        name=sc.next();
        System.out.println("Enter the semester of the student: ");
        Sem=sc.nextInt();
        System.out.println("Enter the cpi of the student: ");
        cpi=sc.nextDouble();
       
    }
}
public class Lab6_35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        stu[] s = new stu[2];
        for(int i=0;i<2;i++){
            s[i] = new stu();
            s[i].Students();
        }
        for(int i=0;i<2;i++){
        System.out.println(s[i].EN);
        System.out.println(s[i].name);
        System.out.println(s[i].Sem);
        System.out.println(s[i].cpi);
        }
    }
}

