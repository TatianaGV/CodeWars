import java.util.Arrays;
public class Kata
{
    private static long bigger(long num) {
        char[] cs = String.valueOf(num).toCharArray();
        Arrays.sort(cs);
        StringBuffer buffer = new StringBuffer(String.valueOf(cs));
        buffer.reverse();
        return Long.parseLong(String.valueOf(buffer));
    }

    public static long nextBiggerNumber(long n) {
        if (n <= 10)
            return -1;
        long bigNum = bigger(n);
        if (n == bigNum)
            return -1;
        long i = n;
        while (i < bigNum) {
            if (bigger(i) == bigNum && i > n) {
                return i;
            }
            i++;
        }
        return i;
    }
}