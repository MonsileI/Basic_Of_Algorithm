package test;

import java.util.*;

public class parking {

	public static void main(String[] args) {
		
			int[]fees= {180, 5000, 10, 600};
			String[]records = {"05:34 5961 IN", "06:00 0000 IN", "06:34 0000 OUT", "07:59 5961 OUT", "07:59 0148 IN", "18:59 0000 IN", "19:09 0148 OUT", "22:59 5961 IN", "23:00 5961 OUT"}; 
		
		   HashMap<String,Integer> map = new HashMap<>();
		   TreeMap<String,Integer> tree = new TreeMap<>();
			
		    for(String s : records) {
				
				String []temp = s.split(" ");
				int time = timeChange(temp[0]);
				String num = temp[1];
				String action = temp[2];
				
				if(action.equals("IN")) {
					if(!tree.containsKey(num)) tree.put(num, 0);
					map.put(num, time);
				}
				else {
					
					tree.put(num, tree.get(num) + (time - map.get(num)));
					map.remove(num);
				}
			}
				
			if(!map.isEmpty()) {
				for(String key : map.keySet()) {
					tree.put(key, tree.get(key) + (23*60+59) - map.get(key));
					
				}
			}
			
			ArrayList<Integer>answerList = new ArrayList<>();
			
			for(String key : tree.keySet()) {
				
				double time = tree.get(key);
				
				if(time<=fees[0]) {
					answerList.add(fees[1]);
		        }else {
					time = time - fees[0];
					double cal = time/fees[2];
					int extraTime = (int) Math.ceil(cal);
					int fee = (extraTime * fees[3]) + fees[1];
					answerList.add(fee);			
				}
			}
				
			int[]answer = new int[answerList.size()];
			for(int i=0;i<answerList.size();i++)answer[i] = answerList.get(i);
			
			for(int i : answer )System.out.println(i);
				
			}
			static int timeChange(String str) {
				
				String[]temp = str.split(":");
				
				int hour = Integer.parseInt(temp[0]) * 60;
				int min = Integer.parseInt(temp[1]) + hour;
				
				return min;
				
				
			}
			
		}

