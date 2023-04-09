import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int cnt = Integer.parseInt(br.readLine());
		for(int i = 0; i < cnt; i++) {
			String[] s = br.readLine().split(",");
		int x = Integer.parseInt(s[0]);
		int y =	Integer.parseInt(s[1]);
			System.out.println(x + y);
		}
	}
}