package LevelZero.Feb22;

public class Solution5_h {
    public String solution(String my_string, int[][] queries) {
        char[] arr = my_string.toCharArray();

        for (int[] query : queries) {
            int s = query[0];
            int e = query[1];

            while (s<e){
                char temp = arr[s];
                arr[s]= arr[e];
                arr[e] =temp;
                s += 1;
                e -= 1;
            }
        }
        return new String(arr); //배열을 문자로 바꾸는 방법
    }
}
