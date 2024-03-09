

public class Problem03 {
        // Function to check if the array is sorted in non-decreasing order
        public static boolean arraySortedOrNot(int[] arr, int n) {
            // Iterate through the array
            for(int i = 0; i < n - 1; i++) {
                // If the current element is greater than the next element, array is not sorted
                if(arr[i] > arr[i + 1]) {
                    return false;
                }
            }
            // If the loop completes without finding any out-of-order elements, array is sorted
            return true;
        }
        
        // Main method for testing
        public static void main(String[] args) {
            
            // Test cases
            int[] arr1 = {1, 2, 3, 4, 5};  // Sorted array
            int[] arr2 = {5, 4, 3, 2, 1};  // Reverse sorted array
            int[] arr3 = {2, 2, 3, 4, 1};  // Not sorted array
            
            // Test the function with different arrays
            System.out.println("Is arr1 sorted? " + arraySortedOrNot(arr1, arr1.length)); // Output: true
            System.out.println("Is arr2 sorted? " + arraySortedOrNot(arr2, arr2.length)); // Output: false
            System.out.println("Is arr3 sorted? " + arraySortedOrNot(arr3, arr3.length)); // Output: false
        }
}
