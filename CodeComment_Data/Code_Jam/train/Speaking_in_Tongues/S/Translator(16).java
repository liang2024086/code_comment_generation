package methodEmbedding.Speaking_in_Tongues.S.LYD824;

/**
 * Encoding:
 * a -> y
 * b -> h
 * c -> e
 * d -> s
 * e -> o
 * f -> c
 * g -> v
 * h -> x
 * i -> d
 * j -> u
 * k -> i
 * l -> g
 * m -> l
 * n -> b
 * o -> k
 * p -> r
 * q -> z
 * r -> t
 * s -> n
 * t -> w
 * u -> j
 * v -> p
 * w -> f
 * x -> m
 * y -> a
 * z -> q
 */
import java.util.*;
import java.io.*;

public class Translator {

	private static int numTest;
	private static FileReader input;
	private static PrintWriter output;
	
	// the character encoding
	private static String[] decoding = {"y", "h", "e", "s", "o", "c", "v", "x", "d", "u", "i", "g", "l", "b", "k", "r", "z", "t", "n", "w", "j", "p", "f", "m", "a", "q"};

	public static void main(String[] args) throws FileNotFoundException, IOException {
	
		// Initialization of Input/Output streams
		input = new FileReader(args[0]);
		output = new PrintWriter(new File("output"));
		
		// Reads char by char the input dimension
		String nString = "";
		while(true) {	
			
			char c = (char)input.read();		
			if(c == '\n') 
				break;	
			
			nString += c + "";
		
		}
		numTest = Integer.parseInt(nString);
		
		// Solves the problem
		for(int i = 1; i <= numTest; i++) {
			
			output.print("Case #" + i + ": ");
			
			int c = input.read();
			while(c != '\n' && c != -1) {
							
				output.print(c == ' ' ? " " : decoding[c % 'a']);		
				c = input.read();
				
			}
			
			output.println();
			
		}
	
		output.flush();
	
	}

}
