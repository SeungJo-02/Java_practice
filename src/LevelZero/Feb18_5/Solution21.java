package LevelZero.Feb18_5;

public class Solution21 {
    public String solution(String code){
        int mode = 0;
        String ret = "";

        for (int i = 0; i < code.length(); i++) {
            char c = code.charAt(i);

            if (c == '1') {
                mode = (mode == 0) ? 1 : 0; //1을 만나면 모드 변경
            } else {
                if (mode == 0 && i %2 == 0) {
                    ret += c;
                } else if (mode == 1 && i %2 != 0) {
                    ret += c;

                }

            }
        }return ret.isEmpty() ? "EMPTY":ret;
    }
}
