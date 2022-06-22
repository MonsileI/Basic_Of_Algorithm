package test;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.Collections;

public class binarySearch {

	static HashMap<String,ArrayList<Integer>>infoMap = new HashMap<>();

	public static void main(String[] args) {
		
		String[]info = {"java backend junior pizza 150","python frontend senior chicken 210","python frontend senior chicken 150","cpp backend senior pizza 260","java backend junior chicken 80","python backend senior chicken 50"};
		String[]query = {"java and backend and junior and pizza 100","python and frontend and senior and chicken 200","cpp and - and senior and pizza 250","- and backend and senior and - 150","- and - and - and chicken 100","- and - and - and - 150"};
		
		int[]answer = new int[query.length];
		
		
		
		for(String str : info) {
			
			String[]temp = str.split(" ");
			dfs(temp,0,"");
			
		}
		
		for(int i=0;i<query.length;i++) {
			
			query[i] = query[i].replaceAll(" and ","");
			
			String[]temp = query[i].split(" ");
			
			answer[i] = infoMap.containsKey(temp[0]) ? binarySearch(temp) : 0;
		
		}
		
		for(int i : answer)System.out.println(i);
		
	}
	
	static int binarySearch(String[]temp) {
		
		ArrayList<Integer> list = new ArrayList<>(infoMap.get(temp[0]));
		
		Collections.sort(list);
		
		int start = 0;
		int end = list.size()-1;
		int score = Integer.parseInt(temp[1]);
		
		
		
		while(start<=end) {
			
			int mid = (start+end)/2;
			
			if(score>list.get(mid)) start = mid+1;
			else end = mid-1;
			
		}
		
		
		return list.size()-start;
	}
	
	static void dfs(String[]temp,int count,String now) {
		
		if(count==4) {
			if(!infoMap.containsKey(now)) {
				infoMap.put(now, new ArrayList<Integer>());
			}
			infoMap.get(now).add(Integer.parseInt(temp[4]));
			return;
		}
		
		dfs(temp,count+1,now+temp[count]);
		dfs(temp,count+1,now+"-");
		
		
		
	}
	
}
