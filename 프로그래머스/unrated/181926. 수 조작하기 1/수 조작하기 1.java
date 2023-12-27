public class Solution {
    public int solution(int n, String control) {
        for (char c : control.toCharArray()) {
            if (c == 'w') {
                n = Math.min(n + 1, 100000);
            } else if (c == 's') {
                n = Math.max(n - 1, -100000);
            } else if (c == 'd') {
                n = Math.min(n + 10, 100000);
            } else if (c == 'a') {
                n = Math.max(n - 10, -100000);
            }
        }
        return n;
    }
}
