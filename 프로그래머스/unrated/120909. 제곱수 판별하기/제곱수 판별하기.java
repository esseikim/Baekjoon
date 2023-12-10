class Solution {
    public int solution(int n) {
        double sqrt = Math.sqrt(n);
        if (sqrt - Math.floor(sqrt) == 0) {
            return 1;
        } else {
            return 2;
        }
    }
}
