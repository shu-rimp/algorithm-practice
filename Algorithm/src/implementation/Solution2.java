package implementation;

// Programmers 음양 더하기

public class Solution2 {
	
	
    public int solution(int[] absolutes, boolean[] signs) {
    	
        int answer = 0;
        
        for(int i=0; i<signs.length; i++) {
        	if(signs[i] == false) {
        		absolutes[i] = -absolutes[i];
        	} // if
        	
        	answer += absolutes[i];
        } // for
        
        return answer;
    } // solution
    
} // end class
