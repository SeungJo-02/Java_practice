package LevelZero.Feb24_10;

import java.util.ArrayList;

public class Solution2 {
    public int solution(String my_string, String is_prefix) {
        ArrayList<String> arr = new ArrayList<>();

        for (int i = 0; i < my_string.length(); i++) {
            arr.add(my_string.substring(0 , i));
        }

        return arr.contains(is_prefix) ? 1 : 0;
    }
}




//class Solution {
//    public int solution(String my_string, String is_prefix) {
//        if (my_string.startsWith(is_prefix)) return 1;
//        return 0;
//    }
//}
//startsWith : 이 문자열이 특정 단어(접두사)로 시작하는가? 검사