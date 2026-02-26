
package LevelZero.Feb26_12.Re;

public class Solution5 {
    public int solution(int[] arr, int idx) {
        int answer = -1 ;

        for (int i = idx; i < arr.length; i++) {
            if (arr[i] == 1) {
                return i;
            }
        }

        return answer;
    }

}
