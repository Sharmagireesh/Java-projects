import java.util.*;
public class Avg {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of A");
        int a = sc.nextInt();
        System.out.println("Enter value of B");
        int b = sc.nextInt();
        System.out.println("Enter value of C");
        int c = sc.nextInt();
        int avg = (a+b+c)/3;
        System.out.println ("total Average" + avg);
       
    }
    
}
