package LevelZero.Feb20.review;

public class Solution3_re {
    public int[] solution(int start_num, int end_num) {

        int len = end_num-start_num + 1;//7

        int[] answer = new int[len];//7칸

        for (int i = 0; i <= len; i++) {//7번 반복 + 3~10;
                answer[i] = start_num + i;


        }
        return answer;
    }
}
