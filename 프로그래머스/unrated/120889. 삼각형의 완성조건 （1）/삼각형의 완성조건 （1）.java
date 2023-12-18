import java.util.Arrays;

class Solution {
    public int solution(int[] sides) {
        Arrays.sort(sides);
        
        if (sides[0] + sides[1] <= sides[2]) {
            return 2; // 삼각형을 만들 수 없음
        } else {
            return 1; // 삼각형을 만들 수 있음
        }
    }
}
