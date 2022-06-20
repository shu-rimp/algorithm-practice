package datastructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// baekjoon 1991 트리 순회

public class Solution25 {

	static Node[] node;
	static StringBuilder sb = new StringBuilder();
	
	static class Node {
		char root;
		Node left;
		Node right;
		
		public Node(char root) {
			this.root = root;
		} // constructor
	} // end class : Node
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());
		
		// 노드갯수만큼의 노드타입 배열 생성
		node = new Node[n];
		
		// 배열 초기화 : 0번째 인덱스부터 노드객체를 저장한다.
		// 이 때 루트는 A부터 순서대로 저장
		char root = 'A';
		for(int i=0; i<n; i++) {
			node[i] = new Node(root++);
		} // for
		
		// 각 인덱스의 노드객체의 left, right필드값 초기화
		for(int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			
			int rootIdx = st.nextToken().charAt(0) - 'A';
			char left = st.nextToken().charAt(0);
			char right = st.nextToken().charAt(0);
			
			node[rootIdx].left = (left == '.' ? null : node[left - 'A']);
			node[rootIdx].right = (right == '.' ? null : node[right - 'A']);
		} // for
		
		preorder(node[0]);
		sb.append("\n");
		
		inorder(node[0]);
		sb.append("\n");
		
		postorder(node[0]);
		sb.append("\n");
		
		System.out.println(sb.toString());
	} // main
	
	// preorder : root - left - right
	static void preorder(Node node) {
		sb.append(node.root);
		if(node.left != null) preorder(node.left);
		if(node.right != null) preorder(node.right);
	} // preorder
	
	// inorder : left - root - right
	static void inorder(Node node) {
		if(node.left != null) inorder(node.left);
		sb.append(node.root);
		if(node.right != null) inorder(node.right);
	} // inorder
	
	// postorder : left - right - root
	static void postorder(Node node) {
		if(node.left != null) postorder(node.left);
		if(node.right != null) postorder(node.right);
		sb.append(node.root);
	} // postorder

} // end class
