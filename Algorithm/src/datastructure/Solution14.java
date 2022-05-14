package datastructure;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

// Programmers 기능개발

class Solution14 {
	
	
    public int[] solution(int[] progresses, int[] speeds) {
        int[] answer;
        
        Queue<Integer> task = new LinkedList<>();
        List<Integer> result = new ArrayList<>();
        
        // double로 계산한 결과를 올림하여 정수값으로 저장
        for(int i=0; i<progresses.length; i++) {
        	task.offer((int)Math.ceil((100 - progresses[i]) / (double)speeds[i]));
        } // for
        
        System.out.println(task.toString());
        
        while(!task.isEmpty()) {
        	int tmp = task.poll();
        	int count = 1;
        	
        	// !isEmpty : nullPointerException 방지
        	// 개발기간이 끝난 태스크들을 모두 꺼낸다.
        	while( !task.isEmpty() && tmp >= task.peek() ) {
        		count++;
        		task.poll();
        		
        	} // while
        	
        	result.add(count);
        } // while
        
        answer = new int[result.size()];
        
        for(int i=0; i<answer.length; i++) {
        	answer[i] = result.get(i);
        } // for
        
        return answer;
    } //solution
    
} // end class
