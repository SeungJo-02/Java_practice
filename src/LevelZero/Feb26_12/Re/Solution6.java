package LevelZero.Feb26_12.Re;

import java.util.Arrays;

public class Solution6 {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        int a = slicer[0];
        int b = slicer[1];
        int c = slicer[2];

        switch (n){
            case (1):
               num_list = Arrays.copyOfRange(num_list,0,b + 1);
                break;
            case (2):
                num_list = Arrays.copyOfRange(num_list, a, num_list.length);
                break;
            case (3):
                num_list = Arrays.copyOfRange(num_list,a,b + 1);
                break;
            case (4):
                int[] list = new int[(b-a)/c + 1];
                int idx = 0;

                for (int i = a; i <= b; i += c) {
                    list[idx] = num_list[i];
                    idx++;
                }
                num_list = list;
                break;
        }
        return num_list;
    }
}
