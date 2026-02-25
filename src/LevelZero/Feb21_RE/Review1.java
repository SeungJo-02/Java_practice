package LevelZero.Feb21_RE;

public class Review1 {
    public int[] solution(int[] arr, int[][] queries) {
        for (int q = 0; q < queries.length; q++) {
            int s = queries[q][0];
            int e = queries[q][1];
            int k = queries[q][2];

            for (int i = s; i < e; i++) { //i는 s ~ e 사이의 배열 인덱스
               arr[i] += i%k == 0 ? 1:0;
            }
        } return arr;

    }
}
