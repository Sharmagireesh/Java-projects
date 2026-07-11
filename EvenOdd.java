import java.util.*;

public class EvenOdd {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range of number");
        int n = sc.nextInt();
        int Even =0; int Odd = 0;
        
        for(int i = 1; i<=n; i++){
            System.out.println("Enter the values");
            int num = sc.nextInt();
            if(num%2 == 0){
                Even+=num;
            }else{
                Odd+=num;
            }


        }
        System.out.println("Sum of even" + " " + Even );
        System.out.println("Sum of Odd" + " "+ Odd );
        sc.close();
    }
    
}

