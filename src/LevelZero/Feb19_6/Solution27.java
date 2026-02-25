package LevelZero.Feb19_6;

public class Solution27 {
    public int solution(int n, String control) {
        int len = control.length();
        for (int i = 0; i < len; i++) {
            switch (control.charAt(i)){ // 문자열에서 특정 문자 하나 꺼낼 때는 charAt 사용하기
                case ('w'):
                    n += 1;
                    break;
                case ('s'):
                    n -= 1;
                    break;
                case ('d'):
                    n += 10;
                    break;
                case ('a'):
                    n -= 10;
                    break;
            }
        }
        return n;
    }
}
