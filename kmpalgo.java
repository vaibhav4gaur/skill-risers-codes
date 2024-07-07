public class kmpalgo {
    public static void main(String[] args) {
        String text = "abxabcabcabz";
        String pattern = "abcabz";
        int patternLength = pattern.length();
        int lps[] = new int[patternLength];
        lps[0] = 0; //Because prefix intially 
        int length = 0;//Previous longest prefix
        int i=1;
        //filling lps array
        //Time and space is O(n)
        while(i<patternLength)
        {
               if(pattern.charAt(i) == pattern.charAt(length))
               {
                length++;
                lps[i] = length;
                i++;
               }
               else
               {
                if(length!=0)
                {
                    length = lps[length-1];
                }
                else{
                    lps[i] = 0;
                    i++;
                }
               }
        }
        //Now do the pattern matching
        i = 0; //text
        int j = 0; //pattern

        while(i<text.length())
        {
            if(pattern.charAt(j) == text.charAt(i)){
                i++;
                j++;
            }
            if(j == patternLength)
            {
                System.out.println("Pattern Found "+(i-j));
                j = lps[j-1];
            }
            else if(i<text.length() && pattern.charAt(j) != text.charAt(i)){
                if(j!=0){
                    j = lps[j-1];
                }
                else{
                    i++;
                }
            }
        }


    }
}
