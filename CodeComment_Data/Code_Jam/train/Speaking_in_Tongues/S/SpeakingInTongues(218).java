package methodEmbedding.Speaking_in_Tongues.S.LYD1633;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.HashMap;

public class SpeakingInTongues {
	

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		
		/* Input File */
		BufferedReader reader = new BufferedReader(new FileReader("G:/projects/CodeJam12/src/A/in.txt"));
		//BufferedReader reader = new BufferedReader(new FileReader("G:/projects/CodeJam12/src/A/in.in"));
		
		/* Output File */
		PrintWriter writer = new PrintWriter(new FileWriter("G:/projects/CodeJam12/src/A/out.txt"));

		/* Building language translation base */
		String givenIp = "zy qee ejp mysljylc kd kxveddknmc re jsicpdrysi rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd de kr kd eoya kw aej tysr re ujdr lkgc jv";
		String givenOp = "qa zoo our language is impossible to understand there are twenty six factorial possibilities so it is okay if you want to just give up";
		
		HashMap<Character, Character> charMap = new HashMap<Character, Character>();
		
		for(int i=0; i<givenIp.length();i++){
	
			char ip = givenIp.charAt(i);
			char op = givenOp.charAt(i);

			Character objIp = new Character(ip);
			Character objOp = new Character(op);
			
			System.out.println("IP->OP : "+ip+"->"+op);
			if ( charMap.containsKey(objIp) ){
				System.out.println("Entry exists IP->OP : "+objIp+"->"+charMap.get(objIp) );
				continue;
			}
			charMap.put(objIp,objOp);
			System.out.println("Added IP->OP : "+objIp+"->"+objOp);
		}
		
		System.out.println("Map Size : "+charMap.size());
		
		/* Getting number of test cases */
		int noOfTestCases = Integer.parseInt(reader.readLine());
		System.out.println("No of Test Cases : "+noOfTestCases);
		
		/* Iterating for every test case */
		for ( int i=1; i <= noOfTestCases;i++){

			/* Getting input test case line */
			String ipline = reader.readLine();
			System.out.println("\n\nTest Case "+i+" : "+ipline);

			/* translating... */
			StringBuffer opline = new StringBuffer();
			for ( int j=0; j < ipline.length(); j++){
				Character op = charMap.get(new Character(ipline.charAt(j)));
				opline.append(op);
			}
			
			/* print output */
			System.out.println("Case #"+i+": "+opline.toString());
			writer.println("Case #"+i+": "+opline.toString());
			
		}
	
		/* closing streams */
		System.out.println("Closing streams...");
		writer.close();
		reader.close();
		System.out.println("Streams closed.");
	
	}
}
