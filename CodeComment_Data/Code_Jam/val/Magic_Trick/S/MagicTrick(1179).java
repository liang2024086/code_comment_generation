package methodEmbedding.Magic_Trick.S.LYD1502;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;


public class MagicTrick {
	public static void main(String[] args) {
		try {
			Scanner scanner = new Scanner(new File("D:\\eclipse.workspace\\AlgorithmProject\\src\\A-small-attempt1.in"));
			BufferedWriter writer = new BufferedWriter(new FileWriter("D:\\eclipse.workspace\\AlgorithmProject\\src\\Test.out"));
				
			int	testCase = scanner.nextInt()*2;
			ArrayList<Integer> list = new ArrayList<Integer>();
			boolean first = true;
			int correctTime = 0;
			int priCase = 0;
			int correctOutput = 0;
			while(testCase--!=0)
			{
				int firstRow = scanner.nextInt()-1;				
				for(int i = 0; i<16; i++)
				{
					if(firstRow*4 == i)
					{
						if(first){
							list.add(scanner.nextInt());
							list.add(scanner.nextInt());
							list.add(scanner.nextInt());
							list.add(scanner.nextInt());							
							priCase++;
							first = false;							
						}
						else{
							for(int j=0; j<4; j++)
							{
//								System.out.println("list = "+list.get(j));
								int temp = scanner.nextInt();
								if(list.contains(temp))
								{
									correctOutput = temp;
									correctTime++;
								}
							}
							String priOutput = "Case #"+priCase+": ";
							if(correctTime == 0)
							{
								priOutput += "Volunteer cheated!";
							}
							else if (correctTime == 1 ){
								priOutput += correctOutput;
							}
							else
							{
								priOutput += "Bad magician!";
							}
							System.out.println(priOutput);
							writer.write(priOutput+"\r\n");
							correctTime = 0;
							list.clear();
							first = true;
						}
						i+=3;
					}
					if(i!=15)
					scanner.nextInt();
				}
			
				
				
				
			}
			writer.flush();
			writer.close();
			scanner.close();
		} catch (Exception e) {
			// TODO: handle exception
			
			System.out.println(e.getMessage());
		}
		
		
	}
}
