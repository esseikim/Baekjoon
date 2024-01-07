public class Solution {
    public int[] solution(int[] array) {
        int max = Integer.MIN_VALUE;
        int index = -1;

        for (int i = 0; i < array.length; i++) { // 배열을 순회하면서 가장 큰 수를 발견할 때마다 해당 수와 그 수의 인덱스를 기록
            if (array[i] > max) {
                max = array[i];
                index = i;
            }
        }

        return new int[]{max, index};
    }
}