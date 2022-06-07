package programmers_level_2;

import java.util.ArrayList;
import java.util.Collections;

public class no_11 {
	
	public static void main(String[] args) {
		
		
		String m = "CC#BCC#BCC#BCC#B";
		String[]musicinfos = {"03:00,03:30,FOO,CC#B", "04:00,04:08,BAR,CC#BCC#BCC#B"};
		String answer = "(None)";
		
		String []mel = {"C#","D#","E#","F#","G#","A#","B#"};
		String []melChange = {"c","d","e","f","g","a","b"};
		
		ArrayList<String>answerList = new ArrayList<>();
		
		for(int i=0;i<mel.length;i++) m = m.replaceAll(mel[i],melChange[i] );
		
		
		for(String str : musicinfos) {
			
			String[]temp = str.split(",");
			
			int time = change(temp[0],temp[1]);
			
			String title = temp[2];
			
			String melody = temp[3];
			
			String tempMel = "";
			
			for(int i=0;i<mel.length;i++) melody = melody.replaceAll(mel[i], melChange[i]);
			
			for(int i=0;i<time;i++) tempMel += melody.charAt(i%melody.length());	
			
			System.out.println(tempMel);
			
			if(tempMel.contains(m)) answerList.add(title+":"+time);
			
		}
		
		if(answerList.isEmpty()){
			System.out.println(answer);
		}else {
			Collections.sort(answerList,(o1,o2)->{
				
				String []a = o1.split(":");
				String []b = o2.split(":");
				
				int aa = Integer.parseInt(a[1]);
				int bb = Integer.parseInt(b[1]);
				
				if(aa>bb) return bb-aa;
				
				return 0;
			});
			
			
			String [] temp = answerList.get(0).split(":");
			answer = temp[0];
			
			System.out.println(answer);
		}
		
	
		
		
		
	}
	static int change(String start,String end) {
		
		String s[] = start.split(":");
		
		int hour = Integer.parseInt(s[0]);
		int StartMin = Integer.parseInt(s[1]) + hour*60;
		
		s = end.split(":");
		
		hour = Integer.parseInt(s[0]);
		int endMin = Integer.parseInt(s[1]) + hour*60;
		
		return endMin - StartMin;
		
		
		
	}

}
