package programmers_level_2;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Arrays;

public class no_5 {

	static HashMap<String,Integer> map = new HashMap<>();
	static ArrayList<String> answerList = new ArrayList<>();
	
	public static void main(String[] args) {
		
		String[] orders = {"ABCFG", "AC", "CDE", "ACDE", "BCFG", "ACDEH"};
		int [] course = {2,3,4};
		
		for(int i=0;i<orders.length;i++) {
			
			char[]arr = orders[i].toCharArray();
			Arrays.sort(arr);
			orders[i] = String.valueOf(arr);
			
			
			
		}
		
		
		for(int c : course) {
			for(String order : orders) {
				
				dfs(c,order,"");
				
				
			}
			
			if(!map.isEmpty()) {
				ArrayList<Integer> list = new ArrayList<>(map.values());
				int max = Collections.max(list);
				if(max>1) {
					for(String key : map.keySet()) {
						if(map.get(key)==max) {
							answerList.add(key);
						}
					}
					
				}
				
				
				
			}
			
			
			map.clear();
		}
		
		String[]answer = new String[answerList.size()];
		
		Collections.sort(answerList);
		
		for(int i=0;i<answerList.size();i++) answer[i] = answerList.get(i);
		
		for(String str : answer)System.out.println(str);
	}
	
	static void dfs(int count, String order,String now) {
		
		if(count==0) {
			
			map.put(now, map.getOrDefault(now, 0)+1);
			
			return;
		}
		
		
		for(int i=0;i<order.length();i++) {
			
			dfs(count-1,order.substring(i+1),now + order.charAt(i));
			
		}
		
		
	}
}
