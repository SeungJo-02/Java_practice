package LevelZero.Feb20_7;

import java.util.ArrayList;

public class Solution5 {
    public int[] solution(int[] arr) {
        ArrayList<Integer> stk = new ArrayList<>();

        int i = 0;
        while (i < arr.length ){
            if (stk.isEmpty()){
                stk.add(arr[i]);
                i +=1;
            } else {
                int lastElement = stk.get(stk.size()-1);

                if (lastElement <arr[i]){
                    stk.add(arr[i]);
                    i +=1;
                } else {
                    stk.remove(stk.size()-1);
                }
            }

        }
        int[] answer = stk.stream().mapToInt(Integer::intValue).toArray();

        return answer;
    }
}
