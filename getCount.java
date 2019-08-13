import java.util.ArrayList;
import java.util.Arrays;
public class Vowels {

     public static int getCount(String str) {
        ArrayList<String> list = new ArrayList();
        list.add("a");
        list.add("i");
        list.add("o");
        list.add("e");
        list.add("u");
        long vowelsCount = Arrays.stream(str.split("")).filter(s -> list.contains(s)).count();
        return (int)vowelsCount;
    }

}