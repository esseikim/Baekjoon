import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		
		int[] arr = new int[3];
		for (int i = 0; i < 3 ; i ++) {
			arr[i] = sc.nextInt();
		}
		
		int max = 0; 
		for (int x : arr) {
			if( x > max) {
				max = x;
			}
		}
		
	    int x = arr[0];
	    int y = arr[1];
	    int z = arr[2];
	
		int money;
		
		if (x==y && y==z) {
			money = 10000 + (x * 1000);
		} else if (x==y || y==z || z==x) {
			if (x==y) {
			money = 1000 + (x * 100);
			}else if(y==z){
				money = 1000 + (y * 100);
				}else
					money = 1000 + (z * 100);
					
			
		}else {
			money = max * 100;
		}
		System.out.print(money);
	}

}