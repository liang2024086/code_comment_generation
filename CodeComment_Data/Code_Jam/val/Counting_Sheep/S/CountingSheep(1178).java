package methodEmbedding.Counting_Sheep.S.LYD1087;

//import java.util.*;
import java.io.*;
public class CountingSheep {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		try
		{
			String fileName = "C:\\Users\\SHAILENDRA ACHARYA\\workspace\\codejam\\A-small-attempt0.in";
		//	String line = null;
			FileReader fileReader = new FileReader(fileName);
			FileWriter fw = new FileWriter("test.txt");
			BufferedReader br = new BufferedReader(fileReader);
			BufferedWriter bw = new BufferedWriter(fw);
			int T = Integer.parseInt(br.readLine());
			int temp=0;
			int Case=0;
			while(T-->0)
			{
				int count[]=new int[10];
				Case++;
				//System.out.println("case no:"+Case);
				int N= Integer.parseInt(br.readLine());
					if(N==0)
					{
						bw.write("Case #"+Case+":"+" "+"INSOMNIA" );
						bw.newLine();
						continue;
					}
				int x=N;
			//	System.out.println("vvj");
					for(int i=0;i<=x;i++)
					{
						x=(i+1)*N;
						int y=x;
						while(y>0)
						{
						temp=y%10;
						//System.out.println(temp);
						if(temp==0)
							count[temp]=temp+1;
						if(count[temp]==0)
							count[temp]=temp;
						y=y/10;
						}
						int ctr=0;
						for(int j=0;j<10;j++)
						{
							if(count[j]!=0)
								ctr++;
						}
						//System.out.println(ctr);
					//	System.out.println(x);
						if(ctr==10)
						{
							System.out.println("Case #"+Case+":"+" "+x );
							bw.write("Case #"+Case+":"+" "+x );
							bw.newLine();
							break;
						}
					}
					
			}
			br.close();
			bw.close();
		}
		catch(FileNotFoundException ex)
		{
			System.out.println(ex.getMessage());
		}
		

	}

}
