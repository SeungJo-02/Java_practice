package LevelZero.Feb26_12;

public class Solution2 {
    public int solution(int[] num_list) {
        int answer = 0;
        for (int num : num_list) {
            if (num >= 0) {
                answer += 1;
            } else {
                return answer;
            }
        }
        return -1;
    }
}

