import java.util.ArrayDeque;
public class Evaluator {

    public long evaluate(String s) {
        ArrayDeque<String> states = new ArrayDeque<String>();
        String[] elements = s.split(" ");
        long result = 0;
        for(String elem : elements){
            if(!isNumeric(elem)) {
                Integer operand1 = Integer.parseInt(states.pop());
                Integer operand2 = Integer.parseInt(states.pop());
                result = doMath(elem, operand1, operand2);
                states.addFirst(Integer.toString((int)result));
            }else
                states.addFirst(elem);
        }
        return Integer.parseInt(states.pop());
    }

    private static int doMath(String token, Integer op1, Integer op2){
        if (token.equals("+"))
            return op1 + op2;
        if (token.equals("-"))
            return op1 - op2;
        if (token.equals("/"))
            return op2 / op1;
        if (token.equals("*"))
            return op1 * op2;
        return 0;
    }
    
    
    public static boolean isNumeric(String s) {
        return s != null && s.matches("[-+]?\\d*\\.?\\d+");
    }
}