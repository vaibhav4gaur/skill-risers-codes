import java.util.Vector;
import java.util.ArrayList;
public class second {
    static void show(ArrayList<Integer>list){

    }
    public static void main(String[] args) {
        ArrayList<Integer>a = new ArrayList<>();
        // a = new Vector<>();
        //static vs dynamic array
        int arr[] = new int [10];
        //Dynamic Array
         ArrayList<Integer>list = new ArrayList<>();
         show(list);
        for(int i=1;i<=20;i++)
        {
            list.add(i);
        }
        System.out.println(list);
    }
}
