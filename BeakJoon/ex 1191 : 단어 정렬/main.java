import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
			
		String[] arr = new String[N];
		
		for (int i = 0; i < N; i++) {
			arr[i] = br.readLine();
		}
		// stream을 이용해 배열 중복 제거 ** java8이상부터 가능
		String[] resultArr = Arrays.stream(arr).distinct().toArray(String[]::new); 

    // 조건 정렬
		Arrays.sort(resultArr, new Comparator<String>() {
			
			@Override
			public int compare(String s1, String s2) {
        // 문자의 길이가 같을 경우 사전 순으로
				if (s1.length() == s2.length()) {
					return s1.compareTo(s2);	
        // 다를경우 길이 순으로
				} else {
					return s1.length() - s2.length();
				}
			}
		});	
		
		for (int i = 0; i < resultArr.length; i++) {
			System.out.println(resultArr[i]);
		}
	}
	
}
