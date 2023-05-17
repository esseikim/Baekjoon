import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		StringTokenizer stn = new StringTokenizer(br.readLine());
		
		int[] a = new int[num-1];
		for(int i = 0; i < num-1; i ++) {
			a[i] = Integer.parseInt(stn.nextToken());
		}
		
		stn = new StringTokenizer(br.readLine());

		int[] b = new int[num];
		for(int i = 0; i < num; i ++) {  
			b[i] = Integer.parseInt(stn.nextToken());
		}
		
		long minPrice = b[0];
		long sum = minPrice * a[0];
		
		for(int i = 1; i < num-1; i ++) {
			if(minPrice < b[i]) {
				sum += minPrice * a[i]; 
			}else {
				minPrice = b[i];
				sum += minPrice * a[i]; 
			}
		}
	System.out.println(sum);
	}
}
