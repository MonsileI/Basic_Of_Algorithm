package Today_22_05_31;

import java.util.ArrayList;

public class soosick {
	
	static char[]op = {'*','+','-'};
	static ArrayList<Character>opList = new ArrayList<>();
	static ArrayList<Long>numList = new ArrayList<>();
	static long answer = 0;

	public static void main(String[] args) {
		
		
		String expression = "100-200*300-500+20";
		
		check(expression);
		
		boolean[]visited = new boolean[3];
		
		dfs(new char[3],0,visited);
		
		System.out.println(answer);
		
	}
	static long change(long a,long b,char ch) {
		if(ch=='+')return a+b;
		else if(ch=='-')return a-b;
		else if(ch=='*')return a*b;
		return 0;
	}
	static void dfs(char[]p,int num,boolean[]visited) {
		
		if(num==3) {
			
			ArrayList<Long> numArr = new ArrayList<>(numList);
			ArrayList<Character> opArr = new ArrayList<>(opList);
			
			for(int i=0;i<p.length;i++) {
				for(int j=0;j<opArr.size();j++) {
					if(p[i]==opArr.get(j)) {
						long a = change(numArr.remove(j),numArr.remove(j),opArr.remove(j));
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
				p[i] = op[num];
				dfs(p,num+1,visited);
				visited[i] = false;
			}
			
		}
	}
	
	static void check(String expression) {
		
		String num = "";
		
		for(int i=0;i<expression.length();i++) {
			
			char ch = expression.charAt(i);
			
			if(ch>='0' && ch<='9') num += ch;
			else {
				numList.add(Long.parseLong(num));
				num="";
				opList.add(ch);
			}
			
		}
		
		numList.add(Long.parseLong(num));
	
	}
}
