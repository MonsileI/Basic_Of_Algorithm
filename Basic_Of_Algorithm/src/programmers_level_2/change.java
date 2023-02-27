package programmers_level_2;

import java.util.*;

public class change {

	public static void main(String[] args) {
		
	String [][] clothes = {{"yellowhat", "headgear"}, {"bluesunglasses", "eyewear"}, {"green_turban", "headgear"}};	
	int answer = 1;
	
	HashMap<String,ArrayList<String>> map = new HashMap<>();
	
	for(int i=0;i<clothes.length;i++) {
		
		String first = clothes[i][0];
		String second = clothes[i][1];
		
		if(!map.containsKey(second)) map.put(second, new ArrayList<>());
		
		map.get(second).add(first);
		
	}
	
	
	
	for(String key : map.keySet()) {
		
		answer *= map.get(key).size()+1;
	}
	
	
	
	System.out.println(answer-1);
	
	
	}
}
