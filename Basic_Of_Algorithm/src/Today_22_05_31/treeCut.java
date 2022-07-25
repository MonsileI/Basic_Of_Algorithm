package Today_22_05_31;

import java.util.Collections;

public class treeCut {

	public static void main(String[] args) {
		
	int[]arr = {20,15,10,17};
	int cut = 7;
	
	int min = 0;
	int max = 0;
	
	for(int i : arr) if(max<i) max= i;
	
	while(min<max) {
		
		int mid = (max+min)/2;
		
		int count = 0;
		
		for(int i : arr) if(i-mid>0) count += i-mid;
			
		if(count>cut) min = mid+1;
		else max = mid;
		
		
		
	}
	
	System.out.println(min);
	
		
		
	}
}
