class Solution {
    public int solution(int n) {
        // 주어진 수 n이 홀수인 경우에는 n-1까지의 짝수를 더해야 한다.
        // 주어진 수 n이 짝수인 경우에는 n까지의 짝수를 더해야 한다.
        // 따라서 n/2 * (n/2 + 1)을 사용한다.
        return n % 2 == 0 ? n / 2 * (n / 2 + 1) : (n - 1) / 2 * ((n - 1) / 2 + 1);
    }
}
