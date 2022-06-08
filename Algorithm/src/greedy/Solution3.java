package greedy;

import java.util.Arrays;

// Programmers 단속카메라

class Solution3 {
	
    public int solution(int[][] routes) {
        int answer = 0;
        Arrays.sort(routes, (a, b) -> Integer.compare(a[1], b[1]));
        
        int min = Integer.MIN_VALUE;
        for(int[] arr : routes) {
        	if(min < arr[0]) {
        		min = arr[1];
        		
        		answer++;
        	} // if
        } // enhanced for
        
        return answer;
    } // solution
} // end class
