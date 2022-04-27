package datastructure;

// Programmers 주식가격

class Solution12 {
	
	
    public int[] solution(int[] prices) {
    	
        int[] answer = new int[prices.length];
        
        for(int i=0; i<prices.length; i++) {
        	int second = 0;
        	
        	for(int j=i + 1; j<prices.length; j++) {
        		
        		second++;
        		if(prices[i] > prices[j]) {
        			break;
        		} // if
        		
        	} // inner for
        	
        	answer[i] = second;
        } // for
        
        return answer;
    } // solution
} // end class
