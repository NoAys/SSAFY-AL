import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		Map<String, Double> grade = new HashMap<>();
		grade.put("A+", 4.5);
		grade.put("A0", 4.0);
		grade.put("B+", 3.5);
		grade.put("B0", 3.0);
		grade.put("C+", 2.5);
		grade.put("C0", 2.0);
		grade.put("D+", 1.5);
		grade.put("D0", 1.0);
		grade.put("F", 0.0);
		grade.put("P", 0.0);
		
		int sum = 0;
		double gsum = 0;
		
		
		for (int i = 0; i < 20; i++) {
			st = new StringTokenizer(bf.readLine());
			
			String A = st.nextToken();
			double B = Double.parseDouble(st.nextToken());
			String C = st.nextToken();
			if (C.equals("P")) {
				continue;
			}
			double D = B * grade.get(C);
			sum += B;
			gsum += D;			
		}
		
		System.out.println(String.format("%.6f", gsum / sum));
		
	}

}
