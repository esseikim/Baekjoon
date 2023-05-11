import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); // 동전의 종류 수
        int K = Integer.parseInt(st.nextToken()); // 목표 가치

        int[] coins = new int[N]; // 동전의 가치를 저장할 배열

        for (int i = 0; i < N; i++) {
            coins[i] = Integer.parseInt(br.readLine());
        }

        int count = 0; // 필요한 동전 개수

        // 큰 가치의 동전부터 탐색
        for (int i = N - 1; i >= 0; i--) {
            if (K >= coins[i]) { // 현재 동전의 가치가 K보다 작거나 같은 경우
                count += K / coins[i]; // 해당 동전을 최대한 많이 사용
                K %= coins[i]; // 남은 가치를 계산
            }
        }

        System.out.println(count);
    }
}