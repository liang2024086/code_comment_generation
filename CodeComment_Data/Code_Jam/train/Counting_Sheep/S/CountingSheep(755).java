package methodEmbedding.Counting_Sheep.S.LYD1326;



import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class CountingSheep {

	
	public static void main(String[] args) throws Exception {
		FileInputStream is = new FileInputStream(new File(args[0]));	
		InputStreamReader isr = new InputStreamReader(is);		
		BufferedReader br = new BufferedReader(isr);		
		String line = br.readLine();
		int testCase = 1;
		while ( (line = br.readLine()) != null ) {
			
			Set<String> cache = new HashSet<String>();
			long n = Long.parseLong(line);
			long incN = Long.parseLong(line);
			
			if (incN == 0) {
				System.out.format("Case #%d: INSOMNIA\n", testCase);
			} else {
			
				for(;true;) {

					String nstr = String.valueOf(incN);
					for(int j = 0; j < nstr.length(); j++) {
						if(!cache.contains(nstr.charAt(j))) {
							cache.add(String.valueOf(nstr.charAt(j)));
						}						
					}
					
					if(cache.size() == 10) {
						break;
					}
					
					incN+=n;			
				}
				
				System.out.format("Case #%d: %s\n", testCase, String.valueOf(incN));
				
			}
			
			testCase++;
		}
		
		br.close();
	}
	
}
