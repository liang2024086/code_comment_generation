package methodEmbedding.Magic_Trick.S.LYD1709;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br=null;
		BufferedWriter bw=null;
		
		File f=new File("d:/googlejam.txt");
		int result=-1;
		int flag=0;
		int location=-1;
		int index=0;
		if(!f.exists())
		{
			f.createNewFile();
		}
		
		int[][] map=new int[4][4];
		int[] compare=new int[4];
		int[] compare1=new int[4];
		
		br=new BufferedReader(new FileReader("d:/111.txt"));
		bw=new BufferedWriter(new FileWriter(f));
		int count=Integer.parseInt(br.readLine());									
		String row="";
		try {
			while((row=br.readLine())!=null)
			{
				index++;
				flag=0;
				int row1=Integer.parseInt(row);   //get the first row number
//				System.out.println("row number ="+row);

					for (int i = 0; i < 4; i++) {
						String temp=br.readLine();
						String[] info=temp.split(" ");
						
						for (int j = 0; j < 4; j++) {
							map[i][j]=Integer.parseInt(info[j]);
						}
						if(i==(row1-1))
						{
							for (int j1 = 0; j1 < 4; j1++) {
								compare[j1]=map[i][j1];
							}
						}
					}
					
					int row2=Integer.parseInt(br.readLine());
					for (int i = 0; i < 4; i++) {
						String temp=br.readLine();
						String[] info=temp.split(" ");
						
						for (int j = 0; j < 4; j++) {
							map[i][j]=Integer.parseInt(info[j]);
						}
						if(i==(row2-1))
						{
							for (int j1 = 0; j1 < 4; j1++) {
								compare1[j1]=map[i][j1];
							}
						}
					}
					
					for (int i = 0; i < 4; i++) {
						for (int j = 0; j < 4; j++) {
							if(compare[i]==compare1[j])
							{
								
								flag++;
								location=i;
							}
						}
					}
					//1 means cheat  
					//2 means right  and point out location
					//3 means bad
					if(flag==0)
						result=1;
					else if(flag==1)
						result=2;
					else if(flag>1)
						result=3;					

				/*
					for (int i = 0; i < 4; i++) 
					{
						System.out.print("compare="+compare[i]+" ");
						System.out.print("compare1="+compare1[i]+" ");
					}
					System.out.println("************");	
				 
				 */
					
				/*	
					for (int i = 0; i < 4; i++) {
						for (int j = 0; j < 4; j++) {
							System.out.print(map[i][j]+" ");
						}
						System.out.println();
					}
				 */
					//Case #20:
					if(result==1)
					{
						bw.write("Case #"+index+": Volunteer cheated!");
						bw.newLine();
						System.out.println("the anser is Volunteer cheated!");
					}
					else if(result==2)
					{
						bw.write("Case #"+index+": "+new Integer(compare[location]).toString());
						bw.newLine();
						System.out.println("the anser is "+compare[location]);
					}
					else if(result>1)
					{
						bw.write("Case #"+index+": Bad magician!");
						bw.newLine();
						System.out.println("the anser is Bad magician!");
					}
					
					
				
			}



			
		} catch (Exception e) {
			e.printStackTrace();
		}finally
		{
			br.close();
			bw.close();
		}
	}
}
