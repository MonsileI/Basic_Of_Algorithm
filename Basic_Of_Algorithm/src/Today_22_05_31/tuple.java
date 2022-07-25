package Today_22_05_31;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

public class tuple {
	
	public static void main(String[] args) {
		
		String s = "{{4,2,3},{3},{2,3,4,1},{2,3}}";
		
		s = s.replaceAll("\\{", "");
		s = s.replaceAll("\\}", "");
		
		
		HashMap<Integer,Integer> map = new HashMap<>();
		
		String []temp = s.split(",");
	
		for(String str : temp) {
			int num = Integer.parseInt(str);
			map.put(num,map.getOrDefault(num, 0)+1);
		}
	
		
		ArrayList<Integer> answerList = new ArrayList<>(map.keySet());
		
		
		Collections.sort(answerList, new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				if(map.get(o1)==map.get(o2)) return map.get(o1)- map.get(o2);
				else return map.get(o2)- map.get(o1);
			}
			
		});
		
		
		
		int[]answer= new int[answerList.size()];
		
		for(int i=0;i<answer.length;i++)answer[i] = answerList.get(i);
		
		for(int i : answer)System.out.print(i+" , ");
		
	}

}
