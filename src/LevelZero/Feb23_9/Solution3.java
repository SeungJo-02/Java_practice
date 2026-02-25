package LevelZero.Feb23_9;

public class Solution3 {
    public String solution(String my_string, int n) {
        int len = my_string.length();

        String answer = my_string.substring(len - n);
        return answer;
    }
}
