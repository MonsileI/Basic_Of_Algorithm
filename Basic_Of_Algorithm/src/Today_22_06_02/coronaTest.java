package Today_22_06_02;

public class coronaTest {
	
	public static void main(String[] args) {
		
		String[][]places = {{"POOOP", "OXXOX", "OPXPX", "OOXOX", "POXXP"}, {"POOPX", "OXPXP", "PXXXO", "OXXXO", "OOOPP"}, {"PXOPX", "OXOXP", "OXPOX", "OXXOP", "PXPOX"}, {"OOOXX", "XOOOX", "OOOXX", "OXOOX", "OOOOO"}, {"PXPXP", "XPXPX", "PXPXP", "XPXPX", "PXPXP"}};
		int []result = new int[places.length];
	
		for(int i=0;i<places.length;i++) {
			
			char[][]map = new char[places[0].length][places[0][0].length()];
			
			for(int j=0;j<places[i].length;j++) {
				for(int k=0;k<places[j].length;k++) {
					map[j][k] = places[i][j].charAt(k);
				}
			}
			
			result[i] = check(map);
		}
		
		for(int i : result)System.out.println(i);
		
		
	}
	
	static boolean isRight(char[][]map,int i,int j) {
		
		//상하좌우
		int [][] move1 = {{-1,0},{1,0},{-1,0},{0,1}};
		
		for(int d=0;d<4;d++) {
			int newI = i + move1[d][0];
			int newJ = j + move1[d][1];
			
			if(newI<0||newJ<0||map.length-1<newI||map[0].length-1<newJ) continue;
			
			if(map[newI][newJ]=='P') return false;
			
		}
		//대각선
		int [][] move2 = {{1,1},{-1,1},{1,-1},{-1,-1}};
		
		for(int d=0;d<4;d++) {
			int newI = i + move2[d][0];
			int newJ = j + move2[d][1];
			
			if(newI<0||newJ<0||map.length-1<newI||map[0].length-1<newJ) continue;
			
			if(map[newI][newJ]=='P') {
				if(!(map[newI][j]=='X' && map[i][newJ]=='X')) return false;
			}
		}
		//맨해튼
		int [][] move3 = {{-2,0},{2,0},{0,-2},{0,2}};
		
		for(int d=0;d<4;d++) {
			int newI = i + move3[d][0];
			int newJ = j + move3[d][1];
			
			if(newI<0||newJ<0||map.length-1<newI||map[0].length-1<newJ) continue;
			if(map[newI][newJ]=='P') {
				if(map[(newI+i)/2][(newJ+j)/2]!='X') return false;
			}
		}
		
		return true;
	}
	
	static int check(char[][]map) {
		
		for(int i=0;i<map.length;i++) {
			for(int j=0;j<map[0].length;j++) {
				if(map[i][j]=='P') {
					if(!isRight(map,i,j)) {
						return 0;
					}
				}
			}
		}
		
		
		
		return 1;
		
		
	}

}
