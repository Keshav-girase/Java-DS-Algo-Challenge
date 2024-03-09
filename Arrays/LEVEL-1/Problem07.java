

public class Problem07 {
    static int searchInSorted(int arr[], int n, int key) {
        
        // Your code here
        int start=0;
        int end=n-1;
        
        while(start<=end){
            
            int mid=(start+end)/2;
        
            if(arr[mid]==key){
                return 1;
            }
            else if(arr[mid]<key){
                start=mid+1;
            }
            else{
                end=mid-1; 
            }
            
        }
        
        return -1;
        
    }
    public static void main(String[] args) {
        
    }
}
