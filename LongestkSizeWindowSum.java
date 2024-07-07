public class LongestkSizeWindowSum {
    public static void main(String[] args) {
        int nums[] = {3,-1,4,12,-8,5,6};

        int k = 5;
        int sum = 0;
        int max = 0;
        for(int i=0; i<k;i++)
        {
            sum += nums[i];
        }
        max = sum;
        for(int i = k; i<nums.length;i++)
        {
            sum += nums[i]-nums[i-k];
            max = Math.max(max,sum);
        }
        System.out.println(max);
    }
}
