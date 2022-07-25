package Today_22_05_19;

import java.util.*;

public class soosick {

	static long answer = 0;
	static ArrayList<Long> numList = new ArrayList<>();
	static ArrayList<Character> opList = new ArrayList<>();
	static char [] op = {'+','-','*'};
	static boolean []visited = new boolean[3];
	
	public static void main(String[] args) {
		
		String expression = "100-200*300-500+20";
		
		String num = "";
		for(int i=0;i<expression.length();i++) {
			
			char ch = expression.charAt(i);
			
			if(ch>='0' && ch <= '9') {
				num += ch;
			}else {
				numList.add(Long.parseLong(num));
				num="";
				opList.add(ch);
			}
		}
		
		numList.add(Long.parseLong(num));
		
		dfs(new char[3],0);
		
		System.out.println(answer);
	}
	
	static Long change(char ch , long a, long b) {
		if(ch=='+') return a + b;
		else if(ch=='*') return a * b;
		else if(ch=='-') return a - b;
		else return (long)0;
	}
	
	static void dfs(char[]p,int count) {
		
		if(count==3) {
			 ArrayList<Long> numArr = new ArrayList<>(numList);
			 ArrayList<Character> opArr = new ArrayList<>(opList);
			
			 for(int i=0;i<p.length;i++) {
				 for(int j=0;j<opArr.size();j++) {
					 if(opArr.get(j)==p[i]) {
						 long a = change(opArr.remove(j),numArr.remove(j),numArr.remove(j));
						 numArr.add(j,a);
						 j--;
					 
					 }
				 }
			 }
			 
			 answer = Math.max(answer, Math.abs(numArr.get(0)));
			 
			 return;
			 
			 
		}
		
		
		
		
		for(int i=0;i<3;i++) {
			if(!visited[i]) {
				visited[i] = true;
				p[count] = op[i];
				dfs(p,count+1);
				visited[i] = false;
			}
			
		}
		
		
		
	}
}
