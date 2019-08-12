class Kata {
     public static String getMiddle(String word) {
       if (word.length() % 2 == 1){
            int numberOfSymbol = word.length() / 2;
            String symbol = Character.toString(word.charAt(numberOfSymbol));
            return symbol;
       }else{
           int numberOfSymbol = word.length() / 2;
           String symbolFirst = Character.toString(word.charAt(numberOfSymbol - 1));
           String symbolSecond = Character.toString(word.charAt(numberOfSymbol));
           return symbolFirst + symbolSecond;
       }
    }
}