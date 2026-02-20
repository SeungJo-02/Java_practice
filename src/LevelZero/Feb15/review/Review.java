package LevelZero.Feb15.review;
//10번 다시 한 번 풀기

import java.util.Scanner;

public class Review {
    public String solution(String my_string, String overwrite_string, int s) {
        String start = my_string.substring(0,s);
        String last = my_string.substring(s + overwrite_string.length());
        String answer = start + overwrite_string + last;
        return answer;
    }
 }

