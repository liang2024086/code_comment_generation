package methodEmbedding.Magic_Trick.S.LYD130;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class MagicTrick  {

	public static void main(String s[]) throws Exception{
		
		
		int testCase; // Number of test cases
		String filename;
		int ans_1, ans_2;//answer of the volunteer
		int i,j,count = 0, number = 0;
		int[] st_2_arr = new int[4];
		StringTokenizer st_1 = null, st_2 = null; // stores the integer value consisted in each line
		
		filename = "E://input.txt";
		
		
		FileReader fr= new FileReader(filename);
		BufferedReader br = new BufferedReader(fr);
		FileWriter fwr = new FileWriter("E://output.txt");
		PrintWriter pwr = new PrintWriter(fwr);
			
		testCase = Integer.parseInt(br.readLine());
		//System.out.println(testCase);
			
			//Check for number of test cases
			if(testCase <= 100){
				
			for(int k=1;k<=testCase;k++){
				ans_1 = Integer.parseInt(br.readLine());
				
				for(i=1;i<=4;i++){
					
					if(ans_1 == i){	
						st_1 = new StringTokenizer(br.readLine());
					}else{
						br.readLine();
					}
				}
				ans_2 = Integer.parseInt(br.readLine());
				for(i=1;i<=4;i++){
					
					if(ans_2 == i){	
						st_2 = new StringTokenizer(br.readLine());
					}else{
						br.readLine();
					}
				}
				
				for(int l=0;l<4;l++){
					st_2_arr[l] = Integer.parseInt((String) st_2.nextElement());
				}
				
				for(i=0;i<4;i++){
					
					int temp_1 = Integer.parseInt((String) st_1.nextElement());
					
					for(j=0;j<4;j++){
						 
						if(st_2_arr[j] == temp_1){
							number = temp_1;
							count++;
							break;
						}
					}
				}
				
				if(count==1){
					pwr.println("Case #"+k+": "+number);
					System.out.println("Case #"+k+": "+number);
				}else if(count > 1){
					pwr.println("Case #"+k+": Bad magician!");
					System.out.println("Case #"+k+": Bad magician!");
				}else if(count == 0){
					pwr.println("Case #"+k+": Volunteer cheated!");
					System.out.println("Case #"+k+": Volunteer cheated!");
				}
				
				count = 0;
			}
		
			}
		
			fr.close();
			br.close();
			pwr.close();
			fwr.close();
	}
	
}
