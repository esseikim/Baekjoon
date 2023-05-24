import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            arr.add(s.charAt(i) - '0');
        }

        Collections.sort(arr, Collections.reverseOrder());

        if (!arr.contains(0)) {
            System.out.println(-1);
            return;
        }

        int sum = 0;
        for (int num : arr) {
            sum += num;
        }

        if (sum % 3 != 0) {
            System.out.println(-1);
            return;
        }

        StringBuilder result = new StringBuilder();
        for (int num : arr) {
            result.append(num);
        }

        System.out.println(result.toString());
    }
}
