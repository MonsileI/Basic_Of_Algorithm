package Today_22_05_24;


import java.util.ArrayList;
import java.util.Collections;

public class programmer_lv_2_no_3 {
	
	 static ArrayList<int[]> answer = new ArrayList<>();
	    static int[] ryan;
	    static int[] apeach;
	    static int N;
	    static int max = Integer.MIN_VALUE;
	
	
	public static void main(String[] args) {
		
		int []info = {0,0,0,0,0,0,0,0,3,4,3};
		
		int n = 10;
		
		apeach = info.clone();
		
		ryan = new int[11];
        N = n;
        apeach = info.clone();
        dfs(0, 0);
        
        Collections.sort(answer,(o1,o2)->{
        	
        	
        	for(int i=apeach.length-1;i>-1;i--) {
        		if(o1[i]!=o2[i]) return o2[i]-o1[i];
        	}
        	
        	
        	return 0;
        });
        
        for(int i : answer.get(0))System.out.print(i+",");
        
	}
	 
	static void dfs(int s, int l) {
		
		if(l==N) {
			int r = 0;
			int a = 0;
			
			for(int i=0;i<apeach.length;i++) {
				if(ryan[i]==0 && apeach[i]==0)continue;
				if(apeach[i]<ryan[i]) r += 10 - i;
				else a += 10 - i;
			}
			
			
			if(r>a) {
				int diff = r - a;
				if(diff>max) {
					max = diff;
					answer.clear();
					answer.add(ryan.clone());
				}else if(diff==max) {
					answer.add(ryan.clone());
				}
				
			}
			
			
		}
		
		else {
			
			for(int i=s;i<apeach.length;i++) {
				ryan[i]++;
				dfs(i,l+1);
				ryan[i]--;
				
			}
			
		}
	}
	
}  
