package datastructure;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

// Baekjoon11652 카드

public class Solution5 {
	
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		long[] cards = new long[n];
		
		for(int i=0; i<n; i++) {
			cards[i] = Long.parseLong(br.readLine());
		} // for
		
		br.close();
		
		Arrays.sort(cards);
		
		long temp = 1L;		// 각 카운트를 세기 위한 임시변수
		long maxCount = 0L;	// 가장 많이 가지고 있는 정수의 갯수 
		long num = 0L;		// 해당 정수
		
		for(int i=1; i<cards.length; i++) {
			
			if(cards[i] != cards[i-1]) {
				
				if(temp > maxCount) {
					
					maxCount = temp;
					num = cards[i-1];
				} // if
				
				temp = 0L;
			} // if
			
			temp++;
		} // for
		
		if(temp > maxCount) {
			
			maxCount = temp;
			num = cards[cards.length-1];
		} // if
		
		System.out.println(num);
	} // main
    
} // end class
