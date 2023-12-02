public class Solution {
    public double solution(int[] numbers) {
        int sum = 0;

        // 배열의 모든 요소를 합산
        for (int i : numbers) {
            sum += i;
        } 
        
        // 배열의 요소들의 개수로 나누어 평균값 계산
        double average = (double) sum / numbers.length;
        
        return average;
    }
}
