package Today_22_05_20;

import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class tuple {

	
	public static void main(String[] args) {
		
		String s = "{{2},{2,1},{2,1,3},{2,1,3,4}}";
		
		s = s.replaceAll("\\{", "");
		s = s.replaceAll("\\}", "");
		
		HashMap<Integer,Integer> map = new HashMap<>();
		
		String [] splitString = s.split(",");
		
		for(int i=0;i<splitString.length;i++) {
			int num = Integer.parseInt(splitString[i]);
			map.put(num, map.getOrDefault(num, 0)+1);
		}
		
		List<Integer> keySet = new ArrayList<>(map.keySet());
		Collections.sort(keySet, (o1,o2)-> map.get(o2).compareTo(map.get(o1)));
		
		System.out.println(keySet);
		
	}
}
