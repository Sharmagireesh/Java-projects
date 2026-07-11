import java.util.*;
public class Leap_year {
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a year to check for leap year");
        int year = sc.nextInt();
        boolean x = (year%4)==0;
        boolean y = (year%100)!=0;
        boolean z = ((year%100==0) && (year%400==0));
        if (x && (y||z)){
            System.out.println(year + "Leap year");
        }
        else{
            System.out.println(year + "not a leap year");
        }
        sc.close();

    }
    
}
