public class Scramblies {
    
    public static boolean scramble(String str1, String str2) {
        int count = 0;
        boolean check = false;
        char[] charStr1 = str1.toCharArray();
        char[] charStr2 = str2.toCharArray();
        for(int i = 0; i < charStr2.length; i++) {
            for (int j = 0; j < charStr1.length; j++) {
                if ((charStr2[i] == charStr1[j]) && (!check)) {
                    count++;
                    charStr1[j] = ' ';
                    check = true;
                }
            }
            check = false;
        }
       return count == str2.length();
    }
}