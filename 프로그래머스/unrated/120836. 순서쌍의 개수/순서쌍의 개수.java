class Solution {
    public int solution(int n) {
        int count = 0;

        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                // i와 n/i가 순서쌍을 이룸
                count++;
                if (i != n / i) {
                    // 중복되지 않는 경우에만 count 추가
                    count++;
                }
            }
        }

        return count;
    }
}
