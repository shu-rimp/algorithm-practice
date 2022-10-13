package datastructure;

import java.util.Arrays;

import lombok.ToString;

// Programmers [3차] 파일명 정렬
class Solution26 {
	
    public String[] solution(String[] files) {
        Files[] fileList = new Files[files.length];
        
        for(int i=0; i<files.length; i++) {
        	String[] split = files[i].split("[0-9]+");
        	String[] splitNum = files[i].split("\\D+");
        	String head = split[0];
        	String number = splitNum[1];
        	String tail = files[i].substring(head.length() + number.length());
        	
        	fileList[i] = new Files(head, number, tail);
        } // enhanced for
        
//        System.out.println(Arrays.toString(fileList));	// 정렬 전
        Arrays.sort(fileList);
//        System.out.println(Arrays.toString(fileList));	// 정렬 후
        
        String[] answer = new String[files.length];
        
        for(int i=0; i<answer.length; i++) {
        	String str = fileList[i].head + fileList[i].number + fileList[i].tail;
        	answer[i] = str;
        } // for
        
//        System.out.println(Arrays.toString(answer));
        return answer;
    } // solution
    
    public static void main(String[] args) {
    	Solution26 sol = new Solution26();
    	String[] files = {"muzi1.txt", "MUZI1.txt", "img12.png", "F-5 Freedom Fighter", "F-6 Freedom Fighter", "B-50 Superfortress", "B-50 SUperfortress", "A-10 Thunderbolt II", "F-14 Tomcat"};
    	
    	sol.solution(files);
    } // main(테스트용)

} // end class

@ToString	// 테스트용
class Files implements Comparable<Files> {
	String head;
	String number;
	int numberInt;
	String tail;
	
	public Files(String head, String number, String tail) {
		super();
		
		this.head = head;
		this.number = number;
		this.numberInt = Integer.parseInt(number.replaceAll(" ", ""));
		this.tail = tail;
	} // constructor
	
	@Override
	public int compareTo(Files o) {
		String head1 = this.head.toLowerCase();
		String head2 = o.head.toLowerCase();
		
		if( head1.equals(head2) ) {
			if( this.numberInt == o.numberInt ) {
				// tail을 들어온 순서대로 정렬
				return 0;
			} else {
				// number 오름차순으로 정렬
				return this.numberInt - o.numberInt;
			} // if-else
		} else {
			// head사전 오름차순으로 정렬
			return head1.compareTo(head2);
		} // if-else
	} // compareTo
	
} // end class:Files
