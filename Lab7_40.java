import java.util.Scanner;

public class Lab7_40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.next().toLowerCase();
        if (str.length() % 2 == 1) {
            System.out.println("Invalid String");
            return;
        }
        Stack stack = new Stack(str.length());
        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }
        boolean isValid = true;
        char firstHalfChar = 'b';
        char secondHalfChar = 'a';
        for (int i = 0; i < str.length(); i++) {
            char ch = stack.pop();
            if (i < str.length() / 2) {
                if (ch != firstHalfChar) {
                    isValid = false;
                    break;
                }
            } else {
                if (ch != secondHalfChar) {
                    isValid = false;
                    break;
                }
            }
        }
        if (isValid) {
            System.out.println("Valid String");
        } else {
            System.out.println("Invalid String");
        }
        sc.close();
    }
}

class Stack {
    int   top = -1;
    int size = 0;
    char[] stack;

    public Stack(int size) {
        this.size = size;
        stack = new char[size];
    }

    public void push(char ch) {
        if (top >= size - 1) {
            System.out.println("Stack Overflow");
            return;
        }
        top++;
        stack[top] = ch;
    }

    public char pop() {
        if (top < 0) {
            System.out.println("Stack Underflow");
            return 0;
        }
        char ch = stack[top];
        top--;
        return ch;
    }
}
