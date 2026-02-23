package LevelZero.Feb23;

import java.util.ArrayList;

public class Solution1_2 {
    public int[] solution(String[] intStrs, int k, int s, int l){
        ArrayList<Integer> arr = new ArrayList<>();

        for (String str : intStrs) {
            String sub = str.substring(s,s+l);

            int num = Integer.parseInt(sub);

            if (num > k) {
                arr.add(num);
            }
        }
        return arr.stream().mapToInt(Integer::intValue).toArray();

    }
}
