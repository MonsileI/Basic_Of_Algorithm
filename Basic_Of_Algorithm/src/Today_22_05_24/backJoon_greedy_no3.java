package Today_22_05_24;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class backJoon_greedy_no3 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] input = br.readLine().split("");
        
        int i = 0;
        for(String checkA : input) {
            if(i == 0 && checkA.equals("U")) i++;
            if((i == 1 || i == 3) && checkA.equals("C")) i++;
            if(i == 2 && checkA.equals("P")) i++;
        }
        if(i==4) {
            System.out.println("I love UCPC");
        }else {
            System.out.println("I hate UCPC");
        }
		
	
	}
	

		
	
}
