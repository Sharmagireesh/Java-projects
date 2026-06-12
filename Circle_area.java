import java.util.*;
public class Circle_area {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Entery the radius of the circle");
        float r = sc.nextFloat();
        Float area = 3.14f * r * r;
        System.out.println("The area of the circle is: " + area);
    }
    
}
