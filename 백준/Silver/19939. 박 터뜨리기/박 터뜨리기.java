
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        
        int sum = K * (K + 1) / 2;
        
        if (N < sum) {
            System.out.println(-1);
        } else if ((N - sum) % K == 0) {
            System.out.println(K - 1);
        } else {
            System.out.println(K);
        }
        
        sc.close();
    }
}
