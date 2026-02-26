package LevelZero.Feb26_12.Re;

public class Solution1 {
    public int[] solution(String my_string) {

        int[] answer = new int[52];

        for (int i = 0; i < my_string.length(); i++) {
            char c = my_string.charAt(i);
            int idx = Character.isUpperCase(c) ? (c - 'A') : (c - 'a' + 26);
            answer[idx] ++;
        }

        return answer;
    }
}
