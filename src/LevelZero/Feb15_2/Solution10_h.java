package LevelZero.Feb15_2;

class Solution10_h {
    public String solution(String my_string, String overwrite_string, int s) {
        //앞부분
        String first = my_string.substring(0,s);
        // 뒷 부분 조정하기
        int overlen = overwrite_string.length();
        String last = my_string.substring(s + overlen);

        String answer = first + overwrite_string + last;
        return answer;
    }

    public static void main(String[] args) {
        Solution10_h sol = new Solution10_h();
        System.out.println(sol.solution("He11oWor1d",	"lloWorl",2));
    }
}