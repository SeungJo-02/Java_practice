package LevelZero.Feb27_13;

import java.util.Arrays;

public class Solution3_R {
    public String[] solution(String[] str_list) {
        String[] result = new String[]{};
        int idx = 0;

        for (String str : str_list) {

            if (str.equals("l")) {
                result = Arrays.copyOf(str_list, idx);
                break;
            } else if (str.equals("r")) {
                result = Arrays.copyOfRange(str_list, idx+1, str_list.length);
                break;
            }
            idx++;
        }


        return result;
    }
}
