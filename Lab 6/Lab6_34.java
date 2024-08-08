import java.util.*;

class employee_details{
    int ei;
    String n;
    String Desig;
    double sal;
    public void Employee(int ei,String n,String Desig,double sal){
        this.ei=ei;
        this.n=n;
        this.Desig=Desig;
        this.sal=sal;
         
        System.out.println("employee id is:-"+ei);
        System.out.println("employee name is:-"+n);
        System.out.println("employee desgination is:-"+Desig);
        System.out.println("employee salary is:-"+sal);
    }

}
public class Lab6_34 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Employee Id");
        int ei =sc.nextInt();
        System.out.println("Enter Employee Name");
        String n=sc.next();
        System.out.println("Enter Employee Designation");
        String Desig=sc.next();
        System.out.println("Enter Employee Salary");
        double sal=sc.nextDouble();
        employee_details obj=new employee_details();
        obj.Employee(ei,n,Desig,sal);
    }
}
