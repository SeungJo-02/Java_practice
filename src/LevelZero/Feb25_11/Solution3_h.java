package LevelZero.Feb25_11;

public class Solution3_h {
    public String solution(String my_string, int[] indices) {

        String[] arr = my_string.split("");

        for (int index : indices) {
            arr[index] = "";
        }

        return String.join("",arr);
    }
}
