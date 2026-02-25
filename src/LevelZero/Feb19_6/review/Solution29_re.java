package LevelZero.Feb19_6.review;

public class Solution29_re {
    public int[] solution(int[] arr, int[][] queries) {

        for (int k = 0; k < queries.length; k++) {
            int i = queries[k][0];//0
            int j = queries[k][1];//3

            int temp =arr[i];// temp는 단순 숫자로 와야 함
            arr[i] = arr[j];
            arr[j] = temp;
        }
        return arr;
    }
}
