import java.util.*;
public class Type_conversion {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        /*System.out.println("Enter a number");
        int a = sc.nextInt();
        float b = a; // implicit type conversion
        System.out.println("The value of b is: " + b);*/
        System.out.println("Enter a float number");
        float c = sc.nextFloat();
        int d = (int)c;
        System.out.println("The value of d is: " + d);


    }
    
}
