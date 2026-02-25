package LevelZero.Feb20_7;

import java.util.ArrayList;

public class Solution3 {
    public int[] solution(int start_num, int end_num) {

        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = start_num; i <= end_num; i++) {
            arr.add(i);
        }

        int[] answer = new int[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            answer[i] = arr.get(i);
        }
        return answer;
    }
}
