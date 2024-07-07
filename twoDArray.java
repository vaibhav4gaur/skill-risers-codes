public class twoDArray {
    public static void main(String[] args) {
        //array with number
        //new way part of array in the twoDarray
        int arr[][] = new int[3][];
        arr[0] = new int[5];
        arr[1] = new int[10];
        arr[2] = new int[20];
    // array will part of i and joint into the j combination satisfy 
    //twoD array is partially categories on matrics 
        // for(int i=0; i<arr.length;i++)
        // {
        //     for(int j=0; j<arr[i].length;j++)
        //     {
        //         System.out.print(arr[i][j]+" ");
        //     }
        //     System.out.println();
        // }
        //enhance loop
        for(int a[] : arr)
        {
            for(int b : a)
            {
                System.out.print(b+ " ");
            }
            System.out.println(a);

        }

    }
}
