
package LevelZero.Feb23_9;

import java.util.ArrayList;

public class Solution5_R {
    public int solution(String my_string, String is_suffix) {
        ArrayList<String> arr = new ArrayList<>();

        for (int i = 0; i < my_string.length(); i++) {
            arr.add(my_string.substring(i));
        }

        return arr.contains(is_suffix) ? 1:0;
    }

}
