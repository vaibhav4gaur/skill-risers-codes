public class TreeRecursion {
    static void fun(int num){
        if(num<=0){
            return;
        }
        System.out.println("Pre-Call "+num);
        fun(num-1);
        System.out.println("In-b/w Call "+num);
        fun(num-2);
        System.out.println("Post-Call "+num);
    }
    public static void main(String[] args) {
        fun(3);
    }
}
