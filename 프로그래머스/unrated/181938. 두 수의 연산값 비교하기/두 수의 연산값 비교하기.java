class Solution {
    public int solution(int a, int b) {
        String abConcat = String.valueOf(a) + String.valueOf(b); // 두 수를 붙여서 만든 문자열
        
        int abInt = Integer.parseInt(abConcat); // 두 수를 붙여서 만든 숫자
        int multiplied = 2 * a * b; // 2 * a * b

        if (abInt >= multiplied) {
            return abInt;
        } else {
            return multiplied;
        }
    }
}