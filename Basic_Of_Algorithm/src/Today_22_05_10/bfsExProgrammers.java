package Today_22_05_10;

import java.util.LinkedList;
import java.util.Queue;

public class bfsExProgrammers {

	public static void main(String[] args) throws Exception {
		
		int[][]maps = {{1,0,1,1,1},{1,0,1,0,1},{1,0,1,1,1},{1,1,1,0,1},{0,0,0,0,1}};
		
		int answer = 0;
		int[][]move = {{1,0},{0,1},{-1,0},{0,-1}};
		Queue<Position> que = new LinkedList<>();
		int[][] count = new int[maps.length][maps[0].length];
		
		que.add(new Position(0,0));
		count[0][0] = 1;
		
		while(!que.isEmpty()) {
			
			Position cur = que.poll();
			
			int currentCount = count[cur.y][cur.x];
			
			for(int i=0;i<4;i++) {
				Position p = new Position(cur.x+move[i][1],cur.y+move[i][0]);
				
				if(p.x<0||p.y<0||maps[0].length-1<p.x||maps.length-1<p.y)continue;
				
				if(maps[p.y][p.x]==0)continue;
				
				count[p.y][p.x] = currentCount+1;
				maps[p.y][p.x] = 0;
				que.offer(p);
				
			}
			
			
		}
		
		
		
		
		
		
		answer = count[maps.length-1][maps[0].length-1];
		if(answer==0)System.out.println(-1);
		else System.out.println(answer);
		
		
	}
	
}

class Position{
	int x,y;
	
	public Position(int x,int y) {
		this.x = x;
		this.y = y;
	}
}