package methodEmbedding.Magic_Trick.S.LYD721;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;

public class A_small {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new FileReader("D:\\GCJ\\A-small-attempt1.in"));
		String test_cases_s = in.readLine();
		int test_cases = Integer.parseInt(test_cases_s);
		for(int i=0;i<test_cases;i++){
			//first input
			String rowNo1S = in.readLine();
			int rowNo1 = Integer.parseInt(rowNo1S);
			String row1 = null;
			for(int x=1;x<5;x++){
				if(x==rowNo1){
					row1 = in.readLine();
				}else{
					in.readLine();
				}
			}
			String[] row1_arr = row1.split(" ");
			HashSet<String> row1_HS = new HashSet<>(Arrays.asList(row1_arr));
			//second input
			String rowNo2S = in.readLine();
			int rowNo2 = Integer.parseInt(rowNo2S);
			String row2 = null;
			for(int x=1;x<5;x++){
				if(x==rowNo2){
					row2 = in.readLine();
				}else{
					in.readLine();
				}
			}
			String[] row2_arr = row2.split(" ");
			HashSet<String> row2_HS = new HashSet<>(Arrays.asList(row2_arr));
			
			row1_HS.retainAll(row2_HS);
			if(row1_HS.size()==1){
				System.out.println("Case #"+(i+1)+": "+row1_HS.iterator().next());
			}else if(row1_HS.size()==0){
				System.out.println("Case #"+(i+1)+": Volunteer cheated!");
			}else{
				System.out.println("Case #"+(i+1)+": Bad magician!");				
			}
			
		}
		
		
		
		
		in.close();
	}
	
}
