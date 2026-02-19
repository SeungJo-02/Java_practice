package LevelZero.Feb18;

class Solution24 {
    public int solution(int[] num_list) {
        String addOdd ="";
        String addEven ="";
        int answer = 0;

        for (int i = 0; i < num_list.length; i++) {
            if (num_list[i] % 2  == 1) {// 홀수라면
                addOdd += num_list[i];
            }else {
                addEven += num_list[i];
            }
        }
        answer = Integer.parseInt(addOdd) + Integer.parseInt(addEven);

        return answer;
    }
}

//class Solution {
//    public int solution(int[] num_list) {
//        StringBuilder a = new StringBuilder();
//        StringBuilder b = new StringBuilder();
//
//        for (int num : num_list) {
//            (num % 2 == 0 ? a : b).append(num);
//        }
//
//        return Integer.parseInt(a.toString()) + Integer.parseInt(b.toString());
//    }
//}