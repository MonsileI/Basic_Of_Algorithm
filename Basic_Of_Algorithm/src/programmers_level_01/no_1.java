package programmers_level_01;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
public class no_1 {
	
	public static void main(String[] args) {
		
		String[]id_list = {"muzi", "frodo", "apeach", "neo"};
		String [] report = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
		int k = 2;
		
		//나를 신고한 사람 리스트를 뽑음
		//그 사이즈가 2 이상이면
		//나를 신고한 사람한테 +1
		
		int[]result = new int[id_list.length];
		
		HashMap<String,Set<String>> singoList = new HashMap<>();
		//나를 신고한 사람 리스트
		HashMap<String,Integer> myList = new HashMap<>();
		//내가 받을 매일 횟수
		
		for(int i=0;i<id_list.length;i++) {
			singoList.put(id_list[i], new HashSet<>());
			myList.put(id_list[i], 0);
		}
		
		for(int i=0;i<report.length;i++) {
			String[]temp = report[i].split(" ");
			
			String attack = temp[0];
			String taker = temp[1];	
			singoList.get(taker).add(attack);
		
			
		}
		
		System.out.println(singoList);
		
		for(String key : singoList.keySet()) {
			
			if(singoList.get(key).size()>=k) {
				
				System.out.println(singoList.get(key));
				
				for(String str : singoList.get(key)) {
					
					myList.put(str, myList.get(str)+1);
					
					
				}
			}
			
		}
		
		for(int i=0;i<id_list.length;i++) {
			
			result[i] = myList.get(id_list[i]);
			
		}
		
		
		for(int i : result)System.out.println(i);
	}

}
