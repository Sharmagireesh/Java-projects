public class BinarySearch { 
    public static int binarySearch(int numbers[], int key) { 
        int start = 0; 
        int end = numbers.length - 1; 

        while (start <= end) { 
            int mid = (start + end) / 2; 

            // Check if the middle element is the key
            if (numbers[mid] == key) { 
                return mid; // Return the actual index
            } 
            // If key is smaller, search the left half
            else if (numbers[mid] > key) { 
                end = mid - 1; 
            } 
            // If key is larger, search the right half
            else { 
                start = mid + 1; 
            } 
        } 
        return -1; // Return -1 if key is not found
    } 

    public static void main(String args[]) { 
        int numbers[] = {2, 4, 7, 9, 77, 80}; 
        int key = 9; 
        
        int result = binarySearch(numbers, key);
        System.out.println("The key is found at index: " + result); 
    } 
}
