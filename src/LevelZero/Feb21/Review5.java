package LevelZero.Feb21;

import java.util.ArrayList;

public class Review5 {
    public int[] solution(int[] arr) {
        int i = 0;
        ArrayList<Integer> stk = new ArrayList<>();

        while (i< arr.length){
            if (stk.isEmpty()) {
                stk.add(arr[i]);
                i += 1;
            } else {
                int last = stk.size()-1;

                if (stk.get(last)< arr[i]) {
                    stk.add(arr[i]);
                    i += 1;
                }else {
                    stk.remove(last);
                }
            }
        }
        int[] result = stk.stream().mapToInt(Integer::intValue).toArray();

        return result;
    }
}
