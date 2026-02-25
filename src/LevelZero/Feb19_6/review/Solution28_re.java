
package LevelZero.Feb19_6.review;

public class Solution28_re {
    public String solution(int[] numLog) {
        int len = numLog.length;
        StringBuffer answer = new StringBuffer();

        for (int i = 1; i < len; i++) {
            int next = numLog[i];
            int pre = numLog[i-1];

            switch (next-pre){
                case(1): answer.append('w');break;
                case(-1): answer.append('s');break;
                case(10): answer.append('d');break;
                case(-10): answer.append('a');break;
            }

        }return answer.toString();
    }

//    static void main(String[] args) {
//        Solution28_re solution28Re = new Solution28_re();
//        int[] ss = {0, 1, 0, 10, 0, 1, 0, 10, 0, -1, -2, -1};
//       String result = solution28Re.solution(ss);
//        System.out.println(result);
//    }


}
