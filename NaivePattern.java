public class NaivePattern {
    public static void main(String[] args) {
        String text = "abcdefabctyp";
        String pattern = "abc";
        //slide the pattern top of text , Pick one letter each time
        for(int i=0; i<text.length() - pattern.length();i++)
        {
            int j;
            for(j=0; j<pattern.length();j++)
            {
                if(text.charAt(i+j) != pattern.charAt(j))
                {
                    break;
                }
            }
            if(j == pattern.length()){
                System.out.println(" Found "+i);
            }
        }
    }
}
