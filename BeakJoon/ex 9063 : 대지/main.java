import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st;
		
		int arrx[] = new int[N];
		int arry[] = new int[N];
		
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			arrx[i] = Integer.parseInt(st.nextToken());
			arry[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arrx);
		Arrays.sort(arry);
		
		System.out.println((arrx[N - 1] - arrx[0]) * (arry[N - 1] - arry[0]));
		
	}
}
