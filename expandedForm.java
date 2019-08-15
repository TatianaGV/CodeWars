public class Kata
{
    public static String expandedForm(int num)
    {
        double countDigit = Math.ceil(Math.log10(num));
        int pow = 1;
        boolean checkZero = true;
        String resultStr = "";
        //обработаем 1 цифру, чтобы справа от нее не ставился +
        int buff = num % 10;
        if (buff != 0 ){
            resultStr = String.valueOf(buff * pow);
            checkZero = false; //крайняя справа цифры не 0
        }
        for(int i = 2; i <= (int)countDigit; i++){
            num = num / 10;
            pow *= 10;
            if ( num % 10 != 0)
                if (!checkZero)
                    resultStr = String.valueOf(num % 10 * pow) + " + " + resultStr;
                else{
                    resultStr = String.valueOf(num % 10 * pow) + resultStr;
                    checkZero = false;
                }
        }
        return  resultStr;
    }
}