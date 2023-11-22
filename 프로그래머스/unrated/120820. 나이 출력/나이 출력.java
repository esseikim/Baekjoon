public class Solution {
    public int solution(int age) {
        int currentYear = 2022; // 현재 연도
        int birthYear = currentYear - age + 1; // 출생 연도 계산
        return birthYear;
    }
}
