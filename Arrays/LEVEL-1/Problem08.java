
import java.util.ArrayList;

public class Problem08 {

    // Function to return a list containing the union of the two arrays.
    public static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m) {
        ArrayList<Integer> myList = new ArrayList<>();
        int i = 0;
        int j = 0;

        // Iterate through both arrays simultaneously
        while (i < n && j < m) {
            // Case 1: arr1[i] is smaller than arr2[j]
            if (arr1[i] < arr2[j]) {
                // Add arr1[i] to the result list if it's not a duplicate
                if (i == 0 || arr1[i] != arr1[i - 1]) {
                    myList.add(arr1[i]);
                }
                i++;
            } 
            // Case 2: arr1[i] is equal to arr2[j]
            else if (arr1[i] == arr2[j]) {
                // Add arr1[i] to the result list if it's not a duplicate (we check duplicate in only arr1 for , when consecutively run 2 time )
                if (i == 0 || arr1[i] != arr1[i - 1]) {
                    myList.add(arr1[i]);
                }
                // Move both pointers as the elements are equal
                i++;
                j++;
            } 
            // Case 3: arr1[i] is greater than arr2[j]
            else {
                // Add arr2[j] to the result list if it's not a duplicate
                if (j == 0 || arr2[j] != arr2[j - 1]) {
                    myList.add(arr2[j]);
                }
                j++;
            }
        }

        // Add remaining elements from arr1
        while (i < n) {
            // Add arr1[i] to the result list if it's not a duplicate
            if (i == 0 || arr1[i] != arr1[i - 1]) {
                myList.add(arr1[i]);
            }
            i++;
        }

        // Add remaining elements from arr2
        while (j < m) {
            // Add arr2[j] to the result list if it's not a duplicate
            if (j == 0 || arr2[j] != arr2[j - 1]) {
                myList.add(arr2[j]);
            }
            j++;
        }

        return myList;
    }

    // Function to print the elements of an ArrayList
    public static void printArrayList(ArrayList<Integer> list) {
        for (int num : list) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Test arrays
        int[] arr1 = {1, 2, 2, 3, 4};
        int[] arr2 = {2, 3, 3, 5};
        
        // Find the union of arr1 and arr2
        ArrayList<Integer> union = findUnion(arr1, arr2, arr1.length, arr2.length);
        
        // Print the union
        System.out.println("Union of arr1 and arr2:");
        printArrayList(union); // Expected output: 1 2 3 4 5
    }


}
