package etc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution6 {
	
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());
		boolean oddValid1 = false;
		boolean oddValid2 = false;
		boolean evenValid1 = false;
		boolean evenValid2 = false;
		
		for(int i=0; i<n; i++) {
			
			int length = Integer.parseInt(br.readLine());
			int[] num = new int[length];
			
			st = new StringTokenizer(br.readLine(), " ");
			for(int j=0; j<length; j++) {
				num[j] = Integer.parseInt(st.nextToken());
			} // for
			
			for(int j=0; j<length; j+=2) {
				if(num[j] % 2 == 0) {
					oddValid1 = true;
				} else {
					oddValid1 = false;
					
					break;
				} // if-else
			} // for
			
			for(int j=0; j<length; j+=2) {
				if(num[j] % 2 == 1) {
					oddValid2 = true;
				} else {
					oddValid2 = false;
					
					break;
				} // if-else
			} // for
			
			for(int j=1; j<length; j+=2) {
				if(num[j] % 2 == 0) {
					evenValid1 = true;
				} else {
					evenValid1 = false;
					
					break;
				} // if-else
			} // for
			
			for(int j=1; j<length; j+=2) {
				if(num[j] % 2 == 1) {
					evenValid2 = true;
				} else {
					evenValid2 = false;
					
					break;
				} // if-else
			} // for
			
			if((oddValid1 == true && evenValid1 == true)
				|| (oddValid1 == true && evenValid2 == true)
				|| (oddValid2 == true && evenValid1 == true)
				|| (oddValid2 == true && evenValid2 == true)) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			} // if-else
			
		} // for
	} // main
} // end class
