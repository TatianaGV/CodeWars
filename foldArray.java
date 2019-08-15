import java.util.Arrays;
public class Kata
{
    public static int[] foldArray(int[] array, int runs) {
        int [] resultList = new int[array.length];
        System.arraycopy(array,0, resultList, 0, array.length);
        for(int i = 1; i <= runs; i++) {
            for(int j = 0; j < (resultList.length / 2); j++){
                resultList[j] = resultList[j] + resultList[resultList.length - 1 - j];
            }
            if (resultList.length % 2 == 1){
            resultList = Arrays.copyOf(resultList, (resultList.length / 2) + 1);
            } else
                resultList = Arrays.copyOf(resultList, resultList.length / 2);
        }
        return resultList;
    }
}