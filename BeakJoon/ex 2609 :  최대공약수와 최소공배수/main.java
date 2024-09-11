import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int d = gcd(a, b);
		System.out.println(d);
		System.out.println(a * b / d);
	}
	
	// 유클리드 호제법 : 최소공배수는 (a * b) / (최대공약수)
	// 최대공약수는 a % b의 값에서 나온 나머지를 r이라고 한다면
	// a,b의 최대공약수는 b,r의 최대공약수의 값과 같다.
	// 따라서 나머지가 0이 될때 나눈 수가 a,b의 최대공약수가 된다.
	public static int gcd(int a, int b) {
		
		while (b != 0) {
			int r = a % b;
			
			a = b;
			b = r;
		}
		
		return a;
	}
}
