package LevelZero.Feb25_11;

public class Solution5_h {
    public int solution(int[] arr, int idx) {
        int answer = -1;

        for (int i = idx; i < arr.length; i++) {
            if (arr[i] == 1) {
                answer =  i;
                break;
            }

        }return answer;
    }
}
