package LevelZero.Feb25_11;

import java.util.stream.IntStream;

public class Solution2_2 {
    public int[] solution(int n, int k) {
        return IntStream.rangeClosed(1, n).filter(i -> i % k == 0).toArray();
    }//rangeClosed(1,n) : 1부터 n포함하는 스트림 만들기
}
