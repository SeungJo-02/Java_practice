
package LevelZero.Feb20;

import java.util.ArrayList;

public class Solution4 {
    public int[] solution(int n) {
        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(n);

        int count = 0;
        while (true){
            if (n  == 1) {
                arr.add(1);
                count +=1;
                break;
            } else if (n % 2 == 0) {
                n = n/2;
                arr.add(n);
                count +=1;

            } else if (n % 2 == 1) {
                n = (n * 3) + 1;
                arr.add(n);
                count +=1;
            }
        }

        int[] answer = new int[count];
        for (int i = 0; i < count; i++) {
            answer[i] = arr.get(i);
        }

        return answer;
    }
}
