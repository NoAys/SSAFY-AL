import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int M = Integer.parseInt(bf.readLine());
		int N = Integer.parseInt(bf.readLine());
		
		int sum = 0;
		int min = 10000;
		
		for (int i = M; i <= N; i++) {
			
			if (isPrime(i)) {
				sum += i;
				
				if (i < min) {
					min = i;
				}
			}
			
		}
		
		if (sum == 0) {
			System.out.println("-1");
		} else {
			System.out.println(sum);
			System.out.println(min);	
		}	
		
		
	}
	
	public static boolean isPrime(int num) {
		if (num <= 1) {
			return false;
		}
		
		if (num == 2) {
			return true;
		}
		
		if (num % 2 == 0) {
			return false;
		}
		
		for (int i = 3; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
				return false;
			}
		}
		
		return true;
	}
}
