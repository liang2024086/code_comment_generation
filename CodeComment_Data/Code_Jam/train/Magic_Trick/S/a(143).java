package methodEmbedding.Magic_Trick.S.LYD533;

import java.io.*;
import java.util.*;
public class a {

	public static void main(String[] args) throws Exception {
        Scanner sc = null;
        PrintWriter pw = null;
        
        try {
            String inputFile = args[0];
            String outputFile = args[1];
            
            sc = new Scanner(new FileReader(inputFile));
            pw = new PrintWriter(new FileWriter(outputFile));
            
            int n = Integer.parseInt(sc.nextLine());
            for(int id = 1; id <= n; id++){
                int answer1 = Integer.parseInt(sc.nextLine());
                int count = 0;
                String row = "";
                while(count < answer1) {
                    row = sc.nextLine();
                    count++;
                }
                
                while(count < 4) {
                    sc.nextLine();
                    count++;
                }
                
                String[] cards1 = row.trim().split(" ");
                
                int answer2 = Integer.parseInt(sc.nextLine());
                
                count = 0;
                
                while(count < answer2) {
                    row = sc.nextLine();
                    count++;
                }
                
                while(count < 4) {
                    sc.nextLine();
                    count++;
                }
                
                String[] cards2 = row.trim().split(" ");
                
                int matchCount = 0;
                String cardVal = "";
                
                for(String card1 : cards1) {
                    for(String card2 : cards2) {
                        if(card1.equals(card2)) {
                            matchCount++;
                            cardVal = card1;
                        }
                    }
                }
                
                pw.print("Case #" + id + ": ");
                
                if(matchCount == 0) {
                    pw.print("Volunteer cheated!");
                }
                else if(matchCount == 1) {
                    pw.print(cardVal);
                }
                else {
                    pw.print("Bad magician!");
                }
                
                pw.println();
            }
            
            
		}		
		catch (Exception e) {
			System.out.println("Invalid Arguments!");
		}
        finally {
            if (pw != null) { 
                pw.flush();
                pw.close(); 
            } 
            if (sc != null) {
                sc.close();
            }
        } 
        
	}
}
