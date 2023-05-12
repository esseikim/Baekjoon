import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		int[] a = new int[num];
		int[] b = new int[num];
		
		StringTokenizer stn1 = new StringTokenizer(br.readLine());
		StringTokenizer stn2 = new StringTokenizer(br.readLine());

		for(int i = 0; i < num; i ++) {
			a[i] = Integer.parseInt(stn1.nextToken());
			b[i] = Integer.parseInt(stn2.nextToken());
		}
		
		Arrays.sort(a);
		Arrays.sort(b);
		
		int sum = 0;
		for(int i = 0; i < num; i++) {
			sum += a[i]*b[num-i-1];
		}
		System.out.println(sum);
	}
}