package LevelZero.Feb28_14;

import java.util.stream.IntStream;

public class Solution1 {
    public int solution(int[] num_list) {

        int sumOdd = IntStream.range(0,num_list.length).filter(i -> i % 2 == 1)
                .map(i -> num_list[i]).sum();
        int sumEven = IntStream.range(0,num_list.length).filter(i -> i % 2 == 0)
                .map(i -> num_list[i]).sum();


        return sumOdd>sumEven ? sumOdd:sumEven;
//        return Math.max(sumOdd, sumEven);
    }
}
