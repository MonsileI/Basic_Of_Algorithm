package Today_22_05_31;

import java.util.ArrayList;

public class apchuck {
	
	public static void main(String[] args) {
		
		
		String msg = "KAKAO";
		
		String alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		ArrayList<String> dic = new ArrayList<>();
		ArrayList<Integer>ans = new ArrayList<>();
		
		dic.add("^&#(");
		
		for(int i=0;i<alpha.length();i++) dic.add(""+alpha.charAt(i));
		
		int idx = 0;
		
		String now = "";
		String next = "";
		
		while(idx<msg.length()) {
			
			next = ""+msg.charAt(idx);
			
			String newOne = now + next;
			
			if(dic.contains(newOne)) {
				now = newOne;
				idx++;
				
				
			}else {
				
				dic.add(newOne);
				ans.add(dic.indexOf(now));
				idx++;
				now = next;
			}
			
				
			
			
		}
		
		ans.add(dic.indexOf(now));
		
		System.out.println(ans);
		
	}

}
