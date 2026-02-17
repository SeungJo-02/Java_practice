package LevelZero;

class Solution23 {
    public int solution(int[] num_list) {
        int result = 0;
        int sum = 0;
        int mul = 1; // 얌마 곱셈인데 0을 곱하면 우짜냐...

        for (int i = 0; i < num_list.length; i++) {
            sum += num_list[i];
            mul *= num_list[i];
        }
        if (Math.pow(sum,2) > mul) {
            result = 1;
        } else {
            result = 0;
        }

        return result;
    }
}