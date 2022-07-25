package Today_22_05_12;

import java.util.*;

public class rooms {

	static int answer = Integer.MAX_VALUE;
	
	public static void main(String[] args) {
		
		int[][] rooms = {{1,4},{3,5},{0,6},{5,7},{3,8},
						{5,9},{6,10},{8,11},{8,12},{2,13},
						{12,14}};
		
		
		
		Arrays.sort(rooms, new Comparator<int[]>() {
			public int compare(int[]o1,int[]o2) {
				
				if(o1[1]==o2[1]) {
					
					return o1[0] - o2[0];
				}
				return o1[1]-o2[1];
				
			}
		});
		
		for(int i=0;i<rooms.length;i++) {
			System.out.print(rooms[i][0]+",");
			System.out.println(rooms[i][1]);
		}
		int count = 0;
		int end_time = 0;
		
		for(int i=0;i<rooms.length;i++) {
			if(rooms[i][0]>=end_time) {
				end_time = rooms[i][1];
				count++;
				}
			}
		
		System.out.println(count);
	}
	
}
