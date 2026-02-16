package LevelZero;

class Solution11 {
    public String solution(String str1, String str2) {
        String answer = "" ;
        for (int i = 0; i < str1.length(); i++) {
            char a = str1.charAt(i);
            char b = str2.charAt(i);
            answer = answer + String.valueOf(a) +Character.toString(b);

        }
        return answer;
    }

    static void main(String[] args) {
        Solution11 solution11 = new Solution11();
        String result = solution11.solution("aaaaa","bbbbb");
        System.out.println(result);
    }
}
