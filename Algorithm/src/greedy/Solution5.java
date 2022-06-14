package greedy;

import java.util.Scanner;

// baekjoon 2839 설탕 배달

public class Solution5 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int count = 0;
		
		while(true) {
			if(n%5 == 0) {
				count += n/5;
				System.out.println(count);
				
				break;
			} else {
				n -= 3;
				
				count++;
			} // if-else
			
			if(n < 0) {
				System.out.println(-1);
				
				break;
			} // if
		} // while
	} // main
} // end class
