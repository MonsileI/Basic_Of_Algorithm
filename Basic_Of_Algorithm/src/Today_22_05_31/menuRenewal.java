package Today_22_05_31;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class menuRenewal {
	
	static HashMap<String, Integer> map = new HashMap<>();
	static ArrayList<String>answerList = new ArrayList<>();
	
	public static void main(String[] args) {
		
		String[]orders = {"ABCFG", "AC", "CDE", "ACDE", "BCFG", "ACDEH"};
		int[]course = {2,3,4};
		
		for(int i=0;i<orders.length;i++) {
			char[]temp = orders[i].toCharArray();
			Arrays.sort(temp);
			orders[i] = String.valueOf(temp);
		}
		
		
		
		for(int count : course) {
			for(String order : orders) {
				
				dfs(count,order,"");
				
			}
			
			if(!map.isEmpty()) {
				ArrayList<Integer>maxList = new ArrayList<>(map.values());
				int max = Collections.max(maxList);
				if(max>1) {
					for(String key : map.keySet()) {
						if(max==map.get(key)) {
							answerList.add(key);
						}
					}
				}
			}
			
			map.clear();
		}
		
		Collections.sort(answerList);
		
		System.out.println(answerList);
		
	}
	static void dfs(int count,String order,String now) {
		
		if(count==0) {
			map.put(now, map.getOrDefault(now, 0)+1);
			return;
		}
		
		for(int i=0;i<order.length();i++) {
			dfs(count-1,order.substring(i+1),now+order.charAt(i));
		}
		
		
	}
}
