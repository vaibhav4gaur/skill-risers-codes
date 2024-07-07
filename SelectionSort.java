public class SelectionSort {
    public static void main(String[] args) {
        int arr[] = {2,6,7,8,1,4};
        int n = arr.length;
        //First Pass to get the Minimum
        for(int i=0; i<n-1; i++)
        {
            int minIndex = i;
            for(int j=i+1; j<n; j++)
            {
                //pick the minimum from the RHS of the array
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }

            //Swap Min index value the first pass index

            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;


           
        }
         for(int val : arr)
            {
                System.out.println(val);
            }
    }
}
