package methodEmbedding.Magic_Trick.S.LYD481;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class A {

	public A() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(args[0]));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    try {
	        StringBuilder sb = new StringBuilder();
	        String line = br.readLine();
	        int num_case = 0;
	        int curr_case = 0;
	        if (line != null) {
	        	num_case = Integer.parseInt(line);
	        	curr_case = 1;
	        	line = br.readLine();
	        }


            int first_row, second_row;
            int[] prev_row = new int[4];
            int[] curr_row = new int[4];
	        while (line != null && curr_case <= num_case) {
	        	first_row = Integer.parseInt(line);
	        	for (int x = 1; x <= 4; x++) { //each row
	    			line = br.readLine();
	    			if (first_row == x) {
		    			Scanner temp_scan = new Scanner(line);
		    			for (int y = 0; y <4; y++) { 
		    				prev_row[y] = temp_scan.nextInt();
//		    				System.out.println(prev_row[y]);
		    			} 
	    			
	    			}
		    	}
	        	second_row = Integer.parseInt(br.readLine());
	        	for (int x = 1; x <= 4; x++) { //each row
	    			line = br.readLine();
	    			if (second_row == x) {
		    			Scanner temp_scan = new Scanner(line);
		    			for (int y = 0; y <4; y++) { 
		    				curr_row[y] = temp_scan.nextInt();
//		    				System.out.println(curr_row[y]);
		    			} 
	    			
	    			}
		    	}
	        	
	        	List<Integer> volunteer_picks = new ArrayList<Integer>();
				for (int i=0; i < 4; i++) {
					int prev = prev_row[i];
					for (int j=0; j < 4; j++) {
						int curr = curr_row[j];
						if (prev == curr) {
							volunteer_picks.add(prev);
							break;
						}
					}
				}
//				
				String res;
				if (volunteer_picks.size() == 0) res = "Volunteer cheated!";
				else if (volunteer_picks.size() == 1) res = volunteer_picks.get(0).toString();
				else res = "Bad magician!";
				System.out.println("Case #"+curr_case+": "+res);
				curr_case++;
				line = br.readLine();
	        } //end of while
	    } catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
	        try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    }
//		Scanner sc = null;
//		try {
//			sc = new Scanner(f);
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//
//		if (sc.hasNextLine()) {
//		    int num_case = sc.nextInt();
//		    for (int cas =1; cas <= num_case; cas++) {
//		    	int first_row = sc.nextInt();
//			    int[] prev_row = new int[4];
//				int[] curr_row = new int[4];
//		    	for (int x = 1; x <= 4; x++) { //each row
//	    			String line = sc.nextLine();
//	    			if (first_row == x) {
//		    			Scanner temp_scan = new Scanner(line);
//		    			for (int y = 0; y <4; y++) { 
//		    				prev_row[y] = temp_scan.nextInt();
//		    				System.out.println(prev_row[y]);
//		    			} 
//	    			
//	    			}
//		    	}
////		    	System.out.println("row"+first_row+": "+prev_row.toString());
//		    	
//		    	int second_row = sc.nextInt();
//		    	System.out.println("SECOND "+second_row);
//		    	for (int x = 1; x <= 4; x++) { //each row
//		    		if (second_row != x) sc.nextLine();
//		    		else {
//		    			String line = sc.nextLine();
//		    			Scanner temp_scan = new Scanner(line);
//		    			for (int y = 0; y <4; y++) 
//		    				curr_row[y] = temp_scan.nextInt();
//		    		}
//		    	}
//		    	System.out.println("row"+second_row+": "+curr_row.toString());
//
				
//		    }
//		}
//		sc.close();
		
		
		
	}

}
