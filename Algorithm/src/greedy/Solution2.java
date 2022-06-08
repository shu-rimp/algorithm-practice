package greedy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class Solution2 {
	
    public int solution(int n, int[] lost, int[] reserve) {
    	int answer = n - lost.length;
    	
    	// 정렬되지 않은 테스트케이스가 있음
    	Arrays.sort(lost);
    	
    	Set<Integer> set = new HashSet<>();
    	
    	for(int i : reserve) {
    		set.add(i);
    	} // for
    	
    	// 여벌이있고 잃어버렸을 경우
    	for(int i=0; i<lost.length; i++) {
    		if(set.contains(lost[i])) {
    			answer++;
    			
    			set.remove(lost[i]);
    			lost[i] = -1;
    		} // if
    	} // for
    	
    	for(int i=0; i<lost.length; i++) {
    		if(set.contains(lost[i] - 1)) {
    			answer++;
    			
    			set.remove(lost[i] - 1);
    		} else if(set.contains(lost[i] + 1)) {
    			answer++;
    			
    			set.remove(lost[i] + 1);
    		} // if-else if
    	} // for
    	
    	return answer;
    } // solution
} // end class
