package LevelZero.Feb27_13;

class Solution5 {
    public int[] solution(int[] num_list, int n) {
        int[] result = new int[(num_list.length-1)/n +1];
        int count = 0;

        for (int i = 0; i < num_list.length; i++) {
            if (i % n == 0){
                result[count] = num_list[i];
                count++;
            }
        }
        return result;
    }
}
