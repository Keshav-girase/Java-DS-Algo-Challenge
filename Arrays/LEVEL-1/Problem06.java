

public class Problem06 {

    // Function to print the elements of an array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Function to move zeroes to the end of the array
    public static void moveZeroes(int[] nums) {
        int n = nums.length;
        int count = -1; // Initialize count to track non-zero elements
        
        // Iterate through the array
        for (int i = 0; i < n; i++) {
            // If the current element is non-zero
            if (nums[i] != 0) {
                count++; // Increment count to move to the next position for a non-zero element
                nums[count] = nums[i]; // Move the non-zero element to its correct position
            }
        }
        
        count++; // Increment count to get the position after the last non-zero element
        
        // Fill the remaining positions with zeroes
        for (int j = count; j < n; j++) {
            nums[j] = 0;
        }
    }
    

    // Main method for testing
    public static void main(String[] args) {
        // Test cases
        int[] arr1 = {0, 1, 0, 3, 12}; // Expected output: [1, 3, 12, 0, 0]
        int[] arr2 = {0, 0, 0, 0, 0};   // Expected output: [0, 0, 0, 0, 0]
        int[] arr3 = {1, 2, 3, 4, 5};   // Expected output: [1, 2, 3, 4, 5]
        
        // Move zeroes in each array
        moveZeroes(arr1);
        moveZeroes(arr2);
        moveZeroes(arr3);
        
        // Print the modified arrays
        System.out.println("Array 1 after moving zeroes:");
        printArray(arr1); // Output: 1 3 12 0 0
        
        System.out.println("Array 2 after moving zeroes:");
        printArray(arr2); // Output: 0 0 0 0 0
        
        System.out.println("Array 3 after moving zeroes:");
        printArray(arr3); // Output: 1 2 3 4 5

        
    }
    
}
