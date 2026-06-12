import java.util.*;
public class IncomeTax{
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter your income");
        int Income = sc.nextInt();
        double Tax;
        if (Income < 500000){
            Tax = 0;
            System.out.println("Total Tax" + Tax);
        
        } else if (Income >=500000 && Income <= 1000000)
        {
            Tax = Income * 0.2;
            System.out.println("Total Tax" + Tax);
        } else {
            Tax = Income * 0.3;
            System.out.println("Total Tax" + Tax);

        }


    }
}