package methodEmbedding.Magic_Trick.S.LYD396;



import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.io.PrintStream;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/***/
public class MagicTrick {

	/***/
	public static void main(String[] args) {
		
		try{
			
			LineNumberReader reader=new LineNumberReader(new FileReader(new File(args[0]))); // Input File.
			PrintStream printer=new PrintStream(new File(args[1])); // Output File.
			
			int nTestCases=Integer.valueOf(reader.readLine()).intValue();
			for(int i=0;i!=nTestCases;i++){

				int caseId=i+1;
				Set<Integer> numbers=Collections.synchronizedSet(new HashSet<Integer>());
				Set<Integer> results=Collections.synchronizedSet(new HashSet<Integer>());
				
				// First Turn
				int firstRow=Integer.valueOf(reader.readLine()).intValue();
				for(int a=0;a!=4;a++){
					String[] r=reader.readLine().split(" ", 4);
					if(a==(firstRow-1))
					for(int b=0;b!=4;b++){
						Integer n=Integer.valueOf(r[b]);
						numbers.add(n);
					}
				}
				
				// Second Turn
				int secondRow=Integer.valueOf(reader.readLine()).intValue();
				for(int a=0;a!=4;a++){
					String[] r=reader.readLine().split(" ", 4);
					if(a==(secondRow-1)){
						for(int b=0;b!=4;b++){
							Integer n=Integer.valueOf(r[b]);
							if(numbers.contains(n))
								results.add(n);
						}
					}
				}
				
				// Test
				switch(results.size()){
				case 0:
					// System.out.println("Volunteer cheated!");
					printer.println("Case #"+caseId+": "+"Volunteer cheated!");
					break; 
				case 1:
					// System.out.println(results.iterator().next());
					printer.println("Case #"+caseId+": "+ results.iterator().next());
					break;
					
					default: 
						// System.out.println("Bad magician!"); 
						printer.println("Case #"+caseId+": "+"Bad magician!");
						break;
				}
			}			
			
			reader.close();
			printer.close();
			
		} catch (IOException e) {
			
			e.printStackTrace();
		} 
							
	}

}
