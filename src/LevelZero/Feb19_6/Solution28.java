package LevelZero.Feb19_6;

public class Solution28 {
    public String solution(int[] numLog) {
        int len = numLog.length;

        StringBuffer answer = new StringBuffer();

        for (int i = 0; i < len-1; i++) {
            if (numLog[i+1] - numLog[i] == 1 ) {
                answer.append('w');
            } else if (numLog[i+1] - numLog[i] == 10) {
                answer.append('d');
            } else if (numLog[i+1] - numLog[i] == -1) {
                answer.append('s');
            } else if (numLog[i+1] - numLog[i]== -10) {
                answer.append('a');
            }
        } return answer.toString();
    }
}
