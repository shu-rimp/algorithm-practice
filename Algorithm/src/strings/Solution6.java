package strings;

import java.util.Stack;

class Solution6 {
	
    public String solution(String new_id) {
    	
        String answer = "";
        
        // -_.~!@#$%^&*()=+[{]}:?,<>/
        String[] notAllowed = {
    		"\\~", "\\!", "\\@", "\\#", "\\$", "\\%", "\\^", "\\&", "\\*", "\\(", "\\)", 
    		"\\=", "\\+", "\\[", "\\]", "\\{", "\\}", "\\:", "\\?", "\\,", "\\<", "\\>", "\\/" 
        };
        
    // step1
        new_id = new_id.toLowerCase();		
        
    // step2
        for(String str : notAllowed) {
        	new_id = new_id.replaceAll(str, "");
        } // enhanced for		
        
    // step3
        Stack<Character> stack = new Stack<>();
        for(char a : new_id.toCharArray()) {
        	if(stack.isEmpty()) {
        		stack.push(a);
        		
        		continue;
        	} // if
        	
        	if(a == '.' && stack.peek() == a) {
        		continue;
        	} // if
        	
        	stack.push(a);
        } // enhanced for 	
        
     // step4
        if(stack.firstElement() == '.') {
        	stack.remove(0);
        } // if
        
        if(!stack.isEmpty()) {
        	if(stack.lastElement() == '.') {
        		stack.remove(stack.size() - 1);
        	} // inner if
        } // outer if			
        
     // step5
        if(stack.isEmpty()) {
        	stack.push('a');
        } // if		
        
     // step6
    	while(stack.size() >= 16 || stack.peek() == '.') {
    		stack.pop();
    	} // while 		
    	
	// step7
    	if(stack.size() <= 2) {
    		char tmp = stack.peek();
    		
    		while(stack.size() <= 2) {
    			stack.push(tmp);
    		} // while
    	} // if 		
        
	// return answer
        while(!stack.isEmpty()) {
        	answer += stack.firstElement();
        	
        	stack.remove(0);
        } // while 		
        
        System.out.println(answer);
        
        return answer;
    } // solution
    
    public static void main(String[] args) {
    	
    	Solution6 sol = new Solution6();
    	
    	sol.solution("=.=");
    	
    } // main
    
} // end class
