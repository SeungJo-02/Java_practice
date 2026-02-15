package LevelZero;

class Solution10_2 {
    public String solution(String my_string, String overwrite_string, int s) {
        String before = my_string.substring(0,s);
        String after = my_string.substring(s + overwrite_string.length());
        String answer = before + overwrite_string + after;
        return answer;
    }

    static void main(String[] args) {
        Solution10_2 solution10_2 = new Solution10_2();
        System.out.println( solution10_2.solution("He11oWor1d", "lloWorl", 2));;
    }
}
