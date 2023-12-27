public class Solution {
    public int solution(int n, String control) {
        for (char c : control.toCharArray()) {
            switch (c) { // n 값이 최소값 -100,000과 최대값 100,000을 벗어나지 않도록 보장
                case 'w':
                    n = Math.min(n + 1, 100000); // Math.max(a, b) 함수는 a와 b 중에서 큰 값을 반환 
                    break;
                case 's':
                    n = Math.max(n - 1, -100000);
                    break;
                case 'd':
                    n = Math.min(n + 10, 100000);
                    break;
                case 'a':
                    n = Math.max(n - 10, -100000);
                    break;
            }
        }
        return n;
    }
}