package LevelZero;

class Solution14 {
    public int solution(int a, int b) {
        int ab = Integer.parseInt(a+""+b);
        int ba = Integer.parseInt(b+""+a);

        return Math.max(ab,ba); // ab > ba ? ab : ba
    }

    static void main(String[] args) {
        Solution14 solution14 = new Solution14();
        System.out.println(solution14.solution(12,4));
    }
}
