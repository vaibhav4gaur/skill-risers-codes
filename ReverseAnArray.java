public class ReverseAnArray {
    public static void main(String[] args) {
        int arr[] = {100,280,130,240,650};
        int i=0;
        int j = arr.length - 1;
        while(i<j)
        {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

        System.out.println("After Reverse");
        for(int element:arr){
            System.out.println(element);
        }

    }
}
