public class Solution {
    public int solution(int[] numbers, int n) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
            if (sum > n) {
                return sum;
            }
        }
        return sum; // numbers의 모든 원소를 다 더한 경우
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.solution(new int[]{34, 5, 71, 29, 100, 34}, 123)); // 출력: 139
        System.out.println(sol.solution(new int[]{58, 44, 27, 10, 100}, 139)); // 출력: 239
    }
}
