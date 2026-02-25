package LevelZero.Feb16_3;

class Solution14_h {
    public int solution(int a, int b) {
        int ab = Integer.parseInt(a+""+b);
        int ba = Integer.parseInt(b+""+a);

        return Math.max(ab,ba); // ab > ba ? ab : ba
    }

    static void main(String[] args) {
        Solution14_h solution14 = new Solution14_h();
        System.out.println(solution14.solution(12,4));
    }
}


//package LevelZero.Feb16.review;
//
//public class Review {
//    public int solution(int a, int b) {
//        int first = Integer.parseInt(a+""+b);
//        int second = Integer.parseInt(b+""+a);
//        return  first >= second ? first :second;
//    }
//}