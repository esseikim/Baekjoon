class Solution {
    public int solution(int[] num_list) {
        int oddSum = 0;
        int evenSum = 0;

        for (int i = 0; i < num_list.length; i++) {
            if (i % 2 == 0) { // 짝수 번째 원소들의 합
                evenSum += num_list[i];
            } else { // 홀수 번째 원소들의 합
                oddSum += num_list[i];
            }
        }

        return Math.max(oddSum, evenSum); // 두 값 중 큰 값을 반환하거나, 두 값이 같다면 해당 값을 반환
    }
}