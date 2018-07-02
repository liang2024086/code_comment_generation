package methodEmbedding.Magic_Trick.S.LYD1139;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Scanner;

public class magictricsmall {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file = new File("output.txt");
		FileWriter fw = new FileWriter(file.getAbsoluteFile());
		BufferedWriter bw = new BufferedWriter(fw);
		Scanner in =new Scanner(new File("input.txt"));
		String sol=new String();
		int count=Integer.parseInt( in.nextLine());
		int j,i;
		
		for (int ij=1;ij<=count;ij++)
		{
			int ans=0;
			//reading first input
			int ans1=Integer.parseInt( in.next());
			in.nextLine();
			for(j=1;j<ans1;j++)
			{

				in.nextLine();
			}
			String out1=new String();
			
			out1=in.nextLine();
			
			for(;j<4;j++)
			{

				in.nextLine();

			}


			String[] ind1=new String[4];
			ind1=out1.split(" ");

			//rading second
			int ans2=Integer.parseInt( in.next());
			in.nextLine();
			for(j=1;j<ans2;j++)
			{
				String k=in.nextLine();


			}
			String out2=new String();
			out2=in.nextLine();
			
			
			for(;j<4;j++)
			{
				in.nextLine();


			}

			String[] ind2=new String[4];
			ind2=out2.split(" ");

			//comparing 
			LinkedList<String> l1=new LinkedList<>();
			l1.add(ind1[0]);
			l1.add(ind1[1]);
			l1.add(ind1[2]);
			l1.add(ind1[3]);
			LinkedList<String> l2=new LinkedList<>();
			l2.add(ind2[0]);
			l2.add(ind2[1]);
			l2.add(ind2[2]);
			l2.add(ind2[3]);
			for(i=0;i<4;i++)
				if(l1.contains(ind2[i]))
				{
					ans++;
					sol=ind2[i];
				}
			if(ans==1)
				bw.write("Case #"+ij+": "+ sol+"\n");
				
			if(ans==0)
				bw.write("Case #"+ij+": "+ "Volunteer cheated!"+"\n");
				
			if(ans>1)
				bw.write("Case #"+ij+": "+ "Bad magician!"+"\n");
				





		}
		in.close();
		bw.close();
	}


}
