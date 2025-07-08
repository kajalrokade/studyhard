package practice.src.DSA.Questions;

public class StringSubsequence {
    public static void main(String[] args) {
        String s = "abcdbefghbde";
        String t = "bde";
        System.out.println(getSubsequence(s,t));

    }

    private static String getSubsequence(String s, String t) {
        String ans = "";
        int j=0;
        for(int i=0; i<s.length(); i++){
            if(j==t.length()){
               return ans;
            }else if(s.charAt(i) == t.charAt(j)){
                ans+=s.charAt(i);
                j++;
            }else if(j>0){
                ans+=s.charAt(i);
            }
        }
        return null;
    }
}
