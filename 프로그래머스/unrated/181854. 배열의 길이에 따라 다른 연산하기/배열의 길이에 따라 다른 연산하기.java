import java.util.*;

class Solution {
    public int[] solution(int[] arr, int n) {
        for (int i = 0; i < arr.length; i++) {
            if (arr.length % 2 == 0 && i % 2 == 1) { // 배열 길이가 짝수일 때 홀수 인덱스
                arr[i] += n;
            } else if (arr.length % 2 == 1 && i % 2 == 0) { // 배열 길이가 홀수일 때 짝수 인덱스
                arr[i] += n;
            }
        }
        return arr;
    }
}
