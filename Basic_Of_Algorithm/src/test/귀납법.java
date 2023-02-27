package test;

import java.util.Scanner;;

public class 귀납법 {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		int m = test(n);
		
		int l = 0;
		
		for(int i=n;i>-1;i--) {
			l += i;
		}
		
		if(l==m) System.out.println("이게 귀납법");
		
		System.out.println(l);
		System.out.println(m);
	}
	
	static int test(int n) {
		
		if(n==0) return n;
		return n+test(n-1);
		
	}
}
