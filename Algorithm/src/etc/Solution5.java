package etc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;


public class Solution5 {
	
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());
		
		for(int i=0; i<n; i++) {
			
			int length = Integer.parseInt(br.readLine());
			int[] num = new int[length];
			
			st = new StringTokenizer(br.readLine(), " ");
			for(int j=0; j<length; j++) {
				num[j] = Integer.parseInt(st.nextToken());
			} // for
			
			Arrays.sort(num);
			
			int temp = num[0];
			int count = 0;
			boolean notIn = true;
			
			for(int j=0; j<num.length; j++) {
				count++;
				
				if(num[j] != temp) {
					temp = num[j];
					
					count = 1;
				} // if
				
				if(count >= 3) {
					System.out.println(num[j]);
					notIn = false;
					
					break;
				} // if
			} // for
			
			if(notIn) {
				System.out.println(-1);
			} // if
			
		} // for
	} // main
} // end class
