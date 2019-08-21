public class Line {
    public static String Tickets(int[] peopleInLine) {
        int count25 = 0;
        int count50 = 0;
        for(int visiter : peopleInLine){
            if (visiter == 25)
                count25++;
            if (visiter == 50) {
                if (count25 >= 1){
                    count50++;
                    count25--;
                }else
                    return "NO";
            }
            if (visiter == 100) {
                if (count25 >= 1 && count50 >= 1){
                    count25--;
                    count50--;
                }else if (count25 >= 3){
                        count25 -= 3;
                }else
                    return "NO";
            }
        }
        return "YES";
    }
}
