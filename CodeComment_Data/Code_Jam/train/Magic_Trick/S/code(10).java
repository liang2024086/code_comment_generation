package methodEmbedding.Magic_Trick.S.LYD1149;

import java.util.*;
import java.io.*;

public class HelloWorld{

    public static void main(String[] args){

        try (Scanner scanner = new Scanner(new File("input.txt"))) {
            while (scanner.hasNextLine()) {
                int numTests = Integer.parseInt(scanner.nextLine());
                
                int currentTest = 1;
          
                while (currentTest <= numTests) {
                    
                    int initialRow = Integer.parseInt(scanner.nextLine());
                    String row = new String();
                    
                    for (int i = 1; i <= 4; i++) {
                        if (initialRow == i) {
                            row = scanner.nextLine();
                        } else {
                            scanner.nextLine();
                        }
                        
                    }
                    
                    Scanner rowScanner = new Scanner(row);
                    rowScanner.useDelimiter(" ");
                    
                    Integer[] selectedCards = new Integer[4];
                    selectedCards[0] = Integer.parseInt(rowScanner.next());
                    selectedCards[1] = Integer.parseInt(rowScanner.next());
                    selectedCards[2] = Integer.parseInt(rowScanner.next());
                    selectedCards[3] = Integer.parseInt(rowScanner.next());
                    
                    int rearrangedRow = Integer.parseInt(scanner.nextLine());
                    
                    row = new String();
                    
                    for (int i = 1; i <= 4; i++) {
                        if (rearrangedRow == i) {
                            row = scanner.nextLine();
                        } else {
                            scanner.nextLine();
                        }
                        
                    }
                    Scanner newRowScanner = new Scanner(row);
                    newRowScanner.useDelimiter(" ");                    
                    
                    Integer[] moreSelectedCards = new Integer[4];
                    moreSelectedCards[0] = Integer.parseInt(newRowScanner.next());
                    moreSelectedCards[1] = Integer.parseInt(newRowScanner.next());
                    moreSelectedCards[2] = Integer.parseInt(newRowScanner.next());
                    moreSelectedCards[3] = Integer.parseInt(newRowScanner.next());
                    
                    List<Integer> both = new ArrayList<Integer>(8);
                    Collections.addAll(both, selectedCards);
                    Collections.addAll(both, moreSelectedCards);
                    Integer[] finalArray = both.toArray(new Integer[both.size()]);
                    
                    HashMap<Integer, Integer> numbers = new HashMap<Integer, Integer>();
                    int duplicates = 0;
                    
                    System.out.print("Case #" + currentTest + ": ");
                    int magicCard = 0;
                    
                    for (int i = 0; i < 8; i++) {
                        if (null == numbers.get(finalArray[i])) {
                            numbers.put(finalArray[i], 1);
                        } else {
                            magicCard = finalArray[i];
                            duplicates++;
                        }
                    }
                    
                    if (duplicates == 0) {
                        System.out.println("Volunteer cheated!");
                    } else if (duplicates == 1) {
                        System.out.println(magicCard);
                    } else if (duplicates > 1) {
                        System.out.println("Bad magician!");
                    }
                    
                    currentTest++;
                }
            }      
        } catch (Exception e) {
        
        }
    }
}
