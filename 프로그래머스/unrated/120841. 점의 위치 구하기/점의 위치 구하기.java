public class Solution {
    public int solution(int[] dot) {
        int x = dot[0];
        int y = dot[1];

        if (x > 0 && y > 0) { // x, y 모두 양수인 경우
            return 1;
        } else if (x < 0 && y > 0) { // x가 음수, y가 양수인 경우
            return 2;
        } else if (x < 0 && y < 0) { // x, y 모두 음수인 경우
            return 3;
        } else { // x가 양수, y가 음수인 경우
            return 4;
        }
    }
}
