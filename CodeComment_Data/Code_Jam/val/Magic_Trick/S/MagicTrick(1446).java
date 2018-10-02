package methodEmbedding.Magic_Trick.S.LYD1042;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class MagicTrick {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			BufferedReader reader = new BufferedReader(new FileReader("A-small-attempt1.in"));
			String line = null;
			line  = reader.readLine();
			int caseNum = Integer.parseInt(line);
			for(int i = 0;i< caseNum;i++){
				int hit = 0;
				int answer = -1;
				int A1 = Integer.parseInt(reader.readLine());
				String row1 = null;
				int[] row1Array = new int[17];
				for(int j = 1;j<=A1;j++){
					row1 = reader.readLine();
				}
				if(row1 != null){
					//System.out.println(row1);
					String[] temp = row1.split(" ");
					for(int j = 0;j<4;j++){
						int index = Integer.parseInt(temp[j]);
						row1Array[index] = 1;
					}
				}
				for(int j = A1+1;j<=4;j++){
					reader.readLine();
				}
				int A2 = Integer.parseInt(reader.readLine());
				String row2 = null;
				for(int j = 1;j<=A2;j++){
					row2 = reader.readLine();
				}
				if(row2 !=null){
					//System.out.println(row2);
					String[] temp = row2.split(" ");
					for(int j = 0;j<4;j++){
						int index = Integer.parseInt(temp[j]);
						if(row1Array[index] == 1){
							hit++;
							answer = index;
							//System.out.println(hit+"||"+answer);
						}
					}
				}
				System.out.print("Case #"+String.valueOf(i+1)+": ");
				if(hit == 0){
					System.out.println("Volunteer cheated!");
				}
				else if(hit == 1){
					System.out.println(answer);
				}
				else{
					System.out.println("Bad magician!");
				}
				for(int j = A2+1;j<=4;j++){
					reader.readLine();
				}
				
			}
			reader.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NumberFormatException e){
			e.printStackTrace();
		}
	}

}
