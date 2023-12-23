class Solution {
    public int solution(int n, int t) {
        int current = n;

        for (int i = 0; i < t; i++) {
            current *= 2;
        }

        return current;
    }
}
