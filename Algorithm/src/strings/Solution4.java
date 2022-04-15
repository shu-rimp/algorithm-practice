package strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// baekjoon5525 IOIOI

public class Solution4 {
	
	static String p = "I";
	
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int m = Integer.parseInt(br.readLine());
		String s = br.readLine();
		
		br.close();
		
		ioi(n);
		
		int count = 0;
		for(int i=0; i < m - p.length() + 1; i++) {
			
			if(s.subSequence(i, i + p.length()).equals(p)) {
				
				count++;
			} // if
		} // for
		
		System.out.println(count);
	} // main
	
	public static void ioi(int n) {
		
		if(n == 0) {
			return;
		} // if
		
		p += "OI";
		ioi(n-1);
	} // ioi

} // end class
