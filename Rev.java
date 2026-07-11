public class Rev {
    public static void main(String args[]){
        System.out.println("reverse of a no");
        int n = 103;
        int last_digit;
        int rev = 0;
        while(n>0){
            last_digit = n%10 ;
            //System.out.println(last_digit);
            //n=n/10;
            rev = (rev*10)+last_digit;
            n=n/10;

        }
        System.out.println(rev);
    }
    
}
