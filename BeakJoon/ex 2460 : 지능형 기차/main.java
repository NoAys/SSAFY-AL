import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{	

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int max = 0;
		int sum = 0;
		
		for (int i = 0; i < 10; i++) {
			StringTokenizer st = new StringTokenizer(bf.readLine());
			
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			sum = sum - a + b;
			
			if (max < sum) {
				max = sum;
			}
		}
		
		System.out.println(max);
	}
}
