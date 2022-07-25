package Today_22_05_31;

import java.util.ArrayList;

public class lastWordLinked {

	public static void main(String[] args) {
		
		int n = 3;
		
		String [] words = {"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"};
		
		int []answer = new int[2];
		
		char last = words[0].charAt(words[0].length()-1);
		
		int person = 2;
		int round = 1;
		
		ArrayList<String>wordsList = new ArrayList<>();
		
		wordsList.add(words[0]);
		
		for(int i=1;i<words.length;i++) {
			
			char first = words[i].charAt(0);
			String now = words[i];
			
			if(first != last || wordsList.contains(now)) {
				answer[0] = person;
				answer[1] = round;
				break;
			}

			wordsList.add(now);
			
			last = words[i].charAt(words[i].length()-1);
			
			person++;
			
			if(person>n) {
				round++;
				person = 1;
			}
			
		}
		
		System.out.println(answer[0]+" : "+answer[1]);
		
		
	}
}
