package LevelZero.Feb25_11;

import java.util.ArrayList;

public class Solution2 {
    public int[] solution(int n, int k) {
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            if (i % k  == 0) {
                arr.add(i);
            }
        }
        int[] answer = arr.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}


//import java.util.stream.IntStream;
//
//class Solution {
//    public int[] solution(int n, int k) {
//        return IntStream.rangeClosed(1, n).filter(i -> i % k == 0).toArray();
//    }
//}