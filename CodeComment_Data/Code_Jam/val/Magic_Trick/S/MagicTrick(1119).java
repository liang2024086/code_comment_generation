package methodEmbedding.Magic_Trick.S.LYD948;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * 
 */

/**
 * @author nikhilgahlot
 *
 */
public class MagicTrick {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		FileReader r = new FileReader("/Users/nikhilgahlot/Desktop/A-small-attempt1(1).in");

		BufferedReader reader = new BufferedReader(r);
		String line; 
		//System.out.println("behre");
		line=reader.readLine();
		//System.out.println("after");

		int total=Integer.valueOf(line);
		//System.out.println(total);
		
		for(int q=0; q<total; q++){
		
		String firstcolString=reader.readLine();
		int firstcol=Integer.valueOf(firstcolString);
		int[][] firstboard=new int[4][4];
		int[] firstcoltobecompared=new int[4];
		int[][] secondboard= new int[4][4];
		int[] seccoltobecompared=new int[4];
		line=reader.readLine();
		//System.out.println(line);

		for(int i=0; i<4; i++){
			String[] splited = line.split(" ");			

						firstboard[i][0]=Integer.valueOf(splited[i]);
		}
		line=reader.readLine();
		for(int i=0; i<4; i++){
			String[] splited = line.split("\\s+");			
			firstboard[i][1]=Integer.valueOf(splited[i]);
		}
		line=reader.readLine();
		for(int i=0; i<4; i++){
			String[] splited = line.split("\\s+");			

						firstboard[i][2]=Integer.valueOf(splited[i]);
		}
		line=reader.readLine();
		for(int i=0; i<4; i++){
			String[] splited = line.split("\\s+");			

						firstboard[i][3]=Integer.valueOf(splited[i]);
		}
		
		//SECOND 
		String seccolString=reader.readLine();
		int seccol=Integer.valueOf(seccolString);
		
		line=reader.readLine();
		//System.out.println(line);

		for(int i=0; i<4; i++){
			String[] splited = line.split(" ");			

						secondboard[i][0]=Integer.valueOf(splited[i]);
		}
		line=reader.readLine();
		for(int i=0; i<4; i++){
			String[] splited = line.split("\\s+");			
			secondboard[i][1]=Integer.valueOf(splited[i]);
		}
		line=reader.readLine();
		for(int i=0; i<4; i++){
			String[] splited = line.split("\\s+");			

			secondboard[i][2]=Integer.valueOf(splited[i]);
		}
		line=reader.readLine();
		for(int i=0; i<4; i++){
			String[] splited = line.split("\\s+");			

			secondboard[i][3]=Integer.valueOf(splited[i]);
		}
	//	System.out.println(firstcol);
	//	System.out.println(seccol);
		for( int i=0; i<4; i++){
			firstcoltobecompared[i]=firstboard[i][firstcol-1];
		}
		for( int i=0; i<4; i++){
			seccoltobecompared[i]=secondboard[i][seccol-1];
		}
		/*for(int i=0; i<4;i++){
			System.out.println(seccoltobecompared[i]);
		}
		for(int i=0; i<4;i++){
			System.out.println(firstcoltobecompared[i]);
		}*/
		int same=0;
		int number=0;
		for(int i=0; i<4; i++){
			for( int z=0; z<4; z++){
			if(seccoltobecompared[i]==firstcoltobecompared[z]){
				same++;
				//System.out.println(i);
				number=seccoltobecompared[i];
			}
			}
		}
		if(same==1){
			System.out.println("Case #" +(q+1) +": " +number);
		}
		else if(same==0){
			System.out.println("Case #" +(q+1) +": Volunteer cheated!");

		}
		else{
			System.out.println("Case #" +(q+1) +": Bad magician!");

		}
		}
	}

}
