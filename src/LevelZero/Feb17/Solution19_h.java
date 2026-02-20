package LevelZero.Feb17;

public class Solution19_h {
    public int solution(String ineq, String eq, int n, int m) {
        String oper = ineq + eq;
        boolean result = false;
        switch (oper) {
            case (">="):
                result = n >= m;
                break;
            case ("<="):
                result = n <= m;
                    break;
            case ("<!"):
                result = n < m;
                    break;
            case (">!"):
                result = n > m;
                    break;

        }return result ? 1:0;
    }
}
