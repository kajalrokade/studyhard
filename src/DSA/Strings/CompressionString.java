package src.DSA.Strings;

public class CompressionString {
        public  static int compress(char[] chars) {
            int count=1;
            String s="";

            for(int i=1;i<chars.length;i++){
                if(chars[i]==chars[i-1]){
                    count++;
                }else{
                    s+=chars[i-1]+count;
                    count=1;
                }
            }
            return s.length();

        }

    public static void main(String[] args) {
        char[] chars={'a','a','b','b','c','c','c','d'};
        System.out.println(compress(chars));
    }
}
