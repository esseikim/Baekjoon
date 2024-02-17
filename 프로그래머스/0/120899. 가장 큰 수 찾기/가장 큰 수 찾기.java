public class Solution {
    public int[] solution(int[] array) {
        int max = Integer.MIN_VALUE;
        int index = -1;
        
        // 배열을 순회하면서 가장 큰 수와 해당 인덱스를 찾는다.
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                index = i;
            }
        }
        
        // 가장 큰 수와 해당 인덱스를 배열에 저장하여 반환한다.
        return new int[]{max, index};
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] result1 = sol.solution(new int[]{1, 8, 3});
        System.out.println("[" + result1[0] + ", " + result1[1] + "]"); // 출력: [8, 1]
        
        int[] result2 = sol.solution(new int[]{9, 10, 11, 8});
        System.out.println("[" + result2[0] + ", " + result2[1] + "]"); // 출력: [11, 2]
    }
}
