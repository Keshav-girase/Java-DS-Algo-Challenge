

public class Problem12 {
    
    // with time complexity -  O(N^3)
    public static int longestSubarrayWithSumK(int []a, long k) {
        // Write your code here
        int n = a.length;
        int maxLen = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                long sum = 0;
                for (int j2 = i; j2 <= j; j2++) {
                    sum += a[j2];

                }
                if (sum == k) {
                    maxLen = Math.max(maxLen,j-i+1);
                }
            }
        }
        return maxLen;
    }

    // with time complexity -  O(N^2)
    public static int longestSubarrayWithSumK2(int []a, long k) {
        // Write your code here
        int n = a.length;
        int maxLen = 0;
        
        for (int i = 0; i < n; i++) {
            long sum = 0;
            for(int j = i; j < n; j++) {
                sum += a[j];

                if (sum == k) {
                    maxLen = Math.max(maxLen, j-i+1);
                }
               
            }
            
            
        }
        return maxLen;
    }

    // with time complexity -  O(N)
    // The algorithm does not properly handle cases where negative 
    // numbers in the array affect the sum, potentially leading to incorrect results.
    public static int longestSubarrayWithSumK3(int []a, long k) {
        // Write your code here
        int n = a.length;
        int left = 0;
        int right = 0;
        int len = 0;
        long sum = 0;

        while (right < n) {
            sum += a[right];
            
            while (sum > k && left <= right) {
                sum -= a[left];
                left++;
            }
                
            
            if (sum == k) {
                len = Math.max(len, right - left + 1); 
            }
            right++;
            
        }
        return len;
    }

    // ONE MORE SOLUTION EXITEST WITH HASH MAP

// Incorrect left Pointer Adjustment: Inside the inner loop, you incorrectly decrement the left pointer instead of incrementing it, leading to improper adjustment of the window.

// Incorrect Handling of sum: After finding a subarray with the sum equal to k, you reset the sum to 0, which is incorrect as it should continue accumulating for the next potential subarray.

// Inadequate len Update: You only update len when the sum exactly matches k, but you should also consider cases where adjustments lead to the sum becoming k.

// Inefficient left Pointer Adjustment: The nested while loop for adjusting the left pointer can be inefficient, especially when the difference between the current sum and k is large.

// Unnecessary Initialization: Initializing len to 0 is unnecessary since it's already initialized to 0 by default.

/*  wrong code 
 *  public static int longestSubarrayWithSumK(int []a, long k) {
        // Write your code here
        int n = a.length;
        int left = 0;
        int right = 0;
        int len = 0;
        long sum = 0;

        while (right < n) {
            sum += a[right];
            
            
            if( sum > k) {
                while (sum > k) {
                    sum -= a[left];
                    left--;
                }
                
            }
            if (sum == k) {
                len = Math.max(len, right - left + 1);
                sum = 0;
                left++;
                right++;
            } else {
                right++;
            }

            
        }
        return len;
    }


 */


    public static void main(String[] args) {
        int[] a = {2, 3, 5, 1, 9};
        long k = 10;
        int len = longestSubarrayWithSumK3(a, k);
        System.out.println("The length of the longest subarray is: " + len);
    }
}
