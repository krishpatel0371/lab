import java.util.Scanner;

public class Lab8_45 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter infix");
        String infix = sc.next();
        infix += ")";
        if(infix.length() == 0) {
            System.out.println("String is empty");
            return;
        }
        Stack stack = new Stack(infix.length());
        stack.push('(');
        String polish = "";
        int rank = 0;
        for(int i=0; i<infix.length(); i++) {
            char next = infix.charAt(i);
            while(stack_precedence(stack.peek()) > input_precedence(next)) {
                char temp = stack.pop();
                polish += temp;
                rank += rank(temp);
                if(rank < 1) {
                    System.out.println("Invalid");
                    return;
                }
            }
            if(stack_precedence(stack.peek()) != input_precedence(next)) stack.push(next);
            else stack.pop();
        }
        if(stack.top != -1 || rank != 1) {
            System.out.println("Invalid");
            return;
        }       
        System.out.println("Valid");
        System.out.println(polish);
        sc.close();
    }

    public static int stack_precedence(char temp) {
        if(temp == '+' || temp == '-') return 2;
        else if(temp == '*' || temp == '/') return 4;
        else if(temp == '^') return 5;
        else if(temp == '(') return 0;
        else  return 8;
    }

    public static int input_precedence(char temp) {
        if(temp == '+' || temp == '-') return 1;
        else if(temp == '*' || temp == '/') return 3;
        else if(temp == '^') return 6;
        else if(temp == '(') return 9;
        else if(temp == ')') return 0;
        else  return 7;
    }

    public static int rank(char temp) {
        if(temp == '+' || temp =='-' || temp == '*' || temp == '/' || temp == '^') return -1;
        else return 1;
    }
}

class Stack {
    char[] stack;
    int size;
    int top = -1;

    public Stack(int size) {
        this.size = size;
        stack = new char[size];
    }

    public void push(char ch) {
        if(top >= size-1) {
            System.out.println("Stack Overflow");
            return;
        }
        top++;
        stack[top] = ch;
    }

    public char pop() {
        if(top < 0) {
            System.out.println("Stack Underflow");
            return 0;
        }
        top--;
        return stack[top+1];
    }

    public char peek() {
        if(top < 0) {
            System.out.println("Stack Underflow");
            return 0;
        }
        return stack[top];
    }
}