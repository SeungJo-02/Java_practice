package LevelZero.Feb22_8;

public class Solution3 {
    public String solution(String my_string, int[] index_list) {
        StringBuffer answer = new StringBuffer();

        for (int i = 0; i < index_list.length; i++) {
            int answerIndex = index_list[i];
            char c = my_string.charAt(answerIndex);
            answer.append(c);
        }

        return answer.toString();
    }
}
