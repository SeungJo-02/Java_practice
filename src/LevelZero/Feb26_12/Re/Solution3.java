package LevelZero.Feb26_12.Re;

public class Solution3 {
    public String solution(String my_string, int[] indices) {

        String[] str = my_string.split("");

        for (int idx : indices) {
            str[idx] = "";
        }
        return String.join("",str);
    }
}
