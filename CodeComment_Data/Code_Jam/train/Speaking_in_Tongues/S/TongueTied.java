package methodEmbedding.Speaking_in_Tongues.S.LYD1548;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

public class TongueTied {
	public static Map <Character,Character>trans = new HashMap<Character,Character>();
		
	public static void main(String [] args) throws FileNotFoundException{
        File myFile = new File ("E:/A-small-attempt3.txt");
        Scanner inFile = new Scanner (myFile);
        PrintWriter outputStream = null;
        outputStream = new PrintWriter("E:/GoogleOut.txt");
        int NumCases,i,arrylength,j,k;
        String cases;
		trans.put('a','y');
		trans.put('b','h');
		trans.put('c','e');
		trans.put('d','s');
		trans.put('e','o');
		trans.put('f','c');
		trans.put('g','v');
		trans.put('h','x');
		trans.put('i','d');
		trans.put('j','u');
		trans.put('k','i');
		trans.put('l','g');
		trans.put('m','l');
		trans.put('n','b');
		trans.put('o','k');
		trans.put('p','r');
		trans.put('q','z');
		trans.put('r','t');
		trans.put('s','n');
		trans.put('t','w');
		trans.put('u','j');
		trans.put('v','p');
		trans.put('w','f');
		trans.put('x','m');
		trans.put('y','a');
		trans.put('z','q');
		trans.put(' ',' ');
		
        cases=inFile.nextLine();
        NumCases=Integer.parseInt(cases);
 
        for(i=1;i<NumCases+1;i++){
        String googlerese=inFile.nextLine();
        char [] arrychar=googlerese.toCharArray();
        String out = new String();
        for(char c : arrychar){
        	out += trans.get(c);
        }
        String printarry=out.toString();
        outputStream.println("Case #"+i+": "+printarry);
        }
		outputStream.flush();

		
	}

}
