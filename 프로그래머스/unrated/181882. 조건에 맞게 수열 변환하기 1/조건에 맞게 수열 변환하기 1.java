import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int[] result = new int[arr.length]; // 조건에 맞게 값을 변환하여 새로운 배열에 저장한 뒤, 그 배열을 반환
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 50 && arr[i] % 2 == 0) { // 값이 50보다 크거나 같은 짝수라면 2로 나누고
                result[i] = arr[i] / 2;
            } else if (arr[i] < 50 && arr[i] % 2 != 0) { // 50보다 작은 홀수라면 2를 곱한다.
                result[i] = arr[i] * 2;
            } else {
                result[i] = arr[i]; // 변경 조건에 해당하지 않으면 그대로 유지
            }
        }
        
        return result;
    }
}