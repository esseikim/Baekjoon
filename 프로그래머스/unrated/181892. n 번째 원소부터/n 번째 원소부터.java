class Solution {
    public int[] solution(int[] num_list, int n) {
        int length = num_list.length - n + 1; // 새로운 배열의 길이 계산
        int[] result = new int[length]; // 새로운 배열 생성

        // 주어진 리스트에서 n번째 인덱스부터 마지막까지의 원소를 새로운 배열에 복사
        System.arraycopy(num_list, n - 1, result, 0, length);

        return result;
    }
}
