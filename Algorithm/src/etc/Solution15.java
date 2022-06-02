package etc;

import java.util.Scanner;

// baekjoon1436 영화감독 숌

public class Solution15 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		sc.close();
		
		int count = 0;
		int num = 666;
		
		while(true) {
			if(Integer.toString(num).contains("666")) {
				count++;
				
				if(count == n) {
					System.out.println(num);
					
					break;
				} // if
			} // if
			
			num++;
		} // while
	} // main
} // end class
