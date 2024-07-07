public class longestSubarraySum {
    public static void main(String[] args) {
        int arr[] = {3,1,2,7,4,2,1,1,5};
        int k = 8;

        int left = 0;
        int current_sum = 0;
        int max = 0;

        for(int right = 0; right < arr.length; right++){
            current_sum = current_sum + arr[right];
        
        while(current_sum > k){
            current_sum = current_sum - arr[left];
            left++;
        
        }
        max = Math.max(max , right-left+1);
        // return max;
    }
       System.out.println(max);
    }
   
}
