package test;

import java.util.HashMap;
import java.util.ArrayList;

public class openChatting {
	
	public static void main(String[] args) {
		
		String[]record = {"Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"};
		
		HashMap<String,String> map = new HashMap<>();
		
		ArrayList<String> answerList = new ArrayList<>();
		
		for(String str : record) {
			
			String []temp = str.split(" ");
			
			String action = temp[0];
			String id = temp[1];
			if(action.equals("Leave"))continue;
			String nick = temp[2];
			
			map.put(id, nick);
			
		}
		
		
		for(String str : record) {
			
			String []temp = str.split(" ");
			
			String action = temp[0];
			String id = temp[1];
			if(action.contains("Change"))continue;
			String nick = map.get(id);
			
			String ans = nick+"님이 " + (action.equals("Enter") ? "들어왔습니다." : "나갔습니다."); 
			
			answerList.add(ans);
		}
		
		String[]answer = new String[answerList.size()];
		
		for(int i=0;i<answer.length;i++)answer[i] = answerList.get(i);
		
		for(String str : answer) System.out.println(str);
		
	}

}
