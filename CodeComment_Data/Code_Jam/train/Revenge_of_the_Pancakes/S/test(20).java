package methodEmbedding.Revenge_of_the_Pancakes.S.LYD460;


	import java.io.BufferedReader;
	import java.io.InputStreamReader;
	import java.util.Scanner;

	public class test{
		static int totalflip=0;
		static int index=1;
        
		
		public static void main(String[] args)
		{
			
			 Scanner obj= new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		     
			String tcase=obj.nextLine();
			 
			 while(obj.hasNextLine())
	{
			 String in = obj.nextLine();
		        int len= in.length();
		        
		       char [] inArray =in.toCharArray();
		       totalflip=0; 
		       int i;
		        
		        for( i=0; i<len-1 ; i++)
		        {
		        	
		        	
		        	if(inArray[i] != inArray[i+1])
		        	{
		        			     //reverse and flip 
							  				
		        						for(int y=0;y<=i;y++)
		        						{
		        							if(inArray[y]=='+')
		        								inArray[y]='-';
		        							else
		        								inArray[y]='+';
		        						}
		        		
		        						totalflip++;
		        						i=0;	
							     	
							     	
								        
							     	
							     	continue;
		        				        			
		        			
		        	}
		        	 
		        		
		        	
		        	 
		        }
		        
		        if(inArray[len-1]=='-')
		        {
		        	for(int y=0;y<len;y++)
					{
						inArray[y]='+';
					}
		        	totalflip++;
		        }
		        	
		        System.out.println("Case #" + index++ + ": "+totalflip);  
		        
	}	       
		        
		}
		
	}
	
