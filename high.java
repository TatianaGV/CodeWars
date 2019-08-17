public class Kata {

    public static String high(String str) {
        String result = "";
        int MaxValue = Integer.MIN_VALUE;
        String[] buff = str.split(" ");
        for(int i = 0; i < buff.length; i++){
            int sum = 0;
            for(int j = 0; j < buff[i].length(); j++)
                sum += (int) buff[i].charAt(j) - 'a' + 1;
            if (sum > MaxValue) {
                MaxValue = sum;
                result = buff[i];
            }
        }
        return result;
    }
}