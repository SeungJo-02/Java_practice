package LevelZero.Feb19;

public class Solution26_h {
    public int[] solution(int[] num_list){
        int len = num_list.length;

        int[] answer = new int[len + 1];

        for (int i = 0; i < len; i++) {
            answer[i] = num_list[i];
        }

        int last = num_list[len -1];
        int prev = num_list[len -2];

        answer[len] =last >prev ?  last - prev : last*2;

        return answer;
    }
}
