package methodEmbedding.Cookie_Clicker_Alpha.S.LYD889;

import java.io.*;
public class D
{
	public static void main(String a[])
	{
		int i;
		double b,c,d,x,y=0,j,k;
		double z;
		String n="";
		String[] s=new String[4]; 
        try
        {
            File fi=new File("B-small-attempt2.in");
            InputStreamReader isr=new FileReader(fi);
            BufferedReader br=new BufferedReader(isr);
			File fo=new File("B-small-attempt2.out");
			FileOutputStream fos=new FileOutputStream(fo);
			n=br.readLine();
			int f=Integer.parseInt(n);
			for(i=0;i<f;i++)
            {
				z=0;
				x=2;
				n=br.readLine();
				s=n.split(" ");
				b=Double.parseDouble(s[0]);
				c=Double.parseDouble(s[1]);
				d=Double.parseDouble(s[2]);
				do
				{
					j=d/x;
					k=(b/x)+(d/(x+c));
					if(k<j)
					{
						z+=b/x;
						x+=c;
					}
					else
					{
						z+=j;
						break;
					}
				}
				while(true);
				n="Case #"+(i+1)+": "+z+"\n";
				fos.write(n.getBytes());
			}
		}
        catch(Exception e)
        {
			System.out.println("Error : "+e.getMessage());
		}
	}
}
