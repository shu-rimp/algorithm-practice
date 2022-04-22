package etc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution4 {
	
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		for(int i=0; i<n; i++) {
			
			int div = Integer.parseInt(br.readLine());
			
			if(div >= 1900) {
				System.out.println("Division 1");
			} else if(1600 <= div && div <= 1899) {
				System.out.println("Division 2");
			} else if(1400 <= div && div <= 1599) {
				System.out.println("Division 3");
			} else {
				System.out.println("Division 4");
			} // if-else if-else
			
		} // for
	} // main
} // end class
