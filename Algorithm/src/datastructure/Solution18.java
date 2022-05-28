package datastructure;

import java.util.PriorityQueue;
import java.util.Queue;

// Programmers 더 맵게

class Solution18 {
	
    public int solution(int[] scoville, int K) {
        int answer = 0;
        Queue<Integer> q = new PriorityQueue<>();
        
        for(int num : scoville) {
        	q.offer(num);
        } // for
        
        while(q.peek() < K) {
        	if( q.size() == 1 && q.peek() < K ) {
        		return -1;
        	} // if
        	
        	int hot = q.poll() + (q.poll() * 2);
        	q.offer(hot);
        	
        	answer++;
        } // while
        
        return answer;
    } // solution
} // end class
