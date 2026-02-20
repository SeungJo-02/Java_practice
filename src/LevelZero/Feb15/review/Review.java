package LevelZero.Feb15.review;
//10번 다시 한 번 풀기

import java.util.Scanner;

public class Review {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";

        String st = my_string.substring(0,s);
        String last = my_string.substring(s + overwrite_string.length());// 지정한 거 부터 끝까지

        answer = st + overwrite_string + last;

        return answer;
    }
//
//    static void main(String[] args) {
//        Review review = new Review();
//
//        String result = review.solution("He11oWor1d", "lloWorl", 2);
//        System.out.println(result);
//    }
 }

