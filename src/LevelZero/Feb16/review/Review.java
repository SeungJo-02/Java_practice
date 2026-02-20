package LevelZero.Feb16.review;

public class Review {
    public int solution(int a, int b) {
        int first = Integer.parseInt(a+""+b);
        int second = Integer.parseInt(b+""+a);
        return  first >= second ? first :second;
    }
}
