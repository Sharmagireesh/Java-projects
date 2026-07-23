
import java.util.*;

public class ArrayBasic {
    public static void main (String args[]){
        System.out.println("Creating an array");
        Scanner sc = new Scanner (System.in);
        int marks [] = new int[100]; // ARRAY IS CREATED
        
        System.out.println("Enter marks of Physics");
        marks[0] = sc.nextInt();
        System.out.println("Enter marks of Chemistry");
        marks[1] = sc.nextInt();
        System.out.println("Enter marks of maths");
        marks[2] = sc.nextInt();

        
        for(int i = 0; i < 3; i++){
            System.out.println(marks[i]);
        }
        sc.close();
    }
}
