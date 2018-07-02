package methodEmbedding.Magic_Trick.S.LYD203;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;


public class Magic_trick {

	public static void main(String[] args)  
	{
		try 
		{
			
			BufferedReader bf = new BufferedReader(new FileReader("C:\\input.in")) ;
			BufferedWriter write = new BufferedWriter(new FileWriter("C:\\output.txt", true)) ;
			int testCase = Integer.parseInt( bf.readLine() );
			
			for(int i=0;i<testCase;i++)
			{
				HashSet<Integer> hs = new HashSet<Integer>() ;
				int[] nos = new int[4] ;
				for(int l=0;l<2;l++)
				{
					int row = Integer.parseInt( bf.readLine() );
					
					
					for(int j=0;j<4;j++)
					{
						
						
						
						if(j==(row-1))
						{
							String str = bf.readLine() ;
							Scanner s = new Scanner(str) ;
							
							if(l==0)
							{
								for(int k=0;k<4;k++)
								{
									hs.add(s.nextInt()) ;
								}
							}
							else if(l==1)
							{
								for(int k=0;k<4;k++)
									
								{
									
									nos[k] = s.nextInt() ;
								}
							}
								
						}
						else
						{
							bf.readLine() ;
						}
						
					}
					
					
					
					
					if(l==1)
					{
						int cnt = 0 ;
						int num = 0 ;
						for(int k=0;k<4;k++)
						{
							if(hs.contains(nos[k]))
							{
								num = nos[k] ;
								cnt++ ;
							}
						}
						
						if(cnt==1)
						{
							write.write("Case #"+(i+1)+": "+num+"\n");
							
							
						}
						else if(cnt==0)
						{
							write.write("Case #"+(i+1)+": Volunteer cheated!"+"\n");
						}
						else
						{
							write.write("Case #"+(i+1)+": Bad magician!"+"\n");
						}
					}
						
					
					
				}
				
				
			}
			
			write.close();bf.close();
			
			
		} 
		catch (FileNotFoundException e) 
		{
			
			e.printStackTrace();
			
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
