package Today_22_05_31;

import java.util.HashMap;
import java.util.TreeMap;
import java.util.ArrayList;

public class parkingFee {
	
	static HashMap<String,Integer> map = new HashMap<>();
	static TreeMap<String,Integer> tree = new TreeMap<>();
	
	public static void main(String[] args) {
		
		int[]fees = {180,5000,10,600};
		String []records = {"05:34 5961 IN", "06:00 0000 IN", "06:34 0000 OUT", "07:59 5961 OUT", "07:59 0148 IN", "18:59 0000 IN", "19:09 0148 OUT", "22:59 5961 IN", "23:00 5961 OUT"};
		
		
		for(String str : records) {
			
			String [] temp = str.split(" ");
			
			int time = change(temp[0]);
			String num = temp[1];
			String action = temp[2];
			
			if(action.equals("IN")) map.put(num, time);				
			else {
				
				if(!tree.containsKey(num)) tree.put(num, 0);
				
				tree.put(num, tree.get(num) + (time - map.get(num)));
				map.remove(num);
				
			}
		}
		
		if(!map.isEmpty()) {
			for(String key : map.keySet()) {
				if(!tree.containsKey(key)) tree.put(key, 0);
		
				tree.put(key, tree.get(key) + ((23 * 60) + 59 - map.get(key)));
				
			}
		}
		
		System.out.println(tree);
		
		ArrayList<Integer> answerList = new ArrayList<>();
		
	
		
		for(String key : tree.keySet()) {
			
			int time = tree.get(key);
		
			if(time<=fees[0]) {
				answerList.add(fees[1]);
				continue;
			}
			time -= fees[0];
			double result = fees[1];
			double check = (double)time/fees[2];

			check = Math.ceil(check);
	
			result += fees[3] * check;
			answerList.add((int)result);
			
			
		}
		
		System.out.println(answerList);
		
	
	}
	static int change(String time) {
		
		String [] temp = time.split(":");
		
		int hour = Integer.parseInt(temp[0]) * 60;
		int min = Integer.parseInt(temp[1]) + hour;
		
		return min;
		
	}
}
