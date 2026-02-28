package LevelZero.Mar1_15;

public class Solution5 {
    public int solution(String myString, String pat) {

       String upper = myString.toUpperCase();
       String upperfat = pat.toUpperCase();

        return upper.contains(upperfat) ? 1:0;
    }
}
