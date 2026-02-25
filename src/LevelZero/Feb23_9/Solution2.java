package LevelZero.Feb23_9;

public class Solution2 {
    public String solution(String[] my_strings, int[][] parts) {

        StringBuffer srts = new StringBuffer();

        for (int i = 0; i < parts.length; i++) {
            int s = parts[i][0];
            int e = parts[i][1];

            String str = my_strings[i];

            for (int j = s; j <= e; j++) {
                char c = str.charAt(j);
                srts.append(c);
            }
        }

        return srts.toString();
    }
}
