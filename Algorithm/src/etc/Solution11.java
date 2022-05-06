package etc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Solution11 {
	
	static int[] temp1 = {1, 2, 3, 4, 5};
	static int[] temp2 = {2, 1, 2, 3, 2, 4, 2, 5};
	static int[] temp3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
	
    public int[] solution(int[] answers) {
        
    	
        int[] student1 = solve(answers, temp1);
        int[] student2 = solve(answers, temp2);
        int[] student3 = solve(answers, temp3);
        
        int count1 = countAnswer(answers, student1);
        int count2 = countAnswer(answers, student2);
        int count3 = countAnswer(answers, student3);
        
        
        List<Integer> maxCount = new ArrayList<>();
        maxCount.add(count1);
        maxCount.add(count2);
        maxCount.add(count3);
        
        int max = Collections.max(maxCount);
        int count = 0;
        
        for(int i=0; i<3; i++) {
        	if(maxCount.get(i) == max) {
        		count++;
        	}
        }
        
        int[] answer = new int[count];
        
        for(int i=0; i<count; i++) {
        	answer[i] = i+1;
        } // for
        
        Arrays.sort(answer);
        
        System.out.println(Arrays.toString(student1));
        System.out.println(Arrays.toString(student2));
        System.out.println(Arrays.toString(student3));
        System.out.println(Arrays.toString(answer));
        
        return answer;
    } // solution
    
    static int[] solve(int[] answers, int[] temp) {
    	
    	int[] mathIsTooHard = new int[answers.length];
    	int j = 0;
    	int size = temp.length;
    	
    	for(int i=0; i<answers.length; i++) {
    		mathIsTooHard[i] = temp[j];
    		
    		j++;
    		if(j >= size) {
    			j = 0;
    		} // if
    	} // for
    	
    	return mathIsTooHard;
    } // solve1
    
    static int countAnswer(int[] answers, int[] student) {
    	int count = 0;
    	
    	for(int i=0; i<answers.length; i++) {
    		if(answers[i] == student[i]) {
    			count++;
    		} // if
    	} // for
    	
    	return count;
    } // countAnswer
    
    
    public static void main(String[] args) {
    	int[] answers = {1,2,3,4,5};
    	
    	Solution11 sol = new Solution11();
    	
    	sol.solution(answers);
    	
    }
    
} // end class
