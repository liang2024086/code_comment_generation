package methodEmbedding.Magic_Trick.S.LYD1468;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;


public class MagicTrick_Qual14_GCJ {
	public static void main(String[] args) {
		try{
			
			BufferedReader br = new BufferedReader(new FileReader("C:\\arvind\\Work\\Code\\Algorithms\\Algorithmz_Home\\IO Files\\A-small-attempt0.in"));
			BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\arvind\\Work\\Code\\Algorithms\\Algorithmz_Home\\IO Files\\A-small-attempt0.out"));
			int noOfInputs=Integer.parseInt(br.readLine());
			for( int test = 1;test <= noOfInputs; test++){
				int volunteerChoiceOne = Integer.parseInt(br.readLine());
				String selectedRowOne="";
				for(int x=1;x<=4;x++){
					String currLine=br.readLine();
					if(volunteerChoiceOne==x)
						selectedRowOne=currLine;					
				}
				int volunteerChoiceTwo = Integer.parseInt(br.readLine());
				String selectedRowTwo="";
				for(int x=1;x<=4;x++){
					String currLine=br.readLine();
					if(volunteerChoiceTwo==x)
						selectedRowTwo=currLine;					
				}
				String rowOne[]=selectedRowOne.split(" ");
				String rowTwo[]=selectedRowTwo.split(" ");
				int number=0;
				int count=0;
				for (int outer=0;outer<4;outer++){
					for(int inner=0;inner<4;inner++){
						if(rowOne[outer].equals(rowTwo[inner])){
							number=Integer.parseInt(rowOne[outer]);
							count++;
						}
					}
				}
				StringBuilder printThis=new StringBuilder("Case #"+(test)+":");
				printThis.append(" "+(count>1?"Bad Magician!":(count==1?number:"Volunteer Cheated!")));
				bw.write(printThis.toString());
				System.out.println(printThis.toString());
				if(test!=noOfInputs)
					bw.write("\n");
			}		
			bw.close();
		}catch(Exception e){
			e.printStackTrace();
		}

	}

}
