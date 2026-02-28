package LevelZero.Feb28_Re;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Solution2 {
    public int[] solution(int[] num_list, int n) {

        int[] s = Arrays.copyOfRange(num_list, n, num_list.length);
        int[] e = Arrays.copyOf(num_list, n);

        int[] result = IntStream.concat(Arrays.stream(s), Arrays.stream(e)).toArray();

        return result;
    }
}
