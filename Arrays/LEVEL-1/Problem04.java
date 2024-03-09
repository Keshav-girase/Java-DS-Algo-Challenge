
public class Problem04 {
    // Function to remove duplicates from a sorted array
    static int remove_duplicate(int A[], int N) {
        // Initialize a pointer j to keep track of the position to place the next unique element
        int j = 0;
        
        // If all elements are the same, return 1
        if (A[0] == A[N - 1]) {
            return 1;
        }
        
        // Iterate through the array
        for (int i = 0; i < N - 1; i++) {
            // If the current element is different from the next element, it's a unique element
            if (A[i] != A[i + 1]) {
                // Move the unique element to the position indicated by j
                A[j] = A[i];
                // Move to the next position for placing the next unique element
                j++;
            }
        }
        
        // Add the last element of the array to the unique elements
        A[j] = A[N - 1];
        
        // Return the length of the array after removing duplicates
        // Add 1 to j to account for 0-based indexing
        return j + 1;
    }
    
    // Main method for testing
    public static void main(String[] args) {
        
        // Test cases
        int[] arr1 = {1, 1, 2, 2, 3, 3, 4, 4, 5, 5};  // Duplicate elements
        int[] arr2 = {1, 2, 3, 4, 5};  // No duplicates
        
        // Test the function with different arrays
        int len1 = remove_duplicate(arr1, arr1.length);
        System.out.println("Length of arr1 after removing duplicates: " + len1); // Output: 5
        
        int len2 = remove_duplicate(arr2, arr2.length);
        System.out.println("Length of arr2 after removing duplicates: " + len2); // Output: 5
    }
}
