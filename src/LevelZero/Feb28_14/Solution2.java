package LevelZero.Feb28_14;

public class Solution2 {
    public String[] solution(String[] names) {

        String[] result =new String[(names.length-1)/5 + 1];
        int count = 0;

        for (int i = 0; i < names.length; i+=5) {
            result[count] = names[i];
            count++;
        }

        return result;
    }
}
