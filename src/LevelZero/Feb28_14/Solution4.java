package LevelZero.Feb28_14;

public class Solution4 {
    public int solution(int[] numbers, int n) {
        int answer = 0;

        for (int number : numbers) {
            if (answer <= n) {
                answer += number;
            }else {
                break;
            }
        }

        return answer;
    }
}
