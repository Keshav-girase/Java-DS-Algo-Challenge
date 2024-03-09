public class Problem01 {
    // Function to find and return the largest element in an array
    public static int largest(int arr[], int n) {
        // Initialize variable to store the largest element
        int largest = Integer.MIN_VALUE;
        
        // Iterate through the array to find the largest element
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > largest) {
                largest = arr[i];
            }
        }
        
        // Return the largest element
        return largest;
    }

    public static void main(String[] args) {
        // Test cases
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {5, 4, 3, 2, 1};
        int[] arr3 = {2, 2, 2, 2, 2};
        int[] arr4 = {1};
        int[] arr5 = {1, 1};

        // Test the function with different arrays
        System.out.println("Largest element in arr1: " + largest(arr1, arr1.length)); // Output: 5
        System.out.println("Largest element in arr2: " + largest(arr2, arr2.length)); // Output: 5
        System.out.println("Largest element in arr3: " + largest(arr3, arr3.length)); // Output: 2
        System.out.println("Largest element in arr4: " + largest(arr4, arr4.length)); // Output: 1
        System.out.println("Largest element in arr5: " + largest(arr5, arr5.length)); // Output: 1
    }
}
