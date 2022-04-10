package datastructure;

import java.util.Arrays;

// 프로그래머스 전화번호 목록

public class Solution3 {
	
	
	public boolean solution(String[] phone_book) {
		
		boolean answer = true;
		
		Arrays.sort(phone_book);
		
		for(int i=phone_book.length - 1; i>0; i--) {
			
			if( phone_book[i].indexOf(phone_book[i-1]) == 0 ) {
				answer = false;
				
				break;
			} // if
			
		} // for 
		
		return answer;
		
	} // solution
 
} // end class
