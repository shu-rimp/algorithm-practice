package dfs_bfs;

import java.util.LinkedList;
import java.util.Queue;

// Programmers 네트워크

class Solution12 {
	
	boolean[] visited;
	
    public int solution(int n, int[][] computers) {
        int answer = 0;
        
        visited = new boolean[n];
        
        for(int i=0; i<n; i++) {
        	if(!visited[i]) {
        		bfs(i, computers);
        		
        		answer++;
        	} // if
        } // for
        
        return answer;
    } // solution
    
    void bfs(int start, int[][] computers) {
    	
    	Queue<Integer> q = new LinkedList<>();
    	
    	q.offer(start);
    	visited[start] = true;
    	
    	while(!q.isEmpty()) {
    		int nodeIndex = q.poll();
    		
    		for(int i=0; i<computers[nodeIndex].length; i++) {
    			int tmp = computers[nodeIndex][i];
    			
    			if( tmp == 1 && !visited[i] ) {
    				q.offer(i);
    				visited[i] = true;
    			} // if
    		} // for
    	} // while
    } // bfs
    
} // end class
