package methodEmbedding.Magic_Trick.S.LYD138;

import java.io.*;
public class C
{
	public static void main(String a[])
	{
		int i,j,k,b,c,t=0,m=0;
		int[][] p=new int[4][4];
		int[][] q=new int[4][4];
		int[] r=new int[4];
		String n="";
		String[] s=new String[5]; 
        try
        {
            File fi=new File("A-small-attempt1.in");
            InputStreamReader isr=new FileReader(fi);
            BufferedReader br=new BufferedReader(isr);
			File fo=new File("A-small-attempt1.out");
			FileOutputStream fos=new FileOutputStream(fo);
			n=br.readLine();
			int f=Integer.parseInt(n);
			for(i=0;i<f;i++)
            {
				r[0]=r[1]=r[2]=r[3]=0;
				b=Integer.parseInt(br.readLine());
				for(j=0;j<4;j++)
				{
					n=br.readLine();
					s=n.split(" ");
					p[j][0]=Integer.parseInt(s[0]);
					p[j][1]=Integer.parseInt(s[1]);
					p[j][2]=Integer.parseInt(s[2]);
					p[j][3]=Integer.parseInt(s[3]);
				}
				c=Integer.parseInt(br.readLine());
				for(j=0;j<4;j++)
				{
					n=br.readLine();
					s=n.split(" ");
					q[j][0]=Integer.parseInt(s[0]);
					q[j][1]=Integer.parseInt(s[1]);
					q[j][2]=Integer.parseInt(s[2]);
					q[j][3]=Integer.parseInt(s[3]);
				}
				for(j=0;j<4;j++)
				{
					for(k=0;k<4;k++)
					{
						if(p[b-1][j]==q[c-1][k])
						{
							r[j]++;
						}
					}
				}
				System.out.println("R : "+r[0]+r[1]+r[2]+r[3]);
				for(j=0;j<4;j++)
				{
					if(r[j]!=0)
						break;
				}
				if(j==4)
				{
					n="Case #"+(i+1)+": Volunteer cheated!\n";
					fos.write(n.getBytes());
				}
				else
				{
					for(j=0;j<4;j++)
					{
						if(r[j]==1)
						{
							m++;
							t=j;
						}
						if(m==2)
						{
							n="Case #"+(i+1)+": Bad magician!\n";
							fos.write(n.getBytes());
							m=0;
							break;
						}
					}
					if(m==1)
					{
						n="Case #"+(i+1)+": "+p[b-1][t]+"\n";
						fos.write(n.getBytes());
						m=0;
					}
				}
			}
		}
        catch(Exception e)
        {
			System.out.println("Error : "+e.getMessage());
		}
	}
}
