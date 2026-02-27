package LevelZero.Feb27_13;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Solution2_R {
    public int[] solution(int[] num_list, int n) {

        int[] s = Arrays.copyOfRange(num_list,n, num_list.length);
        int[] e = Arrays.copyOfRange(num_list,0, n);

        int[] result = IntStream.concat(Arrays.stream(s), Arrays.stream(e)).toArray();

        return result;
    }
}
