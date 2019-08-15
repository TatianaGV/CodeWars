public class Solution {
    public static String camelCase(String str) {
        if (str.isEmpty()) return "";
        String[] list = str.trim().split(" ");
        String resultStr = "";
        for (String elem : list){
            if (elem.isEmpty()) continue;
            resultStr += Character.toUpperCase(elem.charAt(0)) + elem.substring(1);
        }
        return resultStr;
    }
}