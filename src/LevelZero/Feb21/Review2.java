package LevelZero.Feb21;

import java.util.ArrayList;

public class Review2 {
    public int[] solution(int l, int r) {
        ArrayList<Integer> answer = new ArrayList<>();

        for (int i = l; i < r; i++) {
            String str = String.valueOf(i);
            boolean flag = true;

            for (int j = 0; j < str.length(); j++) {
                char c = str.charAt(j);

                if (c != '0' && c != '5') {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                answer.add(i);
            }
        }

        if (answer.size() == 0){
            return  new int[] {-1};
        }

        int[] answers =new int[answer.size()];

        for (int i = 0; i <answer.size() ; i++) {
            answers[i] = answer.get(i);
        }
        return answers;

    }
}
