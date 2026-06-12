import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = scanner.nextInt();
        if(n==1){
                System.out.println("1 is a unitary no");
        }else if(n==2){
                System.out.println("2 is a prime no");
        }
        for(int i=2; i<n; i++){
            if(n%i==0){
                System.out.println("not a prime no");
                break;
            }else {
                System.out.println("prime no");
                break;
            }

            

        }

    }
}
