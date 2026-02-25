package LevelZero.Feb24_10;

public class Solution3 {
    public String solution(String my_string, int s, int e) {
        String fir = my_string.substring(0 , s);
        String last = my_string.substring(e + 1);
        String mid = "";

        for (int i = e; i >= s; i--) {//거꾸로 다 더하기
            mid += my_string.charAt(i);
        }

        String answer = fir + mid + last;
        return answer;
    }
}


//class Solution {
//    public String solution(String my_string, int s, int e) {
//        StringBuilder answer = new StringBuilder(my_string.substring(s, e + 1));
//        answer.reverse();
//        return my_string.substring(0, s) + answer + my_string.substring(e + 1);
//    }
//}