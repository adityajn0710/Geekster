package class5;

import java.util.List;

public class BirthdayCakeCandles {
    public static int birthdayCakeCandles(List<Integer> candles) {
        int size = candles.size();
        int i = 0;
        int max = candles.get(i), count = 1;

        for (i = 1; i< size; i++){
            if (candles.get(i) > max){
                count = 1;
                max = candles.get(i);
            }
            else if(candles.get(i) == max){
                count++;
            }
        }
        return count;
    }

}
