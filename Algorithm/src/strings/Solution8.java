package strings;

// Programmers 문자열 압축

class Solution8 {
	
    public int solution(String s) {
    	if(s.length() == 1) return 1;	// 길이가 1인 문자열이 들어올 때
    	
        int answer = Integer.MAX_VALUE;
        
        for(int i=1; i<s.length(); i++) {
        	int zipLength = zipStr(s, i);
        	
        	if(zipLength < answer) {
        		answer = zipLength;
        	} // if
        } // for
        
        System.out.println(answer);
        return answer;
    } // solution
    
    int zipStr(String s, int amount) {
    	StringBuilder sb = new StringBuilder();
    	
    	int zipCount = 0;
    	
    	String compare = s.substring(0, amount);	// 비교할 문자열
    	String lastStr = "";	// 남은 문자열
    	for(int i=0; i<s.length(); i += amount) {
    		
    		if(i + amount > s.length()) {
    			lastStr = s.substring(i);
    			
    			break;
    		} // if
    		
    		if(compare.equals(s.substring(i, i + amount))) {
    			zipCount++;
    		} else {
    			if(zipCount == 1) sb.append(compare);
    			else sb.append(zipCount).append(compare);
    			
    			compare = s.substring(i, i + amount);
    			zipCount = 1;
    		} // if-else
    	} // for
    	
    	if(zipCount == 1) sb.append(compare);
    	else sb.append(zipCount).append(compare);
    	
    	sb.append(lastStr);
    	
    	return sb.toString().length();
    } // zipStr
    
} // end class
