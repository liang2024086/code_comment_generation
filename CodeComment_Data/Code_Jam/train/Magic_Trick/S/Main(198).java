package methodEmbedding.Magic_Trick.S.LYD133;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) throws IOException {
        //Scanner in = new Scanner(System.in);
        Scanner in = new Scanner(new File("A-small-attempt1.in"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("small.out"));
		
        int T = in.nextInt();
        for (int t = 1; t <= T; t++) {
        	HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
        	
        	int row1 = in.nextInt();
            int[][] rec1 = new int[4][4];
        	for (int i = 0; i < 4; i++) {
        		for (int j = 0; j < 4; j++) {
        			rec1[i][j] = in.nextInt();
        			if (i + 1 == row1) {
        				if (hashMap.containsKey(rec1[i][j]) == true) {
        					hashMap.put(rec1[i][j], hashMap.get(rec1[i][j]) + 1);
        				}
        				else {
        					hashMap.put(rec1[i][j], 1);
        				}
        			}
        		}
        	}
        	
        	int row2 = in.nextInt();
            int[][] rec2 = new int[4][4];
        	for (int i = 0; i < 4; i++) {
        		for (int j = 0; j < 4; j++) {
        			rec2[i][j] = in.nextInt();
        			if (i + 1 == row2) {
        				if (hashMap.containsKey(rec2[i][j]) == true) {
        					hashMap.put(rec2[i][j], hashMap.get(rec2[i][j]) + 1);
        				}
        				else {
        					hashMap.put(rec2[i][j], 1);
        				}
        			}
        		}
        	}
        	
        	int count = 0;
        	int result = 0;
        	for (Integer key : hashMap.keySet()) {
        		if (hashMap.get(key) == 2) {
        			count++;
        			result = key;
        		}
        	}
        	
        	if (count == 0) {
        		bw.write("Case #" + t + ": Volunteer cheated!");
        	}
        	else if (count >= 2) {
        		bw.write("Case #" + t + ": Bad magician!");
        	}
        	else {
        		bw.write("Case #" + t + ": " + result);
        	}
        	bw.newLine();
        }
        
        in.close();
        bw.close();
    }
}
