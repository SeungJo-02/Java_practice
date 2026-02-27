package LevelZero.Feb28_14;

import java.util.ArrayList;

public class Solution3_Re {
    public String[] solution(String[] todo_list, boolean[] finished) {
        ArrayList<String> result =new ArrayList<>();

        for (int i = 0; i < finished.length; i++) {
            if (finished[i] == false) {
                result.add(todo_list[i]);
            }
        }

        return result.toArray(new String[0]);
    }
}


//class Solution {
//    public String[] solution(String[] todo_list, boolean[] finished) {
//        String str = "";
//        for(int i=0; i<finished.length; i++){
//            str = finished[i]==false ? str+todo_list[i]+"," : str;
//        }
//
//        return str.split(",");
//    }
//}
