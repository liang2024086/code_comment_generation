package methodEmbedding.Magic_Trick.S.LYD1360;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;

public class MajicTrick {

	public static void main(String args[]) {

		File fInput=null;
		BufferedReader brInput=null;
		int iT, iM1, iM2;
		HashSet<String> hsCard1;
		HashSet<String> hsCard2;
		
		try{
		fInput = new File("./testbed/input.txt");
		}catch(NullPointerException ex){
			System.out.println(" File Not Found: "+ ex.getMessage());
			ex.printStackTrace();
		}
		
		try {
			brInput = new BufferedReader(new FileReader(fInput));
		} catch (FileNotFoundException ex) {
			System.out.println(" Unable to read file: "+ ex.getMessage());
			ex.printStackTrace();
		}
		
		if (brInput == null ) return;
		
		try {
			iT = Integer.parseInt(brInput.readLine());
			
			int i=1, iSpace; 
			String sRow;
			while (i<=iT){

				iM1 = Integer.parseInt(brInput.readLine());
				hsCard1 = new HashSet<String>();
					for(int j=1; j<=4; j++){
						sRow = brInput.readLine();
						
						if(j==iM1) {
						String[] sICard = sRow.split(" ");						
						for(int k=0;k<4;k++)
							hsCard1.add(sICard[k]); }
					}
					
				iM2 = Integer.parseInt(brInput.readLine());
				hsCard2 = new HashSet<String>();
				for(int j=1; j<=4; j++){
					sRow = brInput.readLine();
					
					if(j==iM2) {
					String[] sICard = sRow.split(" ");						
					for(int k=0;k<4;k++)
						hsCard2.add(sICard[k]); }
				}
				
				hsCard1.retainAll(hsCard2);
				
				int value = hsCard1.size();
				
				if (value==1)
					System.out.println("Case #"+i+": " + hsCard1.iterator().next());
				else if (value>1)
					System.out.println("Case #"+i+": Bad magician!" );
				else 
					System.out.println("Case #"+i+": Volunteer cheated!" );
				
				i++;
					}
			
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
}
