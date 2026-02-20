package LevelZero.Feb17.review;
// 18 19 다시 한 번 풀어보기!!!

public class Review {
    public int solution(int n) {
        int answer = 0;
        for (int i = n; i >= 0; i-=2) {
           answer +=  n%2 == 0 ? i*i: i;
        }return  answer;
    }

    static void main(String[] args) {
        Review review = new Review();
        System.out.println(review.solution(10));
    }
}