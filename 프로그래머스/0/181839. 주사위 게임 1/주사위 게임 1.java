public class Solution {
    public int solution(int a, int b) {
        int score = 0;
        
        if (a % 2 == 1 && b % 2 == 1) { // 두 주사위가 모두 홀수인 경우
            score = a * a + b * b;
        } else if (a % 2 == 1 || b % 2 == 1) { // 두 주사위 중 하나만 홀수인 경우
            score = 2 * (a + b);
        } else { // 두 주사위가 모두 홀수가 아닌 경우
            score = Math.abs(a - b);
        }
        
        return score;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.solution(3, 5)); // 출력: 34
        System.out.println(sol.solution(6, 1)); // 출력: 14
        System.out.println(sol.solution(2, 4)); // 출력: 2
    }
}
