import java.util.LinkedList;
import java.util.Collections;
import java.util.List;

public class Solution {
    public static String lcs(String s1, String s2){
        Character[] a_char1 = new Character[s1.length()];
        Character[] a_char2 = new Character[s2.length()];
        for (int i = 0; i < s1.length(); i++)
            a_char1[i] = s1.charAt(i);
        for (int i = 0; i < s2.length(); i++)
            a_char2[i] = s2.charAt(i);

        int[][] num = new int[a_char1.length + 1][a_char2.length + 1];

        for (int i = 1; i <= a_char1.length; i++)
            for (int j = 1; j <= a_char2.length; j++)
                if (a_char1[i - 1].equals(a_char2[j - 1]))
                    num[i][j] = 1 + num[i - 1][j - 1];
                else
                    num[i][j] = Math.max(num[i - 1][j], num[i][j - 1]);

        int s1position = a_char1.length, s2position = a_char2.length;
        List<Character> result = new LinkedList<Character>();

        while (s1position != 0 && s2position != 0) {
            if (a_char1[s1position - 1].equals(a_char2[s2position - 1])) {
                result.add(a_char1[s1position - 1]);
                s1position--;
                s2position--;
            } else if (num[s1position][s2position - 1] >= num[s1position][s2position]) {
                s2position--;
            } else {
                s1position--;
            }
        }
        Collections.reverse(result);
        StringBuilder sb = new StringBuilder();
        for (Character ch : result) {
            sb.append(ch);
        }

        String string = sb.toString();
        return string;
    }


    public static void main (String[] args) {
        String my_result = "";
        String word1 = "notification";
        String word2 = "notefucashon";

        my_result = lcs(word1, word2);

        System.out.println(my_result);
    }
}
