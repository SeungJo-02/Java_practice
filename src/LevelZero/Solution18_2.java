package LevelZero;

public class Solution18_2 {
    public int solution(int n) {
        int result = 0;
        for (int i = n; i >= 0; i-=2) {
            result += n%2 !=0 ? i : i*i;
        }return result;
    }

}
