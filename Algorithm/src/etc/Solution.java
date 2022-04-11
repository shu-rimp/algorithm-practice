package etc;

// programmers x만큼 간격이 있는 n개의 숫자

class Solution {
	
	
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        long num = 0;
        
        for(int i=0; i<n; i++) {
            
            num += x;
            answer[i] = num;    
        } // for
        
        return answer;
    } // solution
} // end class
 