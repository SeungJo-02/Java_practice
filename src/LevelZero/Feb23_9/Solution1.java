package LevelZero.Feb23_9;

import java.util.ArrayList;

public class Solution1 {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < intStrs.length; i++) {
            String a = intStrs[i];
            StringBuffer str = new StringBuffer();
            for (int j = s; j < s+l; j++) {
                char c = a.charAt(j);

                str.append(c);
            }
            String str1 = str.toString();
            int num = Integer.parseInt(str1);
            if (num > k) {
                arr.add(num);
            }
        }
        int [] result = arr.stream().mapToInt(Integer::intValue).toArray();
        return result;
    }
}
