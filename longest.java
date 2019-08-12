import java.util.ArrayList;
import java.util.List;
import java.util.HashSet;

public class TwoToOne {
    public static String longest (String s1, String s2) {
        String buff = s1 + s2;
        char[] symbols = buff.toCharArray();
        List<Character> baseList = new ArrayList<Character>();
        for (int i = 0; i < symbols.length; i++){
            baseList.add(symbols[i]);
        }
        List<Character> sortSymbol = new ArrayList<Character>(new HashSet<Character>(baseList));
        StringBuilder strBuild = new StringBuilder();
        for(Character ch : sortSymbol){
            strBuild.append(ch);
        }
        return strBuild.toString();
    }
}