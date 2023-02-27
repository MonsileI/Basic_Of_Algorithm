package sw_java_im;

import java.util.Scanner;

public class no_2527 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		for(int i=0;i<4;i++) {
			
			int x1 = scan.nextInt();
			int y1 = scan.nextInt();
			int x2 = scan.nextInt();
			int y2 = scan.nextInt();
			int x3 = scan.nextInt();
			int y3 = scan.nextInt();
			int x4 = scan.nextInt();
			int y4 = scan.nextInt();
			
			//점
			if((x2 == x3 && y2 == y3) || (x1 == x4 && y1 == y4) 
			|| (x2 == x3 && y1 == y4) || (x1 == x4 && y2 == y3)) {
					System.out.println("c");
				//선분
			}else if((x2==x3 && y2 != y3) || (x1==x4 && y1 != y4) ||
					(x2==x3 && y1 != y4) || (x2!=x3 && y1 == y4)){
					System.out.println("b");
			//겹치지 않을 경구
			}else if(x2 < x3 || x4 < x1 || y2 < y3 || y4 < y1) System.out.println("d");
			
			else System.out.println("a");
			
			
			
		}
		
	}
	
}
