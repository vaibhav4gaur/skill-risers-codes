import java.util.ArrayList;
import java.util.List;

public class subseq {


static List<String>generateAllSubSeq(String str){




    if(str.length()==0)
    {
        List<String>list = new ArrayList<>();
        list.add(" ");
        return list;
    }
    //Recursive Call(Small Problem)
    List<String>newlist = new ArrayList<>();
    List<String>oldlist = generateAllSubSeq(str.substring(1));
    
    
    for(int i=0; i<oldlist.size();i++)
    {
        newlist.add(oldlist.get(i));
        newlist.add(str.charAt(0) + oldlist.get(i));

    }
    return newlist;
}



















   public static void main(String[] args) {
    List<String>result = generateAllSubSeq("vaibhav");
    System.out.println(result);
   }    
}
