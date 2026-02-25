package LevelZero.Feb18_5.review;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Solution23_re {
    public int solution(int a, int b,int c){
    Set<Integer> numbers = Stream.of(a,b,c).collect(Collectors.toSet());

        return (a + b + c) * //전부 다를 때
                (numbers.size() < 3 ? a * a + b * b + c * c : 1) *
                (numbers.size() < 2 ? a * a * a + b * b * b + c * c * c : 1); // 다 같을 때
    }
}
