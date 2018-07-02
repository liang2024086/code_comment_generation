package methodEmbedding.Standing_Ovation.S.LYD1527;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import static java.lang.System.out;

public class StandingOvation {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		Integer testCaseNumbers = null;		
		String shynessLevels = new String();		
		BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\vishal\\downloads\\A-small-attempt2.in"));		
        testCaseNumbers = Integer.parseInt(bufferedReader.readLine());
        String sCurrentLine;               
        for(int i=0;i<testCaseNumbers;i++){				
        	sCurrentLine = bufferedReader.readLine();
        	shynessLevels = sCurrentLine.substring(2);
        	int total=0,invitesRequired = 0,totalInvites = 0;
        	for(int j = 0;j<shynessLevels.length();j++){
        		if(total<j){
        			invitesRequired = j - total;
        			totalInvites += invitesRequired;
        			total += invitesRequired;
        		}
        		total += Character.getNumericValue(shynessLevels.charAt(j)); 
        	}
        	out.println("Case #"+(i+1)+": "+totalInvites);
		}
      }
}
