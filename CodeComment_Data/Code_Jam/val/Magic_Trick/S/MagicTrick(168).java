package methodEmbedding.Magic_Trick.S.LYD1787;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock;


public class MagicTrick {
	
	public static void main(String[] args) {
	    boolean lineBreaker=true;
		BufferedReader reader=null;
		BufferedWriter writer=null;
		try {
			writer=new BufferedWriter(new FileWriter("output.txt"));
			reader=new BufferedReader(new FileReader("input.txt"));
			String s=reader.readLine();
			int testCase=Integer.parseInt(s);
			for(int i=1;i<=testCase;i++){
				if(lineBreaker){
					lineBreaker=false;
				}else
				writer.write("\n");
				String[] row1=null;
				String[] row2=null;
				s=reader.readLine();
				int choice1=Integer.parseInt(s);
				for(int j=1;j<=4;j++)
				{
					s=reader.readLine();
					if(j==choice1){
						row1=s.split(" ");
					}
				}
				s=reader.readLine();
				int choice2=Integer.parseInt(s);
				for(int j=1;j<=4;j++)
				{
					s=reader.readLine();
					if(j==choice2){
						row2=s.split(" ");
					}
				}
				
				int count=0;
				String number=null;
				for(int j=0;j<4;j++){
					for(int k=0;k<4;k++){
						if(row1[j].equals(row2[k]))
							{
							++count;
							number=row1[j];
							}
						
					}
				}
				if(count==1)
					writer.write("Case #"+i+": "+number);
				else if(count>1)
					writer.write("Case #"+i+": Bad magician!");
				else
					writer.write("Case #"+i+": Volunteer cheated!");
				
				
				
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			try {
			writer.flush();
			writer.close();
			reader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
