package LevelZero;

class Solution11_2 {
    public String solution(String str1, String str2) {
        String answer = "";

        for(int i = 0; i < str1.length(); i++){
            answer+= str1.charAt(i);
            answer+= str2.charAt(i);
        }

        return answer;
    }
    static void main(String[] args) {
        Solution11 solution11_2 = new Solution11();
        String result = solution11_2.solution("aaaaa","bbbbb");
        System.out.println(result);
    }
}