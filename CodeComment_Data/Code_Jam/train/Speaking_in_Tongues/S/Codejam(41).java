package methodEmbedding.Speaking_in_Tongues.S.LYD1572;

/**
 * @(#)Codejam.java
 *
 * Codejam application
 *
 * @author 
 * @version 1.00 2012/4/14
 */
import java.util.Scanner;
import java.io.*;
public class Codejam {
    
    public static void main(String[] args) throws IOException {
    	Scanner scan = new Scanner(new File("D:\\Users\\hdincel-ug\\Desktop\\A-small-attempt0.in"));
    //	System.out.println(scan.nextLine());
    	int N = Integer.parseInt(scan.nextLine());
    	String sentence;
    	String result = "";
    	String classic = "abcdefghijklmnopqrstuvwxyz";

    	String newalph = "ynficwlbkuomxsevzpdrjgthaq";
 
    	
    	for ( int i = 0; i < N; i++)
    	{
    		result = "";
    		sentence = scan.nextLine();
    		for ( int  j = 0; j < sentence.length(); j++)
    		{
    			if( sentence.charAt(j) == ' ')
    				result += " ";
    			else
    				result += classic.charAt(newalph.indexOf(sentence.charAt(j)));
    				
    		}
    		System.out.println("Case #" + (i+1) + ": " + result);
    	}
    }
}
