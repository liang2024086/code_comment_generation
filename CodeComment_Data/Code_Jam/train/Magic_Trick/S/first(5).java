package methodEmbedding.Magic_Trick.S.LYD1839;


import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class first {
	
	public static void main(String argcp[])
	{
		File i=new File("E:/codejam/in_magic.in");
		File o=new File("E:/codejam/out_magic.out");
		try{
			Scanner scanner=new Scanner(i);
			PrintWriter pw = new PrintWriter(o);
			String temp,dist[][] = {{""},{""},{""},{""}};
			int check[],fcheck[];
			int nnc[],fnc[];
			int mat[][] = {{0,0,0,0},{0,0,0,0},{0,0,0,0},{0,0,0,0}};
			int f=0,s=0;
			temp=scanner.nextLine();
			int ncas=1;
			int cas=Integer.parseInt(temp);
			int x=0,y=0;
			check=new int[4];
			fcheck=new int[4];
			nnc=new int[4];
			fnc=new int[4];
			while(scanner.hasNextLine())
			{
				x=0;y=0;
				temp=scanner.nextLine();
				f=Integer.parseInt(temp);
				temp=scanner.nextLine();
				dist[x]=temp.split(" +");
				x++;
				temp=scanner.nextLine();
				//System.out.println(temp);
				dist[x]=temp.split(" +");
				x++;
				temp=scanner.nextLine();
				dist[x]=temp.split(" +");
				x++;
				temp=scanner.nextLine();
				dist[x]=temp.split(" +");
				for(x=0;x<4;x++)
				{
					for(y=0;y<4;y++)
					{
						mat[x][y]=Integer.parseInt(dist[x][y]);
					}
				}
				check=mat[f-1];
				
				for(int x4=0;x4<4;x4++)
				{
					nnc[x4]=check[x4];
				}
			

				
				
				x=0;y=0;
				temp=scanner.nextLine();
				s=Integer.parseInt(temp);
				temp=scanner.nextLine();
				dist[x]=temp.split(" +");
				x++;
				temp=scanner.nextLine();
				dist[x]=temp.split(" +");
				x++;
				temp=scanner.nextLine();
				dist[x]=temp.split(" +");
				x++;
				temp=scanner.nextLine();
				dist[x]=temp.split(" +");
				for(x=0;x<4;x++)
				{
					for(y=0;y<4;y++)
					{
						mat[x][y]=Integer.parseInt(dist[x][y]);
					}
				}
				fcheck=mat[s-1];
				fnc=fcheck;
				
				int flag=0,carier=0;
				for(int p=0;p<4;p++)
				{
					for(int q=0;q<4;q++)
					{
						if(nnc[p]==fnc[q])
						{
							flag++;
							carier=nnc[p];
//							System.out.println("EQUAL!!!: "+nnc[p]+"    "+fnc[q]);
						}
						else
						{
//							System.out.println(nnc[p]+"    "+fnc[q]);
						}
					}
				}
				
				if(flag==1)
				{
					System.out.println(carier);
					
					pw.write("Case #"+ncas+": "+carier+"\n");
				}
				else if(flag==0){
					pw.write("Case #"+ncas+": Volunteer cheated!\n");

				}
				else{
					System.out.println("The magician did a bad job");
					pw.write("Case #"+ncas+": Bad magician!\n");
				}
				flag=0;
				ncas++;
			}
			pw.close();
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}
