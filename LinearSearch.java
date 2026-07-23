
public class LinearSearch {
    public static int linearSearch (int marks[] , int key){
        for (int i =0 ; i< marks.length; i++){
            if ( key == marks[i]){
                return i;
            }
        }
        return -1;

    }
    public static void main (String args[]){
        int marks[] = { 10 , 20 ,30 , 40, 50, 60};
        int key = 80;
        int index = linearSearch(marks , key);
        if(index == -1){
            System.out.println("key not found ");
        }
        else {
            System.out.println("key is at index" + index);
        }
    }
    
}
