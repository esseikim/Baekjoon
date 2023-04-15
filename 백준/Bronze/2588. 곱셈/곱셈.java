import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s1 = br.readLine();
		String s2 = br.readLine();
		
		String[] str1 = s1.split("");
		String[] str2 = s2.split("");
	

		int a = Integer.parseInt(str2[2]) * Integer.parseInt((str1[0]) +  Integer.parseInt((str1[1])) +  Integer.parseInt(( str1[2])));
		int b = Integer.parseInt(str2[1]) * Integer.parseInt((str1[0]) +  Integer.parseInt((str1[1])) +  Integer.parseInt(( str1[2])));
		int c = Integer.parseInt(str2[0]) * Integer.parseInt((str1[0]) +  Integer.parseInt((str1[1])) +  Integer.parseInt(( str1[2])));
		int d = Integer.parseInt(s1) * Integer.parseInt(s2);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
}
