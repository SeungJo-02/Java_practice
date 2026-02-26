package LevelZero.Feb26_12.Re;

import java.util.ArrayList;
import java.util.stream.IntStream;

public class Solution2 {
    public int[] solution(int n, int k) {
        return IntStream.rangeClosed(1, n).filter(i -> i % k == 0).toArray();
    }
}