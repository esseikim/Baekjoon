import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> solution(int n) {
        List<Integer> result = new ArrayList<>();
        result.add(n); // 초기값 추가
        
        while (n != 1) {
            if (n % 2 == 0) { // 짝수인 경우
                n /= 2;
            } else { // 홀수인 경우
                n = 3 * n + 1;
            }
            result.add(n); // 변환된 값 추가
        }
        
        return result;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        List<Integer> result = sol.solution(10);
        System.out.println(result); // 출력: [10, 5, 16, 8, 4, 2, 1]
    }
}
