package strings;

// Programmers 숫자 문자열과 영단어

public class Solution5 {
	
	
    public int solution(String s) {
        int answer = 0;
        
        String num = "";
        String temp = "";
        
        for(int i=0; i<s.length(); i++) {
        	num += s.charAt(i);
        	
        	temp += switch(num) {
	        	case "zero", "0"	 -> {num = ""; yield "0";}
	        	case "one", "1" 	 -> {num = ""; yield "1";}
	        	case "two", "2" 	 -> {num = ""; yield "2";}
	        	case "three", "3" 	 -> {num = ""; yield "3";}
	        	case "four", "4" 	 -> {num = ""; yield "4";}
	        	case "five", "5" 	 -> {num = ""; yield "5";}
	        	case "six", "6" 	 -> {num = ""; yield "6";}
	        	case "seven", "7" 	 -> {num = ""; yield "7";}
	        	case "eight", "8" 	 -> {num = ""; yield "8";}
	        	case "nine", "9"	 -> {num = ""; yield "9";}
	        	default 			 -> "";
        	}; // switch expression
        } // for
        
        answer = Integer.parseInt(temp);
        
        return answer;
    } // solution
} // end class
