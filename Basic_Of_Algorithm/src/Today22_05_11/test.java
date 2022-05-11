package Today22_05_11;

import java.util.*;

public class test {

	static HashMap<String,ArrayList<Integer>> infoMap = new HashMap<>();
	
	public static void main(String[] args) {
	
		
		String []info = {"java backend junior pizza 150","python frontend senior chicken 210","python frontend senior chicken 150","cpp backend senior pizza 260","java backend junior chicken 80","python backend senior chicken 50"};
		String [] query = {"java and backend and junior and pizza 100","python and frontend and senior and chicken 200","cpp and - and senior and pizza 250","- and backend and senior and - 150","- and - and - and chicken 100","- and - and - and - 150"};
		
		int[]result = new int[query.length];
		
		
		for(int i=0;i<info.length;i++) {
			String[]temp = info[i].split(" ");
			dfs(temp,"",0);
		}
		
		for(String key : infoMap.keySet()) {
			Collections.sort(infoMap.get(key));
		}
		
		for(int i=0;i<query.length;i++) {
			
			query[i] = query[i].replaceAll(" and ", "");
			String[]temp = query[i].split(" ");
			result[i] = infoMap.containsKey(temp[0]) ? binarySearch(temp[0],temp[1]) : 0;
			
		}
		
		for(int i : result)System.out.println(i);
		
		
	}
	static int binarySearch(String key, String value) {
		
		int score = Integer.parseInt(value);
		
		ArrayList<Integer> list = infoMap.get(key);
		
		int start = 0;
		int end = list.size()-1;
		
		while(start<=end) {
			
			int mid = (start+end)/2;
			
			if(score>list.get(mid)) start = mid+1;
			else if(score<=list.get(mid)) end = mid-1;
			
		}
		
		
		return list.size() - start;
		
	}
	
	static void dfs(String temp[],String now,int depth) {
		
		if(depth==4) {
			if(!infoMap.containsKey(now)) {
				infoMap.put(now, new ArrayList<>());
			}
			infoMap.get(now).add(Integer.parseInt(temp[4]));
			return;
		}
		
		
		dfs(temp,now+"-",depth+1);
		dfs(temp,now+temp[depth],depth+1);
		
		
	}

}