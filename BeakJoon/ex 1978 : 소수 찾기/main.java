import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(bf.readLine());
		
		StringTokenizer st = new StringTokenizer(bf.readLine());
		
		int cnt = 0;
		
		while (st.hasMoreTokens()) {
			int a = Integer.parseInt(st.nextToken());
			
			boolean chk = true;
			
			if (a == 1) {
        // 1은 소수가 아니므로 a가 1일경우 다음 반복으로 넘어감
				continue;
			}

      // Math.sqrt는 a의 제곱근을 구하는 함수
			for (int i = 2; i < Math.sqrt(a); i++) {
				if (a % i == 0) {
					chk = false;
					break;
				}
			}
			
			if (chk) {
				cnt++;
			}
		}
		
		System.out.println(cnt);
	}
}
