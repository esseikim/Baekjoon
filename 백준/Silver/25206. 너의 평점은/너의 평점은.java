import java.io.*;
import java.util.StringTokenizer;

public class Main {
	

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 입력 받은 값을 한줄 단위로 입력  
		double sum1 = 0;  
		double sum2 =0;


		for (int i = 0; i < 20; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());               
			String str[] = {st.nextToken(), st.nextToken(), st.nextToken()};  

			if (!str[2].equals("P")) {
				sum1 += Double.parseDouble(str[1]);
				                                                                        
				switch (str[2]) {                                                      
				case "A+": 
					sum2 += 4.5 * Double.parseDouble(str[1]);
					break;  

				case "A0":
					sum2 += 4.0 * Double.parseDouble(str[1]);
					break;

				case "B+":
					sum2 += 3.5 * Double.parseDouble(str[1]);
					break;

				case "B0":
					sum2 += 3.0 * Double.parseDouble(str[1]);
					break;

				case "C+":
					sum2 += 2.5 * Double.parseDouble(str[1]);
					break;

				case "C0":
					sum2 += 2.0 * Double.parseDouble(str[1]);
					break;

				case "D+":
					sum2 += 1.5 * Double.parseDouble(str[1]);
					break;

				case "D0":
					sum2 += 1.0 * Double.parseDouble(str[1]);
					break;

				case "F" :
					sum2 += 0.0 * Double.parseDouble(str[1]);
					break;
				}
			}
		}
	System.out.println(String.format("%.6f", sum2/sum1)); 


	}
}