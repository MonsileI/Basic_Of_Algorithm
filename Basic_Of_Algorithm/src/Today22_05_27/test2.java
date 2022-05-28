package Today22_05_27;

public interface test2 {

	public static void main(String[] args) {
		
		int [] arr = {802,743,457,539};
		int a = 11;
		
		int min = 0;
		int max = 0;
		
		for(int i : arr) if(max<i)max=i;
		
		while(min<max) {
			
			int mid = (min+max)/2;
			int count = 0;
			
			for(int i : arr) count += i/mid;
				
			if(count<a) max = mid;
			else min = mid+1;
			
		}
		
		System.out.println(min-1);
		
	}
}
