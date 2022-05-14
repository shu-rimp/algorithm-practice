package datastructure;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

// Programmers 프린터

class Solution13 {
	
	
    public int solution(int[] priorities, int location) {
        int answer = 0;
        
        Queue<Integer> print = new PriorityQueue<>(Collections.reverseOrder());
        
        for(int i : priorities) {
        	print.offer(i);
        } // enhanced for
        
        while(!print.isEmpty()) {
        	
        	for(int i=0; i<priorities.length; i++) {
        		if(print.peek() == priorities[i]) {
        			print.poll();
        			answer++;
        			
        			if(location == i) return answer;
        		} // if
        	} // for
        } // while
        
        System.out.println(print.toString());
        
        return answer;
    } // solution
	
} // end class
