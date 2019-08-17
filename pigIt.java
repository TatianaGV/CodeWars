import java.util.*;
public class PigLatin {
    public static String pigIt(String str) {
        String result = "";
        String[] buff = str.split(" ");
        for(int i = 0; i < buff.length; i++){
            List<Character> charStr = new ArrayList<>();
            for( char ch : buff[i].toCharArray()){
                charStr.add(ch);
            }
            Character firstLetter = charStr.get(0);
            charStr.remove(0);
            charStr.add(firstLetter);
            StringBuilder sb = new StringBuilder();
            for (Character ch : charStr) {
                sb.append(ch);
            }
            if(Character.isLetter(firstLetter))
                result += sb.toString() + "ay ";
            else
                result += sb.toString() + " ";
        }
        return result.trim();
    }
}