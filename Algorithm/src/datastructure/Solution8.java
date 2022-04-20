package datastructure;

import java.util.Arrays;

// Programmers 가장 큰 수

public class Solution8 {

	
    public String solution(int[] numbers) {
    	
        String answer = "";
		String[] numberStr = new String[numbers.length];
		
		for(int i=0; i<numbers.length; i++) {
			
			numberStr[i] = Integer.toString(numbers[i]);
		} // for
		
		// 30, 3 과 같은 예외를 방지하기 위해
		// 문자열을 두개씩 묶어서 비교
		Arrays.sort(numberStr, (o1, o2) -> (o2+o1).compareTo(o1+o2));
		
		// 배열이 모두 0일 경우, "000.."으로 리턴되는 것을 방지
		if(numberStr[0].equals("0")) {	
			return "0";
		} // if
		
		for(String str : numberStr) {
			answer += str;
		} // for
        
        return answer;
    } // solution

} // end class
