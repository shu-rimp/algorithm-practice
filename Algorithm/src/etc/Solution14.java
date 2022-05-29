package etc;

// Programmers 쿼드압축 후 개수 세기

class Solution14 {

    int[] answer = { 0, 0 };

    public int[] solution(int[][] arr) {

        divide(arr, 0, 0, arr.length);
        return answer;
    } // solution

    boolean check(int[][] arr, int row, int col, int size) {

        int val = arr[row][col];

        for(int i=row; i<row + size; i++) {
            for(int j=col; j<col + size; j++) {
                if(arr[i][j] != val) {
                    return false;   // 하나라도 값이 다르면 false
                } // if
            } // for
        } // for

        return true;
    } // check

    void divide(int[][] arr, int row, int col, int size) {      
        if(check(arr, row, col, size)) {
            int val = arr[row][col];

            switch(val) {
                case 0 -> answer[0]++;
                case 1 -> answer[1]++;
            } // switch expression

            return;
        } // if

        size /= 2;

        divide(arr, row, col + size, size); // 1사분면
        divide(arr, row, col, size);    // 2사분면
        divide(arr, row + size, col, size); // 3사분면
        divide(arr, row + size, col + size, size);  // 4사분면
    } // divide
} // end class
