import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args) {
 
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		int k = in.nextInt();
		
		int[] coin = new int[n];
		
		for(int i = 0; i < n; i++) {
			coin[i] = in.nextInt();
		}
		
		int count = 0;
 
		for(int i = n - 1; i >= 0; i--) {
			if(coin[i] <= k) {
				count += (k / coin[i]);
				k = k % coin[i];
			}
		}
		System.out.println(count);
	}
 
}