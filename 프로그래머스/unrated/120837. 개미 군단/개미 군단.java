public class Solution {
    public int solution(int hp) {
        int generals = hp / 5; // 장군개미의 수
        int remainder = hp % 5; // 잔여 체력

        int soldiers = remainder / 3; // 병정개미의 수
        remainder %= 3; // 남은 체력 갱신

        int ants = generals + soldiers + remainder; // 최소한의 개미 수
        return ants;
    }
}
