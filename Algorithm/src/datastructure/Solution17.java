package datastructure;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

// Programmers 이중우선순위큐

class Solution17 {
	
    public int[] solution(String[] operations) {
        int[] answer = { 0, 0 };
        
        Queue<Integer> minQ = new PriorityQueue<>();	// 오름차순
        Queue<Integer> maxQ = new PriorityQueue<>(Collections.reverseOrder());	// 내림차순
        
        for(String str : operations) {
        	if(str.charAt(0) == 'I') {
        		String[] num = str.split(" ");
        		
        		minQ.offer(Integer.parseInt(num[1]));
        		maxQ.offer(Integer.parseInt(num[1]));
        	} else if (!minQ.isEmpty()) {	// 큐가 비어있지 않을 때만 삭제 
        		
        		if(str.equals("D 1")) {
        			
        			int max = maxQ.poll();
        			minQ.remove(max);
        		} else if(str.equals("D -1")) {
        			
        			int min = minQ.poll();
        			maxQ.remove(min);
        		} // if-else if
        	} // if-else if
        } // enhanced for
        
        if( !(minQ.isEmpty() && maxQ.isEmpty()) ) {
        	answer[0] = maxQ.poll();
        	answer[1] = minQ.poll();
        } // if
        
        return answer;
    } // solution
} // end class
