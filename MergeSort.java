public class MergeSort {
    public static void main(String[] args) {
        int arr[] = {39,27,42,9,3,82,10};
        mergeSort(arr, 0 ,arr.length-1);
            for(int val : arr)
            {
                System.out.println(val);
            }
    }
    //Divide and Conquor
    static void mergeSort(int arr[],int left,int right){
       //Base Case
        if(left<right){
        int mid = (left+right)/2;
        //first half
        mergeSort(arr,left,mid);
        //Second Half
        mergeSort(arr,mid+1,right);
        //During stack fall , then we do combine
        //combine /merge
        merge(arr,left,mid,right);
        }
    }
    //compare and combine(merge)
    static void merge(int arr[],int left,int mid,int right){
        int n1 = mid - left + 1;
        int leftArray[] = new int[n1];
        int n2 = right - mid;
        int rightArray[] = new int[n2];
        //copy the left and right data based on small to big 
        for(int i=0;i<n1;i++){
            leftArray[i] = arr[left + i];
        }
        //fill the right array
        for(int i=0;i<n2;i++)
        {
            rightArray[i] = arr[mid+1+i];
        }
        //finally we need to prepare to merge sorted merge sub array
        int i=0;
        int j=0;
        int k = left;
        while(i<n1 && j<n2){
            if(leftArray[i]<=rightArray[j]){
                arr[k] = leftArray[i];
                i++;
        }
        else{
            arr[k] = rightArray[j];
            j++;
        }
        k++;
    }
    //if any array exhaust on above loop
    while(i<n1){
        arr[k] = leftArray[i];
        i++;
        k++;
    }
    while(j<n2){
        arr[k] = rightArray[j];
        j++;
        k++;
    }
}
}
