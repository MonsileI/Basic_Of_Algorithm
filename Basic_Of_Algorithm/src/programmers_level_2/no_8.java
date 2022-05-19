package programmers_level_2;

import java.util.ArrayList;

public class no_8 {
	
	public static void main(String[] args) {
		
		
		String str1 = "FRANCE";
		String str2 = "french";
		
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();
		
		ArrayList<String> arr1 = new ArrayList<>();
		ArrayList<String> arr2 = new ArrayList<>();
		
		
		
		for(int i=0;i<str1.length()-1;i++) {
			
			char first = str1.charAt(i);
			char second = str1.charAt(i+1);
			
			if((first>='a'&&first<='z')&&(second>='a'&&second<='z')) {
				arr1.add(""+first+second);
			}
		}

		for(int i=0;i<str2.length()-1;i++) {
			
			char first = str2.charAt(i);
			char second = str2.charAt(i+1);
			
			if((first>='a'&&first<='z')&&(second>='a'&&second<='z')) {
				arr2.add(""+first+second);
			}
		}
		double son = 0;
		double mom = 0;
		
		mom = arr1.size() + arr2.size();
		
		System.out.println(mom);
		
		for(int i=0;i<arr1.size();i++) {
			String a = arr1.get(i);
			
			for(int j=0;j<arr2.size();j++) {
				String b = arr2.get(j);
				if(a.equals(b)) {
					son++;
					arr2.remove(j);
					break;
				}
			}
			
			
		}
		
		mom -= son;
		
		
		System.out.println(mom);
		System.out.println(son);
		
		double answer = 0;
		
		if(son==0 && mom==0) answer = 1;
		else if(son==0 && mom!=0) answer = 0;
		else answer = son/mom;
		
		
		answer *= 65536;
		
		int result = (int) answer;
		
		if(result==0) result = 65536;
		
		System.out.println(result);
		
		
		
	}

}
