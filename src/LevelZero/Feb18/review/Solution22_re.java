package LevelZero.Feb18.review;

public class Solution22_re {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        for (int i = 0; i < included.length; i++) {
            if (included[i] == true) {
                answer += a + i*d;
            }
        }
        return answer;
    }

//    static void main(String[] args) {
//        Solution22_re solution22Re = new Solution22_re();
//        boolean[] include = {true,false,false,true,true,};
//        int result = solution22Re.solution(3,4,include);
//        System.out.println(result);
//    }
}
