class Solution {
    public int solution(int[] num_list) {
        int product = 1;
        int sum = 0;

        for (int num : num_list) {
            product *= num; // 모든 원소의 곱
            sum += num; // 모든 원소의 합
        }

        int squaredSum = sum * sum; // 합의 제곱

        if (product < squaredSum) {
            return 1;
        } else {
            return 0;
        }
    }
}
