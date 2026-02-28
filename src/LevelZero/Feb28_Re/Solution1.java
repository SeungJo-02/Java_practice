package LevelZero.Feb28_Re;

import java.util.ArrayList;

public class Solution1 {
    public String[] solution(String[] todo_list, boolean[] finished) {

        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < finished.length; i++) {
            if (finished[i] == false) {
                list.add(todo_list[i]);
            }
        }
        return list.toArray(new String[0]);
    }
}
