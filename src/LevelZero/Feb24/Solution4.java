
package LevelZero.Feb24;

public class Solution4 {
    public String solution(String my_string, int m, int c) {

        StringBuffer str = new StringBuffer();

        for (int i = c - 1; i < my_string.length() ; i += m) { //해당 인덱스만 추가하기
            str.append(my_string.charAt(i));
        }
        return str.toString();
    }
}
