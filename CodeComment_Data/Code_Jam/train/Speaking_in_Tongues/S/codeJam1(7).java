package methodEmbedding.Speaking_in_Tongues.S.LYD83;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;


public class codeJam1 {

	/**
	 * @param args
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		//reader r = new reader("input.txt");
		
		String goog = "zy qeeejp mysljylc kd kxveddknmc re jsicpdrysi rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd de kr kd eoya kw aej tysr re ujdr lkgc jv";
		String eng =  "qa zooour language is impossible to understand there are twenty six factorial possibilities so it is okay if you want to just give up";
		dictionary dic = new dictionary(eng , goog);
		
		Scanner input = new Scanner(new File("input.txt"));
		String line = input.nextLine();
		//System.out.println(line);
		for( int i = 0 ; i < Integer.parseInt(line)  ;++i){
			System.out.print("Case #"); 
			System.out.print(i+1);
			System.out.print(": ");
			System.out.println( dic.translate(input.nextLine() ));
			
		}
		
		//System.out.println(dic.translate(goog));
		
	}

}
