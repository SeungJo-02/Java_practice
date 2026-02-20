package LevelZero.Feb18.review;

public class Solution21_re {
    public  String solution(String code){
        StringBuffer answer = new StringBuffer();
        int mode = 0;

        for (int i = 0; i < code.length(); i++) {
            char c = code.charAt(i);
            if (c == '1') {
                mode = mode == 0 ? 1:0;
                continue;
                }
            if (i% 2 == mode) {
                answer.append(c);
            }
            }
        return answer.isEmpty() ? "EMPTY": answer.toString();
        }

    }
