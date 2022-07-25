package interestingAlgorithm;

import java.util.HashMap;
import java.util.ArrayList;

public class HashMapTest {

	public static void main(String[] args) {
		
		
		String [] record = {"Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"};
		String []answer;
		
		
		HashMap<String,String>user = new HashMap<>();
		
		
		for(String str : record) {
			
			String[]temp = str.split(" ");
			
			String action =temp[0];
			String id = temp[1];
			
			if(action.equals("Leave"))continue;
			
			user.put(id, temp[2]);
			
			
		}
		
		ArrayList<String>answerList = new ArrayList<>();
		
		for(String str : record) {
			
			String[]temp = str.split(" ");
			
			String action = temp[0];
			String id = temp[1];
			
			if(action.equals("Change"))continue;
			
			String nick = user.get(id);
			
			String ans = nick +"님이 " + (action.equals("Enter") ? "들어왔습니다." :  "나갔습니다.");
			
			answerList.add(ans);
			
			
		}
		
		
		answer = new String[answerList.size()];
		
		for(int i=0;i<answerList.size();i++) answer[i] = answerList.get(i);
		
		for(String str : answer) System.out.println(str);
		
		
		
	}
}
