package etc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// baekjoon 17427 약수의 합2

public class Solution18 {
	
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		long answer = 0;
		
		for(int i=1; i<=n; i++) {
			answer += (n / i) * i;
		} // for
		
		System.out.println(answer);
	} // main
	
} // end class
