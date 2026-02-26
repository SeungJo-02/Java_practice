package LevelZero.Feb26_12;

import java.util.ArrayList;

public class Solution3 {
    public int[] solution(int[] arr, int[][] intervals) {

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < intervals.length; i++) {
            int s = intervals[i][0];
            int e = intervals[i][1];
            for (int j = s; j <= e; j++) {
                list.add(arr[j]);
            }
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
