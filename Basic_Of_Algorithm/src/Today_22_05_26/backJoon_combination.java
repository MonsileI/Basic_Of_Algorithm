package Today_22_05_26;

import java.util.*;

public class backJoon_combination {

	
	public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
		
	int n = scan.nextInt();
	int m = scan.nextInt();
	int [] arr = new int[n];
	
	for(int i=0;i<n;i++) arr[i] = i+1;
	


	combi(arr,m,"");
		
		
	
	
	
		
	}
	
	static void combi(int[]arr,int count,String now) {
		
		
		if(count==0) {
			System.out.println(now);
			return;
		}
		
		
		
		for(int i=0;i<arr.length;i++) {
			String newOne = arr[i]+ " " + now;
			combi(arr,count-1,newOne);
		}
		
		
		
	}
}
