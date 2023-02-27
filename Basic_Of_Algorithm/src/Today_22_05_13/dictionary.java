package Today_22_05_13;

import java.util.ArrayList;

public class dictionary {
	
	public static void main(String[] args) {
		
		String msg = "KAKAO";
		
		ArrayList<String> dic = new ArrayList<>();
		ArrayList<Integer> ans = new ArrayList<>();
		
		String alp = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		dic.add("&&");
		
		for(int i=0;i<alp.length();i++) dic.add(""+alp.charAt(i));
		
		String now = "";
		
		int idx = 0;
		
		while(idx<=msg.length()) {
			
			if(idx==msg.length()) {
				ans.add(dic.indexOf(now));
				break;
			}
			
			String next = ""+msg.charAt(idx);
			String newOne =now+next;
			
			if(dic.contains(newOne)) {
				now = newOne;
				idx++;
				continue;
			}
			
			dic.add(newOne);
			ans.add(dic.indexOf(now));
			idx++;
			now = next;
			
		}
		
			
		
		
		System.out.println(ans);
	}

}
