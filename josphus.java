public class josphus {

     static int josphus(int n, int k)
     {
        if(n==1){
            return 0;
        }
        return (josphus(n-1,k)+k) % n;
     }


    public static void main(String[] args) {
        int n = 5;
        int k = 3;
        System.out.println(josphus(n,k));
    }
}
