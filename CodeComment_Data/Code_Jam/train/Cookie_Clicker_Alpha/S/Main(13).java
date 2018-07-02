package methodEmbedding.Cookie_Clicker_Alpha.S.LYD557;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Main 
{
	public static void main(String[] args) throws Exception{
		BufferedReader br=null;
		BufferedWriter bw=null;
		double price=0;
		double speed=0;
		double target=0;
		int index=1;
		boolean flag1=true;
			
		try {
			File f= new File("d:/googlejam.txt");
			if(!f.exists())
			{
				f.createNewFile();
			}			
			br=new BufferedReader(new FileReader("d:/111.txt"));
			bw=new BufferedWriter(new FileWriter(f));
			
			int count=Integer.parseInt(br.readLine());
			String flag=null;
			while((flag=br.readLine())!=null)
			{
				String[] info =flag.trim().split(" ");
				
				price=Double.parseDouble(info[0]);
				speed=Double.parseDouble(info[1]);
				target=Double.parseDouble(info[2]);
				
				System.out.println(price+" "+speed+" "+" "+target);
				
			//	int increase=0;
				double temp=target/2;;

					
					for (int i = 0; i < 1000000; i++) {   //there may be some problem
						double temp1=0.0;
						for (int j = 0; j <= i; j++)
						{
							temp1+=price/(2+j*speed);//may problem
						}
						temp1+=(target/(2+(i+1)*speed));
					//	System.out.println("i="+i+"\t"+"temp1="+temp1+"\t"+"temp="+temp);
						if(temp1<=temp)
						{
							temp=temp1;
						}
						else
						{
	
							break;
						}
					
					
				//	increase++;
				}
				bw.write("Case #"+index+": "+temp);
				bw.newLine();	
				index++;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally
		{
			br.close();
			bw.close();
		}
	}
}
