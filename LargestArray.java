import java.util.*;

public class LargestArray {

    public static int getLargest(int numbers[]){
    int largest = Integer.MIN_VALUE;
    for (int i = 0; i< numbers.length; i++){
        if ( largest < numbers[i]){
            largest = numbers[i];
        }
    } 
    return largest;
}
    public static void main (String args[]){
    int numbers[] = { 10 ,12,15,65,23};
    System.out.println("Largest number is " + getLargest(numbers));
    }
}
    

