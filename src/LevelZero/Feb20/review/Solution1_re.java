package LevelZero.Feb20.review;

public class Solution1_re {
    public int[] solution(int[] arr, int[][] queries){

        for (int q = 0; q < queries.length; q++) {
            int s = queries[q][0];
            int e = queries[q][1];
            int k = queries[q][2];

            for (int i = s; i < e; i++) {
                arr[i] += i%k == 0 ? 1:0;
            }
        } return arr;
    }
}
