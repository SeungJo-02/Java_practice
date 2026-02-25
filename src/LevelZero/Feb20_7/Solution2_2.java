package LevelZero.Feb20_7;

import java.util.ArrayList;

public class Solution2_2 {
    public int[] solution(int l, int r) {
        ArrayList<Integer> answer = new ArrayList<>();

        for (int i = l; i <= r; i++) {
            String str = String.valueOf(i);

            // 정규표현식을 사용하여 0과 5로만 이루어져 있는지 단번에 검사합니다!
            if (str.matches("[05]+")) {
                answer.add(i);
            }
        }

        if (answer.isEmpty()){
            return new int[] {-1};
        }

        int[] answers = new int[answer.size()];
        for (int i = 0; i < answer.size(); i++) {
            answers[i] = answer.get(i);
        }

        return answers;
    }
}
