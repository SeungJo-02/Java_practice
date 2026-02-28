package LevelZero.Feb28_Re;

import java.util.Arrays;

public class Solution3 {
    public String[] solution(String[] str_list) {
        String[] result = new String[]{};

        for (int i = 0; i < str_list.length; i++) {

            if (str_list[i].equals("l")) {
                result = Arrays.copyOfRange(str_list,0,i);
                break;
            } else if (str_list[i].equals("r")) {
                result = Arrays.copyOfRange(str_list,i+1,str_list.length);
                break;
            } else {
                result = new String[]{};
            }
        }
        return result;
    }
}
