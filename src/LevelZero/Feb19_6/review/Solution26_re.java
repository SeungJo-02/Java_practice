package LevelZero.Feb19_6.review;

import java.util.Arrays;

public class Solution26_re {
    public int[] solution(int[] num_list) {
        int len = num_list.length;//3

        int[] answer = new int[len +1];

        for (int i = 0; i < len; i++) {
            answer[i] = num_list[i];
        }

        int last = num_list[len-1];//2
        int pre = num_list[len-2];//1

        answer[len] = (last > pre) ? last-pre : last*2;

        return answer;
    }

    static void main(String[] args) {
        Solution26_re solution26Re = new Solution26_re();
        int[] ii = {2,1,6};
        int[] result = solution26Re.solution(ii);
        System.out.println(Arrays.toString(result));
    }

}
