import java.util.Arrays;

public class Solution {
    public int solution(int[] numbers) {
        Arrays.sort(numbers); // 배열을 오름차순으로 정렬
        int length = numbers.length;
        
        // 음수끼리 곱하거나 양수끼리 곱하여 최댓값을 찾는다.
        int max = Math.max(numbers[0] * numbers[1], numbers[length - 1] * numbers[length - 2]);
        return max;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.solution(new int[]{1, 2, -3, 4, -5}));          // 출력: 15
        System.out.println(sol.solution(new int[]{0, -31, 24, 10, 1, 9}));    // 출력: 240
        System.out.println(sol.solution(new int[]{10, 20, 30, 5, 5, 20, 5})); // 출력: 600
    }
}