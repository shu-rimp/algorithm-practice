package implementation;

import java.util.Arrays;

// Programmers K번째 수

class Solution3 {
	
	
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        for(int i=0; i<commands.length; i++) {
        	int[] arr = Arrays.copyOfRange(array, commands[i][0] - 1, commands[i][1]);
        	
        	Arrays.sort(arr);
        	
        	answer[i] = arr[commands[i][2] - 1];
        } // for
        
        return answer;
    } // solution
} // end class
