public class Solution {
    public int solution(int hp) {
        // 장군개미 5마리로 나눈 몫을 구한다.
        int ants = hp / 5;
        // 나머지가 0이 아니면 병정개미나 일개미를 추가한다.
        if (hp % 5 != 0) {
            // 병정개미의 수는 최대한 줄이기 위해 나머지를 활용한다.
            ants += hp % 5 / 3;
            // 일개미는 나머지가 3보다 작을 때 추가된다.
            if (hp % 5 % 3 != 0)
                ants += hp % 5 % 3;
        }
        return ants;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.solution(23)); // 출력: 5
        System.out.println(sol.solution(24)); // 출력: 6
        System.out.println(sol.solution(999)); // 출력: 201
    }
}