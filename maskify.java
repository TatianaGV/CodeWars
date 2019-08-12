public class Maskify {
     public static String maskify(String str) {
        char[] buff = str.toCharArray();
        for(int i = 0; i < (buff.length - 4); ++i){
            buff[i] = '#';
        }
        return String.valueOf(buff);
    }

}