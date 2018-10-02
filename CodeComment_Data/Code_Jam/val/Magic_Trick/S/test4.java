package methodEmbedding.Magic_Trick.S.LYD1109;

 
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class test4 {

	public static void main(String[] args) {
		 
		try (BufferedReader br = new BufferedReader(new FileReader("E:\\test3.txt")))
		{
 
			String sCurrentLine;
			String[] allLineString = new String[2000];
			int lineCount = 0;
			while ((sCurrentLine = br.readLine()) != null) {
					allLineString[lineCount] = sCurrentLine;
					lineCount++;
			}
//			for(int allTests = 0 ; allTests < Integer.parseInt(allLineString[0]) ; allTests++){
				int allTests = 0;
				int firstRow = 1;
				int secondRow = 6;
				for( firstRow = 1  ; firstRow < lineCount - 9 ; firstRow = firstRow + 10){
					
						int selectedRow1 = Integer.parseInt(allLineString[firstRow]);
						String firstSelectedString = allLineString[selectedRow1 + (allTests)*10 + 1];
						int selectedRow2 = Integer.parseInt(allLineString[secondRow]);
						String secondSelectedString = allLineString[selectedRow2 + (allTests)*10 + 6 ];
						
						allTests++;
						secondRow +=10;
//						System.out.println(firstSelectedString);
//						System.out.println(secondSelectedString);
						String[] dic1 = firstSelectedString.split("\\W+");
						int[] Item1 = new int[4];
						int[] Item2 = new int[4];
						for(int j = 0 ; j < 4 ; j++){
							Item1[j] = Integer.parseInt(dic1[j].toString());
							
						}
						String[] dic2 = secondSelectedString.split("\\W+");
						for(int j = 0 ; j < 4 ; j++){
							Item2[j] = Integer.parseInt(dic2[j].toString());
							
						}
						
						int trueCount = -1 ;
						int ansItem = 0;
						for(int k = 0 ; k<4 ; k++){
							for(int h = 0 ; h < 4 ; h++){
								if(Item1[k] == Item2[h]){
									ansItem = k;
									trueCount++;
								}
							}
						}
						
						String title = "Case #"+allTests+": ";
						if(trueCount > 0){
							System.out.println(title+"Bad magician!");
						}else if(trueCount == 0){
							System.out.println(title+Item1[ansItem]);
						}else 
							System.out.println(title+"Volunteer cheated!");
						
						
						
				}
//			}
 
		} catch (IOException e) {
			e.printStackTrace();
		} 
 
	}
}
