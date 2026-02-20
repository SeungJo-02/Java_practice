package LevelZero.Feb17;

public class Solution18_h {
    public int solution(int n) {
        int answer = 0;
        if (n % 2 != 0) {// 홀수라면
            for (int i = 1; i <=n; i++) {
                if (i % 2 !=0 ) {
                    answer += i;
                }else {
                    continue;
                }
            }
        }else {//짝수라면
            for (int i = 1; i <=n; i++) {
                if (i % 2 ==0 ) {
                    answer += Math.pow(i,2);
                }else {
                    continue;
                }
            }

        }
        return answer;
    }

    static void main(String[] args) {
        Solution18_h solution19 =new Solution18_h();
        int result = solution19.solution(10);
        System.out.println(result);
    }
}
