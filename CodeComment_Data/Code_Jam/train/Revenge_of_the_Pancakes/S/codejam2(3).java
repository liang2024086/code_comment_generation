package methodEmbedding.Revenge_of_the_Pancakes.S.LYD175;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class codejam2 {

	public static void main(String[] args) throws IOException  {
		
		int t,c=1,p,l,i,k=0;
		String s;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
			t=Integer.parseInt(br.readLine());

			while(t!=0)
		    { 
				s=br.readLine();
				k=0;
				
			  p=s.charAt(0);
			  l=s.length();
			  for(i=1;i<l;i++)
			  { 
				  if(s.charAt(i)==p);
				  else
				  { 
					  k++;
					  p=s.charAt(i);
				  }
				
			  }
			  if(s.charAt(l-1)=='+')
			    k--;
			    k=k+1;
			  System.out.println("Case #"+c+": "+k);
			  c++;  
		      t--;
			}
			
	}
}
