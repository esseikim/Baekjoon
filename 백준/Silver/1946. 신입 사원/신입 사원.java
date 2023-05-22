import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.TreeMap;
import java.util.Set;

public class Main {

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            int m = Integer.parseInt(br.readLine());

            TreeMap<Integer, Integer> rankList = new TreeMap<>();
            for (int j = 0; j < m; j++) {
                StringTokenizer tkn = new StringTokenizer(br.readLine());
                int documentScore = Integer.parseInt(tkn.nextToken());
                int interviewScore = Integer.parseInt(tkn.nextToken());
                rankList.put(documentScore, interviewScore);
            }

            Set<Integer> keys = rankList.keySet();
            int max = rankList.get(1);
            int cnt = 1; // 기준이 되는 지원자는 항상 포함되므로 cnt 초기값을 1로 설정합니다.

            for (Integer x : keys) {
                if (rankList.get(x) < max) {
                    cnt++;
                    max = rankList.get(x);
                }
            }
            System.out.println(cnt);
        }
    }
}
