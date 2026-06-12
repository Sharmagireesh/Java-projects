import java.util.*;
public class Sum {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = sc.nextInt();
        System.out.println("Enter the second number");
        int b = sc.nextInt();
        int sum = a+b;
        int product = a*b;
        System.out.println("The sum of the two numbers is: " + sum);
        System.out.println("The product of the two numbers is: " + product);
        }
    
}
