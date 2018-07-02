package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1134;

    import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

    public class SUBMIN
    {
    	public static void main(String[] args) throws IOException
	 	{
    		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	 		StringBuilder sb=new StringBuilder();
	 		int t=Integer.parseInt(br.readLine());
	 		for(int y=1;y<=t;y++)
	 		{
	 			sb.append("Case #"+y+": ");
	 			String s[]=br.readLine().split(" ");
	 			double c=Double.parseDouble(s[0]),f=Double.parseDouble(s[1]),x=Double.parseDouble(s[2]);
	 			double current=2,sum=0;
	 			while(true)
	 			{
	 				if(c>x)
	 				{
	 					sum=x/2;
	 					break;
	 				}
	 				double t1=(x-c)/current,t2=x/(current+f);
	 				if(t1>t2)
	 				{
	 					sum=sum+c/current;
	 				}
	 				else
	 				{
	 					sum=sum+x/current;
	 					break;
	 				}
	 				current=current+f;
	 			}
	 			sb.append(sum+"\n");
	 		}
	 		System.out.println(sb.toString());
	 	}	
    }
    
