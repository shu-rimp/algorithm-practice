package implementation;

import java.util.Arrays;

// Programmers skill check level2-1
class Solution5 {
	
	
    public String solution(int[] numbers) {
        String answer = "";
        
        String[] numSet = new String[numbers.length];
        
        for(int i=0; i<numbers.length; i++) {
        	
        	numSet[i] = Integer.toString(numbers[i]);
        } // for
        
        // 30, 3과 같은 숫자가 들어올 때 303이 되는 것을 방지
        // 문자열 두개씩 묶어서 비교한다.
        Arrays.sort(numSet, (o1, o2) -> (o2+o1).compareTo(o1+o2));
        
        if(numSet[0].equals("0")) {
        	return "0";
        } // if
        
        for(String str : numSet) {
        	answer += str;
        } // for
        
        return answer;
    } // solution
} // end class
