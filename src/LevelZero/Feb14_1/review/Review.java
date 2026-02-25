package LevelZero.Feb14_1.review;
// 4번 다시 한 번 풀어보기

import java.util.Scanner;
public class Review {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        StringBuffer c = new StringBuffer();

        for (int i = 0; i < a.length(); i++) {
            char word = a.charAt(i);

            if (Character.isUpperCase(word)) {
                c.append(Character.toLowerCase(word));
            } else {
                c.append(Character.toUpperCase(word));
            }

        }System.out.println(c.toString());
    }
}
