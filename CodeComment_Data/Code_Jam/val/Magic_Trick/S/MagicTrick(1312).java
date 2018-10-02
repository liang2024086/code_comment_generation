package methodEmbedding.Magic_Trick.S.LYD1237;

import java.io.File;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class MagicTrick {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
            Scanner scanner = new Scanner(new File("input/A-small-attempt0.in"));
            int numCases = scanner.nextInt();
            int current = 1;
            
            //long ticks = new Date().getTime();

            while(current <= numCases) {
                System.out.print("Case #" + current + ": ");
                
                // We only need the row the volunteer picked.
                
                // Zero base the choice for sanity.
                int firstChoice = scanner.nextInt() - 1;                
                Set<Integer> firstArrangement = new HashSet<Integer>();
                for(int i = 0; i < 16; i++) {
                	int card = scanner.nextInt();
                	if(i / 4 == firstChoice) {
                		firstArrangement.add(card);
                	}
                }
                
                // Zero base the choice for sanity.
                int secondChoice = scanner.nextInt() - 1;                
                Set<Integer> secondArrangement = new HashSet<Integer>();
                for(int i = 0; i < 16; i++) {
                	int card = scanner.nextInt();
                	if(i / 4 == secondChoice) {
                		secondArrangement.add(card);
                	}
                }
                
                // Length of intersection of the two rows tells us the answer.
                firstArrangement.retainAll(secondArrangement);
                
                if (firstArrangement.isEmpty()) {
                	System.out.println("Volunteer cheated!");
                } else if (firstArrangement.size() == 1) {
                	System.out.println(firstArrangement.iterator().next());
                } else {
                	System.out.println("Bad magician!");
                }
                current++;
            }
            
            //System.out.println("Time: " + ((new Date().getTime() - ticks) / 1000) + " seconds");
            scanner.close();
        } catch (Exception ex) {
            System.out.println("An error occurred: " + ex.getMessage());
            ex.printStackTrace();
        }

	}

}
