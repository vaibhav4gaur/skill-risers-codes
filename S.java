import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;



public class S {
public static void main(String[] args) {
    HashMap<Integer,Integer>map = new HashMap<>();
    map.put(1,3);
    map.put(2,3);
    map.put(3,4);
    
    ArrayList<Map.Entry<Integer,Integer>>l = new ArrayList<>(map.entrySet());
//     l.add(10);
//     l.add(20);
//     l.add(1);
// Collections.sort(l);
Collections.sort(l,(first,second)->first.getValue().equals(second.getValue())?second.getKey().compareTo(first.getKey()):
second.getValue().compareTo(first.getValue()));
System.out.println(l);
 }   
}
