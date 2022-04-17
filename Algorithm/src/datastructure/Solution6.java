package datastructure;

import java.util.Stack;

// programmers 크레인 인형뽑기 게임

public class Solution6 {
	
	
    public int solution(int[][] board, int[] moves) {
    	
        int answer = 0;
        
        Stack<Integer> result = new Stack<>();
        result.push(0);		// peek할 때 EmptyStackException 방지
        
        for(int i : moves) {
        	
        	for(int j=0; j<board.length; j++) {
        		
        		if(board[j][i-1] != 0) {
        			
        			if(result.peek() == board[j][i-1]) {
        				result.pop();
        				
        				answer += 2;
        			} else {
        				result.push(board[j][i-1]);
        			} // if else
        			
        			board[j][i-1] = 0;
        			
        			break;
        		} // if
        	} // inner for
        } // outer for
        
        return answer;
    } // solution
    
} // end class
