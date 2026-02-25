package LevelZero.Feb19_6.review;

public class Solution30_re {
    public int[] solution(int[] arr, int[][] queries) {

        int len = queries.length;;
        int[] answer = new int[len];

        for (int q = 0; q < len; q++) {
            int s = queries[q][0];
            int e = queries[q][1];
            int k = queries[q][2];

            int minVal = Integer.MAX_VALUE;

            for (int i = s; i < e; i++) {
                if (arr[i] > k && arr[i]< minVal) {
                    minVal = arr[i];
                }
            }
            if (minVal == Integer.MAX_VALUE){
                answer[q] = -1;
            }else{
             answer[q] = minVal;
            }
        }
        return answer;
    }
}
