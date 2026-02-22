package LevelZero.Feb21;

import java.util.ArrayList;

public class Review4 {
    public int[] solution(int n) {

        ArrayList<Integer> answer = new ArrayList<>();
        answer.add(n);

        while(true){
            if (n == 1) {
                break;
            } else if (n % 2 ==0) {
                n = n/2;
            } else if (n % 2 == 1) {
                n = n * 3 + 1;
            }
            answer.add(n);
        }
        int[] answers = answer.stream().mapToInt(Integer::intValue).toArray();
        return answers;
    }
}
