package LevelZero.Feb26_12.Re;

public class Solution4 {
    public int[] solution(int start_num, int end_num) {

        int[] answer =new int[start_num - end_num + 1];

        for (int i = 0; i < start_num - end_num + 1; i++) {
            answer[i] = start_num - i;
        }
        return answer;
    }

}
