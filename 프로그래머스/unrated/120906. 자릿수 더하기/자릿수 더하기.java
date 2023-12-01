public class Solution {
    public int solution(int n) {
        String numString = String.valueOf(n);
        int sum = 0;

        for (int i = 0; i < numString.length(); i++) {
            sum += Character.getNumericValue(numString.charAt(i));
        }

        return sum;
    }
}
