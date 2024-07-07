public class QuickSort {
    static void quickSort(int arr[],int start,int end){
        int i = start;
        int j = end -1;
        int pivot = end;
        while(i<=j){
              while(arr[i]<arr[pivot]){
                i++;
              }
              while(j>=start && arr[j]>=arr[pivot]){
                j--;
              }
              if(i<=j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
              }
        }
        //Cross i and j each other
        //Swap ith with pivot 
        int t = arr[i];
        arr[i] = arr[pivot];
        arr[pivot] = t;
        if(start<i-1){
         quickSort(arr,start,i-1);
    }
    if(i+1<end){
        quickSort(arr,i+1,end);
    }
}
    public static void main(String[] args) {
        int[] arr = {4,5,2,7,9,1};
        quickSort(arr,0,arr.length-1);
        for(int val : arr)
        {
            System.out.println(val);
        }
    }
}
