package LevelZero.Feb20_7;

import java.util.ArrayList;

public class Solution2_h {
    public int[] solution(int l, int r) {
        ArrayList<Integer> answer = new ArrayList<>();

        for (int i = l; i <= r; i++) {
            String str = String.valueOf(i);//l~r까지의 숫자들
            boolean isval = true; // 체크 깃발

            for (int j = 0 ; j < str.length(); j++){
                char c = str.charAt(j);

                if (c != '0' && c != '5') {
                    isval = false;
                    break;
                }
            }

            if (isval){
                answer.add(i);
            }
        }

        if (answer.isEmpty()){
            return new int [] {-1};
        }

        int[] answers = new int[answer.size()];

        for (int i = 0; i < answer.size(); i++) {
            answers[i] = answer.get(i);

        }

        return answers;
    }
}
