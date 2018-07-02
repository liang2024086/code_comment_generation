package methodEmbedding.Magic_Trick.S.LYD530;

import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;

class Magic{

	public static void main(String args[]){
		try{

			File f = new File("A-small.in");
			File o = new File("A-small.out");
			PrintWriter p = new PrintWriter(o);
			Scanner s = new Scanner(new FileReader(f));
			int t = s.nextInt(), cas=1;

			while(cas<=t){
				int row1 = s.nextInt();
				
				int b1[][] = new int[4][4];
				int rowF[] = new int[4];

				for(int i=0; i<4; i++){
					for(int j=0; j<4; j++){
						b1[i][j] = s.nextInt();
						if(i+1==row1)
							rowF[j] = b1[i][j];
					}
				}
				
				int row2 = s.nextInt();
				int b2[][] = new int[4][4];
				int rowS[] = new int[4];
				for(int i=0; i<4; i++){
					for(int j=0; j<4; j++){
						b2[i][j] = s.nextInt();
						if(i+1==row2)
							rowS[j] = b2[i][j];
					}
				}
				int theNum=0, count=0;
				boolean flag=false, present[] = new boolean[4];
				count = 0;
				for(int i=0; i<4; i++){
						for(int j=0; j<4; j++){
							if(rowF[i] == rowS[j]){
								present[i] = true;
								theNum = rowF[i];
								
							}							
						}
				}
					
				
				for(int i=0; i<4; i++)
					if(present[i])
						count++;
						
				if(count == 1)
					p.write("Case #"+cas+": "+theNum+"\n");
				else
				if(count > 1)
					p.write("Case #"+cas+": Bad magician!\n");
				else
				if(count==0)
					p.write("Case #"+cas+": Volunteer cheated!\n");
				cas++;

			}
			p.close();
		}
		catch(Exception e){

		}
	}
}
