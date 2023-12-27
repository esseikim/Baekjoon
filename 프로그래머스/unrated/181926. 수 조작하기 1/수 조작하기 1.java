public class Solution {
    public int solution(int n, String control) {
        char[] controlChars = control.toCharArray();
        
        for (char c : controlChars) {
            switch (c) {
                case 'w':
                    n += 1;
                    break;
                case 's':
                    n -= 1;
                    break;
                case 'd':
                    n += 10;
                    break;
                case 'a':
                    n -= 10;
                    break;
            }
        }
        
        return n;
    }
}
