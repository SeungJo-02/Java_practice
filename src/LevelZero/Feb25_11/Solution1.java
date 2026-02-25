package LevelZero.Feb25_11;

public class Solution1 {
    public int[] solution(String my_string) {
        int[] answer =new int[52];

        for (int i = 0; i < my_string.length(); i++) {
            char c = my_string.charAt(i);

            if (c >='A' && c <= 'Z'){ //아스키 코드로 알파벳 찾기
                answer[c -'A']++; //대문자는 0번부터, 1더하기
            } else if (c >= 'a' && c <= 'z'){
                answer[c - 'a' + 26]++; // 소문자는 26번부터, 1더하기
            }
        }
        return answer;
    }
}
