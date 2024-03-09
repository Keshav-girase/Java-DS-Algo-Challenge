

public class Problem10 {
    // Function to find the maximum number of consecutive ones in a binary array
    public static int findMaxConsecutiveOnes(int[] nums) {
        int tempCount = 0; // Temporary count for consecutive ones
        int actualCount = 0; // Actual maximum count of consecutive ones
        int n = nums.length; // Length of the array
        
        // Iterate through the array
        for(int i = 0; i < n; i++) {
            if(nums[i] == 1) {
                tempCount++; // Increment temporary count for consecutive ones
            } else {
                // If current element is not 1 (i.e., it's 0), update actualCount and reset tempCount
                actualCount = Math.max(tempCount, actualCount); // Update actualCount with maximum of tempCount and actualCount
                tempCount = 0; // Reset tempCount
            }
        }
        
        // Update actualCount one more time to consider the case where the array ends with consecutive ones
        actualCount = Math.max(tempCount, actualCount);
        
        return actualCount; // Return the maximum consecutive count of ones
    }

    // Assume the given array is: [4,1,2,1,2]
    // XOR of all elements = 4^1^2^1^2
    //                     = 4 ^ (1^1) ^ (2^2)
    //                     = 4 ^ 0 ^ 0 = 4^0 = 4
    // Hence, 4 is the single element in the array.


    // Main function to demonstrate the usage of findMaxConsecutiveOnes method
    public static void main(String[] args) {
        // Example usage
        int[] nums = {1, 1, 0, 1, 1, 1};
        int maxConsecutiveOnes = findMaxConsecutiveOnes(nums);
        System.out.println("The maximum number of consecutive ones is: " + maxConsecutiveOnes);
    }
}
