package practice.src.DSA.Strings;

public class LastWordLength {
    public static void main(String[] args) {
        LastWordLength l = new LastWordLength();
        System.out.println(l.lengthOfLastWord(" Hello World "));
    }

    public int lengthOfLastWord(final String A) {

        String S = A.trim();
        int startIndex = 0;
        int endIndex = S.length();
        for (int i = startIndex; i < endIndex; i++) {

            if (S.charAt(i) == ' ') {
                startIndex = i + 1;
            }
        }
        String str = S.substring(startIndex, endIndex);
        return str.length();
    }
}
