package methodEmbedding.Standing_Ovation.S.LYD1498;


import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class Test {
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 FileOutputStream out;
			try {
				out = new FileOutputStream("D:/test.txt");
				
				
				Scanner scanner=new Scanner(System.in);
				int n=scanner.nextInt();
				int i=0;
				for(i=0;i<n;i++)
				{
					int count=scanner.nextInt();
					
					int []level=new int[count];
					String s=scanner.next();
					
					for(int j=0;j<count;j++)
					{
						level[j]=(int)s.charAt(j)-48;
						//System.out.println(level[j]);
					}
					
					int sum=0;
					int re=0;
					for(int j=0;j<count;j++)
					{
					   sum=sum+level[j];
					   if(sum<j+1)
					   {sum++;
						   re++;
					   }
					}
					  PrintStream p=new PrintStream(out);
					  p.println("Case #"+(i+1)+": "+re);
				
					
				}
				
				try {
					out.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				  
				  
				  
				  
				  
				  
				  
				  
				  
				  
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	   
		
			
			
			
			
			
			
			
			
			
			
		

	}

}
