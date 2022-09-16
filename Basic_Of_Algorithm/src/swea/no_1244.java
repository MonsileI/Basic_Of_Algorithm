package swea;

import java.util.Scanner;

public class no_1244 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int size = sc.nextInt();
		
		int[]arr = new int[size];
		
		for(int i=0;i<size;i++) arr[i] = sc.nextInt();
		
		int test = sc.nextInt();
		
		for(int t=0;t<test;t++) {
			
			int sex = sc.nextInt();
			int idx = sc.nextInt();
			
			if(sex==1) {
				for(int i=idx;i<size;i += idx) {
					if(arr[i]==1) arr[i] = 0;
					else arr[i] = 1;
				}
			}else {
				
				int plus = 1;
				
				while(true) {
					
					if(arr[idx+plus]==arr[idx-plus]) {
						if(arr[idx+plus]==1) {
							arr[idx+plus] = 0;
							arr[idx-plus] = 0;
						}else {
							arr[idx+plus] = 1;
							arr[idx-plus] = 1;
						}
						
						plus++;
						
					}else break;
				
					
					
				}
				
					
					
					
			}
				
				
			}
			

			
		
		
		for(int i : arr)System.out.println(i);
		
	}

}
