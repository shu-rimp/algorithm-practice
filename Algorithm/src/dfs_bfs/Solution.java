package dfs_bfs;

// Programmers 타겟 넘버

class Solution {
	
	int target;
	int answer;
	int[] numbers;
	
    public int solution(int[] numbers, int target) {
    	answer = 0;
        this.target = target;
        this.numbers = numbers;
        
        dfs(0, 0);
        
        return answer;
    } // solution
    
    public void dfs(int index, int sum) {
    	
    	// 1. 탈출조건
    	if(index == numbers.length) {
    		if(sum == target) answer++;
    		
    		return;
    	} // if
    	
    	// 2. 수행동작
    	dfs(index + 1, sum + numbers[index]);
    	dfs(index + 1, sum - numbers[index]);
    	
    } // dfs

} // end class
