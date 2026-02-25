package LevelZero.Feb23_9.Review;

import java.util.ArrayList;

//Feb20 2번 풀기
public class Review1 {
    public int[] solution(int l, int r) {
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = l; i <= r; i++) {
            String str = String.valueOf(i);
            boolean flag = true;

            for (int j = 0; j < str.length(); j++) {
                char c = str.charAt(j);

                if (c != '0' && c != '5'){
                    flag = false;
                    break;
                }
            }
            if (flag){
                arr.add(i);
            }
        }
        if (arr.isEmpty()){
            return new int[] {-1};
        }
        int[] answer = arr.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }

}
