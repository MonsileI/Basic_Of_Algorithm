package programmers_level_01;

public class no_6 {
	
	public static void main(String[] args) {
		
		int n = 5;
		
		int[]arr1 = {9,20,28,18,11};
		int[]arr2 = {30,1,21,17,28};
		
		String[]answer = new String[arr1.length];
		
		for(int i=0;i<answer.length;i++) {
			
			String temp = "";
			
			int a = arr1[i];
			int b = arr2[i];
			
			String str1 = Integer.toBinaryString(a);
			String str2 = Integer.toBinaryString(b);
			
			if(str1.length()<n) {
				while(str1.length()<n) {
					str1 = "0"+str1;
				}
			}
			if(str2.length()<n) {
				while(str2.length()<n) {
					str2 = "0"+str2;
				}
			}
			
			for(int j=0;j<str1.length();j++) {
				boolean flag = false;
				if(str1.charAt(j)=='1'||str2.charAt(j)=='1') {
					temp += "#";
					flag = true;
					continue;
				}
				if(!flag) temp += " ";
				
			}
			
			System.out.println(temp);
		}
		
		
	}

}
