package methodEmbedding.Magic_Trick.S.LYD1994;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class magicTrick {
	
	//testcase
	static int t;
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	
	public static void main (String[] args) {
		
		
		int first_pos =0;
		int second_pos =0 ;
		String[] firstArray = new String[4] ;
		String[] secondArray = new String[4] ;
		
		
		try {
//			System.out.println("Enter t");
			 t =  Integer.parseInt(br.readLine());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		for (int i=0; i<t; i++) {
			
			try {
				
				//first iteration extract a method if time
				String firstStr = br.readLine();
				
				first_pos = Integer.parseInt(firstStr);
				
				for (int j = 0; j < 4; j++) {
					
					String input = br.readLine();
					
					if(j+1 == first_pos){
						firstArray = input.split(" ");
					}
					
				}
				
				
				//second iteration extract a method if time
				String secondStr = br.readLine();
				
				second_pos = Integer.parseInt(secondStr);
				
				for (int j = 0; j < 4; j++) {
					
					String input = br.readLine();
					
					if(j+1 == second_pos){
						secondArray = input.split(" ");
					}
					
				}
				
				
				//do a bubble sort and find match
				
				int matchFound = 0;
				int magicNum = 0;
				
				for (String firstVal : firstArray) {
					
					int firstInt = Integer.parseInt(firstVal);
					
					for (String secondVal : secondArray) {
						
						int secondInt = Integer.parseInt(secondVal);
						
						if(firstInt == secondInt){
							magicNum = firstInt;
							matchFound++ ;
						}
						
					}
					
				}
				
				switch (matchFound) {
				case 0:
					System.out.println("Case #"+ (i+1) +": Volunteer cheated!");
					break;

				case 1:
					System.out.println("Case #"+ (i+1) +": " + magicNum);
					break;
					
					
					
				default:
					System.out.println("Case #"+ (i+1) +": Bad magician!");
					break;
				}
				
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
		
		
		
		
	}

}
