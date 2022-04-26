package implementation;

import java.util.LinkedList;
import java.util.List;

class Solution4 {
	
	
    public int solution(int[] numbers) {
        int answer = 0;
        
        List<Integer> num = new LinkedList<>();
        int[] numberSet = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        
        for(int i : numbers) {
        	num.add(i);
        } // for
        
        
        for(int i=0; i<numberSet.length; i++) {
        	
        	if(num.indexOf(numberSet[i]) == -1) {
        		answer += numberSet[i];
        	} // if
        } // for
        
        return answer;
    } // main
} // end class
