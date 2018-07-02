package methodEmbedding.Standing_Ovation.S.LYD821;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author Allegea
 */
public class StandingOvation {

    public static void main(String[] args) throws FileNotFoundException, IOException
    {


        //Scanner in = new Scanner(new File("A-small-practice.in"));
        //FileWriter archivo = new FileWriter("A-small-practice.out");

    	String fileName = "A-small-attempt0";
        Scanner in = new Scanner(new File(fileName + ".in"));
        //Scanner in = new Scanner(System.in);
        FileWriter archivo = new FileWriter(fileName + ".out");

        PrintWriter out = new PrintWriter(archivo);
        out.flush();

        int cases = in.nextInt();

        for(int c=1;c<=cases;c++)
        {
        	int n = Integer.parseInt(in.next());
        	char[] values = in.next().toCharArray();
        	int answer = 0;
        	int people = values[0] - '0';
        	for (int i = 1; i <= n; i++) {
        		int current = values[i] - '0';
        		int diff = 0;
        		if (i > people) {
        			diff = i - people;
        			answer += diff;
        		}
        		people += current + diff;
        	}
        	
        	System.out.println("Case #" + c + ": " + answer);
        	out.println("Case #" + c + ": " + answer);

        }



        out.close();

    }


}
