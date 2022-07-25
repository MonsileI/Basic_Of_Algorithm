package sw_java_im;

import java.util.Scanner;

public class no_1244 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int count = sc.nextInt();
		
		int [] arr = new int[count+1];
		
		arr[0] = 0;
		
		for(int i=1;i<count+1;i++) {
			
			arr[i] = sc.nextInt();
			
			
		}
		
		count = sc.nextInt();
		
		for(int i=0;i<count;i++) {
			
			int sex = sc.nextInt();
			
			int loc = sc.nextInt();
			
			if(sex==1) {
				
				
				while(true) {
					
					if(arr[loc]==0) {
						arr[loc] = 1;
					}else {
						arr[loc] = 0;
					}
					
					loc = loc + loc;
					
					if(loc>=arr.length) break;
					
					
				}
				
			
			}else {
				
				if(arr[loc]==0) arr[loc] = 1;
				else arr[loc] = 0;
				
				int left = loc-1;
				int right = loc+1;
				
				while(true) {
					
					if(left<1 || arr.length<right || arr[left] != arr[right]) break;
					else {
						
						if(arr[left] == 0) {
							arr[left] = 1;
							arr[right] = 1;
						}else {
							arr[left] = 0;
							arr[right] = 0;
						}
						
						left--;
						right++;
					}
					
				}
				
				
			
		}
			
		}
		
		
		for(int i =1 ; i<arr.length; i++) System.out.println(arr[i]);
	}

}
