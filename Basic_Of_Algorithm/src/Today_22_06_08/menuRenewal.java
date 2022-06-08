package Today_22_06_08;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Arrays;

public class menuRenewal {

	static HashMap<String,Integer> map = new HashMap<>();
	static ArrayList<String> answerList = new ArrayList<>();
	public static void main(String[] args) {
		
		String []orders = {"ABCFG", "AC", "CDE", "ACDE", "BCFG", "ACDEH"};
		int []course = {2,3,4};
		
		for(int i=0;i<orders.length;i++) {
			
			char[]temp = orders[i].toCharArray();
			Arrays.sort(temp);
			orders[i] = String.valueOf(temp);
			
		}
		
		for(int c : course) {
			for(String order : orders) {
				
				dfs(c,order,"");
			}
			
			
			if(!map.isEmpty()) {
				ArrayList<Integer> maxList = new ArrayList<>(map.values());
				int max = Collections.max(maxList);
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
		
		for(String str : answer) System.out.print(str +", ");
		
		
		
	}
	
	static void dfs(int c,String order,String now) {
		
		if(c==0) {
			if(!map.containsKey(now)) {
				map.put(now, 0);
			}
			map.put(now,map.get(now)+1);
			return;
		}
		
		for(int i=0;i<order.length();i++) dfs(c-1,order.substring(i+1),now+order.charAt(i));
	
	}
}
