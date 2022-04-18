package datastructure;

// Programmers 숫자 문자열과 영단어(다른사람의 풀이)

class Solution5_1 {
	
	
    public int solution(String s) {
        int answer = 0;
        
        String[] numberEng = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        
        for(int i=0; i<10; i++) {
        	s.replaceAll(numberEng[i], Integer.toString(i));
        } // for
        
        answer = Integer.parseInt(s);
        return answer;
    } // solution
} // end class
