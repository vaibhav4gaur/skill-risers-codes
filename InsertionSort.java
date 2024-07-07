public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {5,2,4,6,1,7,8,9};
        for(int i = 1;i<arr.length;i++){
            int firstPick = arr[i];
            //previous pick 
            int j = i-1;
            while(j>=0 && arr[j]>firstPick){
                arr[j+1] = arr[j];
                j--;
        }
        arr[j+1] = firstPick;
    }
    for(int val : arr)
    {
      System.out.println(val);
    }
}

}
