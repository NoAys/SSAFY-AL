import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		
		int arr[] = new int[1001];
		
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		
		int cnt = 0;
		int sum = 0;
		
		for (int i = 1; i <= B; i++) {
			for (int j = 1; j <= i; j++) {
				
				if(cnt >= arr.length-1) {
					break;
				}
				
				arr[cnt] = i;
				cnt++;
			}
		}
		
		for (int i = A-1; i < B; i++) {
			sum += arr[i];
		}
		
		System.out.println(sum);
		
	}
}
