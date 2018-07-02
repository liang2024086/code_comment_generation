package methodEmbedding.Magic_Trick.S.LYD12;


import static java.util.stream.Collectors.toSet;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.IntStream;

import com.google.common.collect.Sets;

public class App {
    
    private static final String OUTPUT_FORMAT = "Case #%d: %s\n";
    
    public static void main(String[] args) throws IOException {
        
        try (BufferedWriter out = new BufferedWriter(new FileWriter("results-test.out"));
             Scanner scanner = new Scanner(App.class.getResourceAsStream("/small.in"))) {
//            Scanner scanner = new Scanner(App.class.getResourceAsStream("/large.in"))) {
            
            long nrOfCases = Integer.parseInt(scanner.nextLine().trim());
            for (long i = 0; i < nrOfCases; i++) {
            	
                // parse data            
            	Set<Integer> posiblePicks1 = Sets.newHashSetWithExpectedSize(4);
                int pickedRow1 = Integer.parseInt(scanner.nextLine().trim());
                IntStream.range(1,5).forEach(j -> {
                	String line = scanner.nextLine();
                	if (pickedRow1 == j) {
                		String[] lineValues = line.split("\\s+");                	
                		Arrays.stream(lineValues).forEach(strValue -> posiblePicks1.add(Integer.valueOf(strValue)));                		
                	}
                });
                Set<Integer> posiblePicks2 = Sets.newHashSetWithExpectedSize(4);
                int pickedRow2 = Integer.parseInt(scanner.nextLine().trim());
                IntStream.range(1,5).forEach(j -> {
                	String line = scanner.nextLine();
                	if (pickedRow2 == j) {
                		String[] lineValues = line.split("\\s+");                	
                		Arrays.stream(lineValues).forEach(strValue -> posiblePicks2.add(Integer.valueOf(strValue)));                		                		
                	}
                });
                Set<Integer> picks = posiblePicks1.stream()
                			 .filter(posiblePicks2::contains)
                			 .collect(toSet());
                String output;
                
                switch (picks.size()) {
	                case 0:
	                	output = String.format(OUTPUT_FORMAT, i + 1, "Volunteer cheated!");	
	                	break;
	                case 1:
	                	output = String.format(OUTPUT_FORMAT, i + 1, picks.iterator().next());	
	                	break;
					default:
						output = String.format(OUTPUT_FORMAT, i + 1, "Bad magician!");
				}                                
                out.write(output);
                System.out.print(output);               
            }            
            out.flush();
            out.close();
        } 
    }
}
