package Today_22_05_27;

import java.util.Queue;
import java.util.LinkedList;

public class test {
	
	public static void main(String[] args) {
		
		
		int a = 7;
		
		int [] tree = {20,15,10,17};
		
		
		int min = 0;
		int max = 0;
		
	
		for(int i : tree) if(max<i) max = i;
		
		while(min<max) {
			
			int mid = (min + max) / 2;
			int sum = 0;
			
			for(int i : tree) if(i-mid > 0) sum += i-mid;
			
			if(sum<a) max = mid;
			else min = mid+1;
		}

		System.out.println(min-1);
		
		
		
		
	
	}

}
