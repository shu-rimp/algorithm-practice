package sample0405_objectinputoutput;

import java.util.Scanner;


public class Solution {
//------------------ 변경 불가 -----------------------

	
	static boolean isAnagram(String a, String b) {
		// Complete the function
		
		return Solution.checkAnagram(Solution.charCount(a), Solution.charCount(b));
	} // isAnagram

	
	static int[] charCount(String str) {
		str = str.toLowerCase();

		int[] countList = new int[26];					// 알파벳 a-z 크기의 배열
		int count = 0;

		for (int i = 0; i < 26; i++) {					// a-z까지 반복
			count = 0;						// 알파벳 하나 검증 후 count 다시 초기화

			for (int j = 0; j < str.length(); j++) {		// a-z가 str에 있다면 count
				
				if ((int)(str.charAt(j)) == i + 97) {		// i + 97한 이유 : ascii code값
					count++;
				} // if
			} // inner-for

			countList[i] = count;
		} // outer-for

		return countList;
	} // charCount : 알파벳 별로 카운팅한 배열 반환

	static boolean checkAnagram(int[] a, int[] b) {
		boolean check = false;

		for(int i = 0; i < 26; i++) {

			if (a[i] == b[i]) {
				check = true;
			} else {
				check = false;
				break;
			} // if-else
		} // for

		return check;
	} // checkAnagram : a, b 배열의 요소가 모두 같으면 true

//------------------ 변경 불가 -----------------------
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String a = scan.next();
		String b = scan.next();
		scan.close();
		boolean ret = isAnagram(a, b);
		System.out.println((ret) ? "Anagrams" : "Not Anagrams");
	} // main
} // end class
