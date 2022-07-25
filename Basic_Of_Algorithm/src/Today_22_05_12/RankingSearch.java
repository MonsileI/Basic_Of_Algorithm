package Today_22_05_12;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.Collections;

public class RankingSearch {

	static HashMap<String,ArrayList<Integer>> map = new HashMap<>();
	
	
	public static void main(String[] args) {
		
		
		String [] info = {"java backend junior pizza 150","python frontend senior chicken 210","python frontend senior chicken 150","cpp backend senior pizza 260","java backend junior chicken 80","python backend senior chicken 50"};
		
		String [] query = {"java and backend and junior and pizza 100","python and frontend and senior and chicken 200","cpp and - and senior and pizza 250","- and backend and senior and - 150","- and - and - and chicken 100","- and - and - and - 150"};
		
		int[]result = new int[query.length];
		
		
		for(int i=0;i<info.length;i++) {
		
			String[]temp = info[i].split(" ");
			dfs(temp,0,"");
			
		}
		for(String key : map.keySet()) {
			Collections.sort(map.get(key));
		}
		
		for(int i=0;i<query.length;i++) {
			
			query[i] = query[i].replaceAll(" and ", "");
			
			String [] temp = query[i].split(" ");
			
			result[i] = map.containsKey(temp[0]) ? binarySearch(temp[0],temp[1]) : 0;  
		}
		
		for(int i : result)System.out.println(i);
		
	}
	
	static int binarySearch(String key,String value) {
		
		int score = Integer.parseInt(value);
		
		ArrayList<Integer> list = map.get(key);
		
		int start = 0;
		
		int end = list.size()-1;
		
		
		while(start<=end) {
			
			int mid = (start+end)/2;
			
			if(score<=list.get(mid)) end = mid-1;
			else if(score>list.get(mid)) start = mid+1;
			
			
		}
		
		return list.size()-start;
		
		
	}
	
	static void dfs(String[]temp,int count,String now) {
		
		
		if(count==4) {
			if(!map.containsKey(now)) {
				map.put(now, new ArrayList<>());
			}
			map.get(now).add(Integer.parseInt(temp[4]));
			return;
		}
		
		dfs(temp,count+1,now+"-");
		dfs(temp,count+1,now+temp[count]);
		
	}
}
