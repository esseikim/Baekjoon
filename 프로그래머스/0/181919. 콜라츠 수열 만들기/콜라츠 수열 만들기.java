public class Solution {
    public int[] solution(int n) {
        // 콜라츠 수열의 최대 길이는 1000을 넘지 않으므로 크기가 1000인 배열을 생성한다.
        int[] result = new int[1000];
        int index = 0;
        result[index++] = n; // 초기값 추가
        
        while (n != 1) {
            if (n % 2 == 0) { // 짝수인 경우
                n /= 2;
            } else { // 홀수인 경우
                n = 3 * n + 1;
            }
            result[index++] = n; // 변환된 값 추가
        }
        
        // 결과 배열의 크기를 콜라츠 수열의 실제 길이에 맞게 조정합니다.
        int[] finalResult = new int[index];
        System.arraycopy(result, 0, finalResult, 0, index);
        return finalResult;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] result = sol.solution(10);
        for (int num : result) {
            System.out.print(num + " "); // 출력: 10 5 16 8 4 2 1
        }
        System.out.println();
    }
}
