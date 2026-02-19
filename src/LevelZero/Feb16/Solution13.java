package LevelZero.Feb16;

class Solution13 {
    public String solution(String my_string, int k) {
        return my_string.repeat(k);
    }

    static void main(String[] args) {
        Solution13 solution13 = new Solution13();
        System.out.println( solution13.solution("love",10));
    }
}

//
//String answer = "";
//        for (int i = 0; i < k; i++) {
//answer += my_string;
//        }
//                return answer;