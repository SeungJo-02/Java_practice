package LevelZero.Feb16;

public class Solution11_3 {
    public String solution(String str1, String str2) {
        StringBuffer answer = new StringBuffer();
        for (int i = 0; i < str1.length(); i++) {
            answer.append(str1.charAt(i));
            answer.append(str2.charAt(i));
        }
        return answer.toString();
    }
}
