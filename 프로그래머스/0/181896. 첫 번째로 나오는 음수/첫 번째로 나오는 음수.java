public class Solution {
    public int solution(int[] num_list) {
        for (int i = 0; i < num_list.length; i++) {
            if (num_list[i] < 0) {
                return i; // 첫 번째로 나오는 음수의 인덱스 반환
            }
        }
        return -1; // 음수가 없는 경우 -1 반환
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.solution(new int[]{12, 4, 15, 46, 38, -2, 15})); // 출력: 5
        System.out.println(sol.solution(new int[]{13, 22, 53, 24, 15, 6}));     // 출력: -1
    }
}
