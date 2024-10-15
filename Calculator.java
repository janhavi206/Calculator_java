import java.util.*;
public class Calculator{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the first operand: ");
        int a= sc.nextInt();
        System.out.println("Enter the second operand: ");
        int b= sc.nextInt();
        System.out.println("Select the operation you want to be performed\n");
        System.out.println("Enter the operator (A. +, B. -, C. *, D. /): ");    
        char op= sc.next().charAt(0);
        switch (op) {
            case 'A':
                System.out.println("Addition: "+(a+b));
                break;
            
            case 'B':
                System.out.println("Subtraction: "+(a-b));
                break;
            
            case 'C':
                System.out.println("Multiplication: "+(a*b));
                break;
            
            case 'D':
                System.out.println("Division: "+(a/b));
                break;          
                
        }
    }
}