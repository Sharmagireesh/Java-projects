import java.util.*;
public class Continue {
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a no");
        int n = sc.nextInt();
        
        while(n<10){
            if(n==5){
                n++;
                continue;
            }
            System.out.println(n);
            n++;
        }
        sc.close();


    }
    
}
