import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class isogram {
    public static boolean  isIsogram(String str) {
        int lengthStr = str.length();
        char[] buff = str.toLowerCase().toCharArray();
        List<Character> baseList = new ArrayList<Character>();
        for (int i = 0; i < buff.length; i++){
            baseList.add(buff[i]);
        }
        List<Character> sortSymbol = new ArrayList<Character>(new HashSet<Character>(baseList));
        return sortSymbol.size() == lengthStr ? true : false;
    }

    public static void main(String[] args){
        System.out.println(isIsogram("moOse"));
    }
}