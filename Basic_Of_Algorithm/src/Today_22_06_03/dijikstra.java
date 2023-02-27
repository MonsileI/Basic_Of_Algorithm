package Today_22_06_03;

class graph{
	
	private int n ;
	private int maps[][];
	
	public graph(int n) {
		this.n = n;
		maps = new int[n+1][n+1];
	}
	public void input(int i,int j,int w) {
		maps[i][j] = w;
		maps[j][i] = w;
	}
	public void dijikstra(int v) {
		int distance[] = new int[n+1];
		boolean[]check = new boolean[n+1];
		
		for(int i = 1; i < n+1; i++) {
			distance[i] = Integer.MAX_VALUE;
		}
		distance[v] = 0;
		check[v] = true;
		
		for(int i = 1; i < n+1;i++) {
			if(!check[i] && maps[v][i] != 0) {
				distance[i] = maps[v][i];
			}
		}
		
		for(int a = 0 ; a < n-1; a++) {
			int min = Integer.MAX_VALUE;
			int min_idx = 1;
			
			for(int i=1;i<n+1;i++) {
				if(!check[i] && distance[i]!=Integer.MAX_VALUE) {
					if(distance[i] < min) {
						min = distance[i];
						min_idx = i;
					}
				}
			}
			check[min_idx] = true;
			for(int i = 1; i < n+1; i++) {
				if(!check[i] && maps[min_idx][i]!=0) {
					distance[i] = distance[min_idx]+maps[min_idx][i];
				}
			}
		}
		for(int i =1 ;i<n+1;i++) {
			System.out.print(distance[i]+" ");
		}
		System.out.println((" "));
	}
	
}

public class dijikstra {

	public static void main(String[] args) {
		
		graph g = new graph(8);
		
		g.input(1, 2, 3);
		g.input(1, 5, 4);
		g.input(1, 4, 4);
		g.input(2, 3, 2);
		g.input(3, 4, 1);
		g.input(4, 5, 2);
		g.input(5, 6, 4); 
		g.input(4, 7, 6);
		g.input(7, 6, 3);
		g.input(3, 8, 3);
		g.input(6, 8, 2);
		g.dijikstra(1);
	
		
	}
}
