import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		
		int x = 0;
		int y = 0;
		int w = 0;
		int h = 0;
		
		while (st.hasMoreTokens()) {
			x = Integer.parseInt(st.nextToken());
			y = Integer.parseInt(st.nextToken());
			w = Integer.parseInt(st.nextToken());
			h = Integer.parseInt(st.nextToken());
		}
		
		int a = x - 0;
		int b = y - 0;
		int c = w - x;
		int d = h - y;
		
		int min = a;
		
		if (min >= b) min = b;
		if (min >= c) min = c;
		if (min >= d) min = d;
		
		System.out.println(min);
	}
}
