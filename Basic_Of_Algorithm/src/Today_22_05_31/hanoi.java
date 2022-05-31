package Today_22_05_31;

import java.util.Scanner;


public class hanoi {
	
	public static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) {
		
		int n = 3;
		
		
		hanoi(n,1,2,3);
		
	}
	static void hanoi(int n,int start,int mid,int to) {
		
		if(n==1) {
			System.out.println(start + " -> " + to);
			return;
		}
		
		hanoi(n-1,start,to,mid);
		
		System.out.println(start+" -> " +to);
		
		hanoi(n-1,mid,start,to);
	}
}