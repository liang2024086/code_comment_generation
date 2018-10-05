package methodEmbedding.Counting_Sheep.S.LYD1272;

import java.util.*;

public class sheep
{
	public static void main(String[] args) 
	{
			
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
        int l=1;
		for(int a=0;a<t;a++)
		{
			int input = sc.nextInt();
			String []arr= new String[10];
            int x=0;
			for(int i=1;i<100;i++)
			{
				x=input * i;
				String word = Integer.toString(x);
				int len=word.length();
				for(int b=0;b<len;b++)
				{
					char k=word.charAt(b);
					if (k=='0')
						arr[0]="1";
					else if(k=='1')
						arr[1]="1";	
					else if (k=='2')
						arr[2]="1";
					else if(k=='3')
						arr[3]="1";
					else if (k=='4')
						arr[4]="1";
					else if(k=='5')
						arr[5]="1";
					else if(k=='6')
						arr[6]="1";	
					else if (k=='7')
						arr[7]="1";
					else if(k=='8')
						arr[8]="1";
					else if (k=='9')
						arr[9]="1";
						  	
				}	
                if(arr[0] !=null &&arr[1]!=null&&arr[2] !=null &&arr[3]!=null&&arr[4]!=null &&arr[5]!=null&&arr[6] !=null &&arr[7]!=null&&arr[8] !=null &&arr[9]!=null)
                    {
                    break;
                }
               
			}
            boolean z=false;
                
               for (int g=0; g<=arr.length-1; g++) {
                    if (arr[g] != null) {
                       z=true;                  
                  }
                }
                
                    
                    if (z==true)
                    {   
                        if(x==0)
                        System.out.println("Case #"+(l++)+": "+"Insomnia");
                        else
                        System.out.println("Case #"+(l++)+": "+x);
                        
                    }
                    else
                     System.out.println("Insomnia");
		}	
	
	}
}
