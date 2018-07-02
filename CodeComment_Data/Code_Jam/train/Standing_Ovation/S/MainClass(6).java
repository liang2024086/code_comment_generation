package methodEmbedding.Standing_Ovation.S.LYD1832;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;


public class MainClass {

	public static void main(String[] args) throws Exception {

		FileInputStream fis=new FileInputStream(new File("input1.txt"));
		DataInputStream dis=new DataInputStream(fis);
		DataOutputStream out=new DataOutputStream(new FileOutputStream(new File("out.txt")));
		int t=Integer.parseInt(dis.readLine());
		for(int i=0;i<t;i++){
			String line=dis.readLine();
			System.out.println(line);
			line=line.split(" ")[1];
			
			String chard[]=line.split("(?!^)");
			//String chard[]="sac".split("");
			//System.out.println(line);
			//System.out.println("Here"+chard[0]);
			int num=0;
			int numofpeople=0;
			for(int j=0;j<chard.length;j++){
				int shylevel=Integer.parseInt(chard[j]);
				if(j==0 && shylevel==0){
					numofpeople=numofpeople+1;
					num=num+1;
				}else if(j>num){
					System.out.println("j="+j+"  num="+num);
					int k=j-num;
					numofpeople=numofpeople+k;
					num=num+k;
				}
				num=num+shylevel;
			}
			
			out.writeBytes("Case #"+(i+1)+": "+numofpeople+"\n");
			
			
		}
		dis.close();
		out.close();

	}

}
