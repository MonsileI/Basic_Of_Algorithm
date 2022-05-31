package Today_22_05_31;

import java.util.Queue;
import java.util.LinkedList;

public class groupPicture2_BFS {
	
	public static void main(String[] args) {
		
		String[][]places = {{"POOOP", "OXXOX", "OPXPX", "OOXOX", "POXXP"}, {"POOPX", "OXPXP", "PXXXO", "OXXXO", "OOOPP"}, {"PXOPX", "OXOXP", "OXPOX", "OXXOP", "PXPOX"}, {"OOOXX", "XOOOX", "OOOXX", "OXOOX", "OOOOO"}, {"PXPXP", "XPXPX", "PXPXP", "XPXPX", "PXPXP"}};
		int []result = new int[places.length];
	
		
		for(int i=0;i<places.length;i++) {
			
			String[]temp = places[i];
			
			result[i] = map(temp);
			
		}
		
		for(int i : result)System.out.println(i);
		
	}
	
	static boolean check(int i, int j,String[]map) {
		
		
		//그냥 상하좌우
		
		int[][]move1 = {{0,1},{1,0},{0,-1},{-1,0}};
		
		for(int d= 0 ; d < 4 ; d++) {
			
			int newI = i + move1[d][0];			
			int newJ = j + move1[d][1];
			
			if(newI<0||newJ<0||map.length-1<newI||map[0].length()-1<newJ)continue;
			
			if(map[newI].charAt(newJ)=='P') return false;
			
		}
		
		//대각선
		
		int[][]move2 = {{1,1},{-1,-1},{1,-1},{-1,1}};
		
		for(int d= 0 ; d < 4 ; d++) {
			
			int newI = i + move2[d][0];			
			int newJ = j + move2[d][1];
			
			if(newI<0||newJ<0||map.length-1<newI||map[0].length()-1<newJ)continue;
			
			if(map[newI].charAt(newJ)=='P') {
				if(!((map[newI].charAt(j)=='X')&&(map[i].charAt(newJ)=='X'))) return false;
			}
			
		}
		
		//맨해튼 거리
		int[][]move3 = {{2,0},{0,2},{-2,0},{0,-2}};
		
		for(int d= 0 ; d < 4 ; d++) {
			
			int newI = i + move3[d][0];			
			int newJ = j + move3[d][1];
			
			if(newI<0||newJ<0||map.length-1<newI||map[0].length()-1<newJ)continue;
			
			if(map[newI].charAt(newJ)=='P') {
				if(!(map[(newI+i)/2].charAt((newJ+j)/2)=='X'))return false;
			}
			
		}
		
		
		
		return true;
		
		
	}
	
	static int map(String[]map) {
		
		for(int i=0;i<map.length;i++) {
			for(int j=0;j<map[0].length();j++) {
				if(map[i].charAt(j)=='P') {
					if(!check(i,j,map)) {
						return 0;
					};
				}
			}
		}
			
		return 1;
	
		
	}
}
