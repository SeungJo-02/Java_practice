package LevelZero.Feb20.review;

import java.util.ArrayList;

public class Solution4_re {public int[] solution(int n) {

    ArrayList<Integer> arr = new ArrayList<>();

    arr.add(n);

    while (true){
        if (n == 1){
            break;
        } else if (n%2 == 0) {
            n = n/2;
            arr.add(n);
        } else if (n%2 == 1) {
            n = 3*n+1;
            arr.add(n);
        }

    }int[] answer = new int[arr.size()];

    for (int i = 0; i < answer.length; i++) {
        answer[i] = arr.get(i);
    }
    return answer;
}
}
