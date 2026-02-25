package LevelZero.Feb20_7.review;

import java.util.ArrayList;

public class Solution5_re {
    public int[] solution(int[] arr) {
        int i = 0;
        ArrayList<Integer> stk = new ArrayList<>();

        while (i < arr.length){
            if (stk.isEmpty()) {
                stk.add(arr[i]);
                i +=1;
            } else {
                int lastElement = stk.get(stk.size()-1);

                if (lastElement < arr[i]) {
                    stk.add(arr[i]);
                    i+=1;

                } else {
                    stk.remove(stk.size()-1);
                    i +=1;
                }
            }
        } int[] answer = stk.stream().mapToInt(Integer::intValue).toArray();

        return answer;
    }
}
