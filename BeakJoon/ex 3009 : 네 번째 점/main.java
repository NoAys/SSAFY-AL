import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		
		int[] crd1 = {Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())};
		st = new StringTokenizer(bf.readLine());
		
		int[] crd2 = {Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())};
		st = new StringTokenizer(bf.readLine());
		
		int[] crd3 = {Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())};
		
		int x;
		int y;
		
		
		if (crd1[0] == crd2[0]) {
			x = crd3[0];
		} else if (crd1[0] == crd3[0]) {
			x = crd2[0];
		} else {
			x = crd1[0];
		}
		
		
		if (crd1[1] == crd2[1]) {
			y = crd3[1];
		} else if (crd1[1] == crd3[1]) {
			y = crd2[1];
		} else {
			y = crd1[1];
		}

		System.out.println(x + " " + y);
		
	}
}
