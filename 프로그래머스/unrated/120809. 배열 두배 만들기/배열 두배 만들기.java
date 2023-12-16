import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        int[] doubledNumbers = new int[numbers.length];
        
        for (int i = 0; i < numbers.length; i++) {
            doubledNumbers[i] = numbers[i] * 2;
        }
        
        return doubledNumbers;
    }
}
