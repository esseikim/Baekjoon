import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		int result = 1000 - num;
		int cnt = 0;

		while(result != 0) {
			if (result >= 500) {
				cnt += result / 500;
				result = result % 500;
			}else if(result >= 100) {
				cnt += result / 100;
				result = result % 100;
			}else if(result >= 50) {
				cnt += result / 50;
				result = result % 50;
			}else if (result >= 10) {
				cnt += result / 10;
				result = result % 10;
			}else if (result >= 5) {
				cnt += result / 5;
				result = result % 5;
			}else {
				cnt += result / 1;
				result = result % 1;
			}	
		}
		System.out.println(cnt);
	}
}
