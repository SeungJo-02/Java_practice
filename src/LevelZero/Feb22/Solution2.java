package LevelZero.Feb22;

import java.util.Arrays;

public class Solution2 {
    public int solution(int a, int b, int c, int d) {
        int[] answer = {a,b,c,d};
        Arrays.sort(answer);

        if (answer[0]==answer[3]){
            return 1111* answer[3];
        } else if (answer[0] == answer[2]) {
            return (10*answer[2]+answer[3])*(10*answer[2]+answer[3]);
        } else if (answer[1]==answer[3]) {
            return (10*answer[3]+answer[0])*(10*answer[3]+answer[0]);
        } else if (answer[0]== answer[1] && answer[2] == answer[3]) {
            return (answer[0] + answer[2]) * Math.abs(answer[1] - answer[3]);
        } else if (answer[0]==answer[1]) {
            return answer[2]*answer[3];
        }else if (answer[1]==answer[2]) {
            return answer[0]*answer[3];
        }else if (answer[2]==answer[3]) {
            return answer[0]*answer[1];
        } else {
            return answer[0];
        }
    }
}
