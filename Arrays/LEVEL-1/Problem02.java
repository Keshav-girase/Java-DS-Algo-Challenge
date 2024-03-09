

public class Problem02 {

   
    // Function to find and return the second largest element in an array
    public static int print2largest(int arr[], int n) {
        // Initialize variables to store the largest and second largest elements
        int largest = Integer.MIN_VALUE;
        int second_largest = Integer.MIN_VALUE;
        
        // If the array has less than 2 elements, there is no second largest element
        if(n < 2 ){
            return -1;
        }
        
        // Iterate through the array to find the largest and second largest elements
        for(int i=0; i<n; i++){
            if(arr[i] > largest ) {
                // If the current element is greater than the current largest, update both largest and second largest
                second_largest = largest;
                largest = arr[i];
            } else if (arr[i] < largest && arr[i] > second_largest) {
                // If the current element is smaller than the largest but greater than the second largest, update second largest
                second_largest = arr[i];
            }
        }
        
        // If the first element is the largest and there is no other distinct element, return -1
        if(arr[0] == largest && second_largest == Integer.MIN_VALUE){
            return -1;
        }
        
        // Return the second largest element
        return second_largest;
    }
    
    
    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {5, 4, 3, 2, 1};
        int[] arr3 = {2, 2, 2, 2, 2};
        int[] arr4 = {1};
        int[] arr5 = {1, 1};

        // Test the function with different arrays
        System.out.println("Second largest element in arr1: " + print2largest(arr1, arr1.length)); // Output: 4
        System.out.println("Second largest element in arr2: " + print2largest(arr2, arr2.length)); // Output: 4
        System.out.println("Second largest element in arr3: " + print2largest(arr3, arr3.length)); // Output: -1
        System.out.println("Second largest element in arr4: " + print2largest(arr4, arr4.length)); // Output: -1
        System.out.println("Second largest element in arr5: " + print2largest(arr5, arr5.length)); // Output: -1
        
    }
}
