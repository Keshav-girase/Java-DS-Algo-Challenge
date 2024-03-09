

public class Problem05 {
    // Function to reverse elements in the nums array from start index (si) to end index (ei)
    public static void reverse(int nums[], int si, int ei) {
        // Reverse the elements from start index (si) to end index (ei)
        while (si < ei) {
            int temp = nums[si];
            nums[si] = nums[ei];
            nums[ei] = temp;
            si++;
            ei--;
        }
    }
    
    // Function to rotate the nums array by k steps to the right
    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n; // Get the effective rotation steps (k modulo n)
        
        // Reverse the first part of the array from index 0 to n-k-1
        reverse(nums, 0, n - k - 1);
        // Reverse the second part of the array from index n-k to n-1
        reverse(nums, n - k, n - 1);
        // Reverse the entire array
        reverse(nums, 0, n - 1);
    }
    
    // Main method for testing
    public static void main(String[] args) {
        // Test cases
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7};
        int[] arr2 = {-1, -100, 3, 99};
        
        int k1 = 3; // Rotate arr1 by 3 steps
        int k2 = 2; // Rotate arr2 by 2 steps
        
        // Rotate the arrays
        rotate(arr1, k1);
        rotate(arr2, k2);
        
        // Print the rotated arrays
        System.out.println("Rotated arr1:");
        for (int num : arr1) {
            System.out.print(num + " ");
        }
        System.out.println();
        
        System.out.println("Rotated arr2:");
        for (int num : arr2) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
