import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {

	 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	 StringTokenizer st = new StringTokenizer(br.readLine());
	 
	 int x = Integer.parseInt(st.nextToken());
	 int y = Integer.parseInt(st.nextToken());
	 int w = Integer.parseInt(st.nextToken());
	 int h = Integer.parseInt(st.nextToken());
	 
	 int min = x;
	 min = (min > y ) ? y : min;
	 min = (min > (h-y) ) ? (h-y) : min;
	 min = (min > (w-x) ) ? (w-x) : min;
	 System.out.println(min);
	}
}