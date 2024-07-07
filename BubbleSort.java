public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = {5,3,8,1,4,6,2}; //TC : O(N^2)   //SC : O(N)
        for(int i=0; i<arr.length;i++){
            for(int j=0; j<arr.length-1;j++){
                if(arr[j]>arr[j+1]){
                    //Do the swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        //Outcome
        for(int val:arr){
            System.out.println(val);
        }
    }
}
