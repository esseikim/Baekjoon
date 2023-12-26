public class Solution {
    public int solution(int a, int b) {
        String ab = Integer.toString(a) + Integer.toString(b);
        String ba = Integer.toString(b) + Integer.toString(a);
        
        int abInt = Integer.parseInt(ab);
        int baInt = Integer.parseInt(ba);
        
        return Math.max(abInt, baInt);
    }
}
