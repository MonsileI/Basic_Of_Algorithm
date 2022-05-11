package Today_22_05_10;

import java.util.LinkedList;
import java.util.Queue;

public class testCode {
	
	public static void main(String[] args) {
		
		String[]hansaem = {"SOOOX","OXXOX","OXOOX","OXOXX","EOOXX"};
		
		char[][] map = new char[hansaem.length][hansaem[0].length()];
		
		for(int i=0;i<hansaem.length;i++) {
			for(int j=0;j<hansaem[0].length();j++) {
				map[i][j] = hansaem[i].charAt(j);
			}
		}
		
		int[][] count = new int[map.length][map[0].length];
		
		
		int [] start = {};
		int [] end = {};
		
		int[][]move = {{0,1},{1,0},{-1,0},{-1,-0}};
		
		for(int i=0;i<map.length;i++) {
			for(int j=0;j<map[0].length;j++) {
				if(map[i][j]=='S') start = new int[]{i,j};
				if(map[i][j]=='E') end = new int[] {i,j};
			}
		}
		
		Queue<Position2> que = new LinkedList<>();
		
		que.add(new Position2(start[0],start[1]));
		
		count[start[0]][start[1]] = 0;
		
		int answer = -1;
		
		while(!que.isEmpty()) {
			
			Position2 current = que.poll();
			
			int currentCount = count[current.y][current.x];
			if(map[current.y][current.x]=='E') {
				
				answer = currentCount;
				
				break;
			}
			
			
			for(int i=0;i<4;i++) {
				
				Position2 p = new Position2(current.y+move[i][0],current.x+move[i][1]);
				
				if(p.y<0||p.x<0||map.length-1<p.y||map[0].length-1<p.x)continue;
				if(map[p.y][p.x]=='X') continue;
				
				count[p.y][p.x] = currentCount+1;
				que.add(p);
				
				
			}
			
			
		}
		
		
		System.out.println(answer);
		
	}

}

class Position2 {
	
	int x, y;
	
	public Position2(int x, int y) {
		this.x  = x;
		this.y = y;
		
	}
	
}
