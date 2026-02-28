package LevelZero.Mar1_15;

public class Solution4 {
    public int solution(int[] num_list) {
        int answer = 1;
        if (num_list.length >=11) {
            for (int num : num_list) {
                answer += num;
            } answer -=1;
        }else {
            for (int num : num_list) {
                answer *= num;
            }
        }
        return answer;
    }
}


//class Solution {
//    public int solution(int[] num_list) {
//        int answer = (num_list.length < 11 ? 1 : 0);
//
//        for(int i=0; i<num_list.length; i++){
//
//            if(num_list.length < 11) {
//                answer *= num_list[i];
//            }else{
//                answer += num_list[i];
//            }
//
//        }
//
//        return answer;
//    }
//}
