package LevelZero.Feb20;

class Solution1_h {
    public int[] solution(int[] arr, int[][] queries) {

        for (int q = 0; q < queries.length; q++) {
            int s = queries[q][0];//시작
            int e = queries[q][1];//끝
            int k = queries[q][2];//비교

            for (int i = s; i <=e; i++) {
                arr[i] += i%k ==0 ? 1:0;
            }
        }
        return arr;
    }

}
