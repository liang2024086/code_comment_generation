package methodEmbedding.Magic_Trick.S.LYD1289;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class Asmall {

	public static void main(String[] args) throws Exception {
		BufferedReader br = null;
		FileWriter fw=null;
		String[] arr1 = null, arr2=null;
		int answer1, answer2;
	
		System.out.println("start");
			br = new BufferedReader(new FileReader("d:\\A-small-attempt2.in"));
			fw = new FileWriter("d:\\out.txt");	
			int gameNumber = Integer.parseInt(br.readLine());

			for (int i = 0; i < gameNumber; i++) {
				int dupCount = 0;
				String result="";
				answer1 = Integer.parseInt(br.readLine());
				for (int j = 1; j <= 4; j++) {
					String str=br.readLine();
					if (answer1 == j)
						arr1 = str.split(" ");
				}
				answer2 = Integer.parseInt(br.readLine());
				for (int j = 1; j <= 4; j++) {
					String str=br.readLine();
					if (answer2 == j)
						arr2 = str.split(" ");
				}
				for(int k=0;k<4;k++){
					for(int q=0;q<4;q++){
						if(arr1[k].equals(arr2[q])){
							result=arr1[k];
							dupCount++;
						}
					}
				
				}
				if(dupCount==1){
					result="Case #"+(i+1)+": "+result+"\n";
				}
				else if(dupCount>1){
					result="Case #"+(i+1)+": Bad magician!\n";
				}
				else if(dupCount==0){
					result="Case #"+(i+1)+": Volunteer cheated!\n";
				}
				System.out.println(result);
				fw.write(result);
			}

			fw.close();
			br.close();
	}
}
