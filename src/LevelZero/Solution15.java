package LevelZero;

public class Solution15 {
    public int solution(int a, int b) {
        int ab = Integer.parseInt(a+""+b);
        int a2b = a*2*b;

        return ab> a2b ? ab:a2b;
    }

    static void main(String[] args) {
        Solution15 solution15 = new Solution15();
        System.out.println(solution15.solution(2,91));
    }

}
