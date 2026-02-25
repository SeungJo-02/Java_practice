package LevelZero.Feb22_8;

public class Solution4 {
    public int solution(String number) {
        int answer = 0;
        for (int i = 0; i < number.length(); i++) {
            char c = number.charAt(i);
            answer += Character.getNumericValue(c); // char를 숫자로
        }
        return answer % 9;
    }
}
