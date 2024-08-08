import java.util.Scanner;

public class Lab6_36 {
    public static void main(String[] args) {
        Conversion c = new Conversion();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of Celsius: ");
        float celsius = sc.nextFloat();
        System.out.println("Value in Fahrenheit = " + c.c_to_f(celsius));

        System.out.print("Enter value of Fahrenheit: ");
        float fahrenheit = sc.nextFloat();
        System.out.println("Value in Celsius = " + c.f_to_c(fahrenheit));
    }
}

class Conversion {
    public float c_to_f(float c) {
        return (c * 9/5) + 32;
    }

    public float f_to_c(float f) {
        return (f - 32) * 5/9;
    }
}