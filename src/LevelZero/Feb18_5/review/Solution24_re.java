package LevelZero.Feb18_5.review;

public class Solution24_re {
    public int solution (int[] num_list){
        int sum = 0;
        int mul = 1; //곱하기는 0곱하면 0 이라 1로 기본

        for (int i = 0; i < num_list.length; i++) {
            sum += num_list[i];
            mul *= num_list[i];
        }
        return Math.pow(sum,2) > mul ? 1 : 0;
    }

//    static void main(String[] args) {
//        Solution24_re solution24Re = new Solution24_re();
//        int[] li = {5,7,8,3};
//        System.out.println(solution24Re.solution(li));
//    }
}
