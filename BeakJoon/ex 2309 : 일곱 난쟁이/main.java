import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int arr[] = new int[9];
		int sum = 0;
		
		// 먼저 아홉난쟁이의 키의 합을 구한다.
		for (int i = 0; i < 9; i++) {
			arr[i] = Integer.parseInt(bf.readLine());
			sum += arr[i];
		}
		
		// 아홉난쟁이의 키의 합에서 두명의 키를 뺀값이 100이면
		for (int i = 0; i < 8; i++) {
			for (int j = i+1; j < 9; j++) {
				
				if (sum - arr[i] - arr[j] == 100) {
					// 그 난쟁이의 키의 값을 0으로 변경한 후
					arr[i] = 0;
					arr[j] = 0;
					// 오름차순으로 정렬하면 키의 값이 0이된 두 난쟁이의 인덱스는 0번째와 1번째로 변한다.
					Arrays.sort(arr);
					// 그러면 2번째 인덱스부터 마지막 인덱스까지 값을 출력하면 키의 총합이 100인 일곱난쟁이를 찾을 수 있다.
					for (int k = 2; k < 9; k++) {
						System.out.println(arr[k]);
					}
					return;
				}
			}
		}

	}
}
