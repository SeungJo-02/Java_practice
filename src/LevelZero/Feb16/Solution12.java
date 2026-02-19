package LevelZero.Feb16;

class Solution12 {
    public String solution(String[] arr) {
        String answer = "";
        for (int i = 0; i < arr.length; i++) {
            answer += arr[i];
        }
        return answer;

    }

    static void main(String[] args) {
        String[] arr = {"a","b","c"};
        Solution12 solution12 = new Solution12();
        String result = solution12.solution(arr);
        System.out.println(result);
    }
}


//class Solution {
//    public String solution(String[] arr) {
//        return String.join("", arr);
//    }

//
//for(String a : arr) {
//answer += a;
//        }
