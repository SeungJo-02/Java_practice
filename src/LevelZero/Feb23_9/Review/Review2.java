package LevelZero.Feb23_9.Review;
//Feb 22 4번 풀기
public class Review2 {
    public int solution(String number) {
        int n = 0;

        for (int i = 0; i < number.length(); i++) {
            char c = number.charAt(i);

            n += Character.getNumericValue(c);
        }

        return n % 9;
    }
}
