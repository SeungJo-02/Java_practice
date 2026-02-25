package LevelZero.Feb17_4;
// 공배수
class Solution17 {
    public int solution(int number, int n, int m) {

        return ((number % n ==0) && (number % m == 0)) ? 1:0 ;
    }
}