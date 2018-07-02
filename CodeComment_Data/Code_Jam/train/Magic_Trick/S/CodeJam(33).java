package methodEmbedding.Magic_Trick.S.LYD84;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;


public class CodeJam {
	public static void main(String[] args) {
		try {
			BufferedReader in = new BufferedReader(new FileReader("A-small-attempt0.in"));
			String line = in.readLine();
			long cases=Long.parseLong(line);
			long r,t;
			int answer1,answer2;
			int matrice[][]=new int[4][4];
			String []str;
			int[] row_answer=new int[4];
			int[] row_answer2=new int[4];
			int reponse=0,number=0;
			PrintWriter out  = new PrintWriter(new FileWriter("out2.txt"));
			
				for(int i=0;i<cases-1;i++){
					reponse=0;
					line=in.readLine();
					answer1=Integer.parseInt(line);
					for(int j=0;j<4;j++){
						line=in.readLine();
						if(j==answer1-1){
							str=line.split(" ");
								for(int k=0;k<4;k++)
								row_answer[k]=Integer.parseInt(str[k]);
							}
					}
					line=in.readLine();
					answer2=Integer.parseInt(line);
					for(int j=0;j<4;j++){
						line=in.readLine();
						if(j==answer2-1){
						str=line.split(" ");
							for(int k=0;k<4;k++)
							row_answer2[k]=Integer.parseInt(str[k]);
						}
					}
					for(int j=0;j<4;j++){
						int k=0;
						while(k<4 && row_answer[j]!=row_answer2[k])
							k++;
						if(k!=4){
							reponse++;
							number=row_answer[j];
						}
					}
					if(reponse==1)
					out.println("Case #"+(i+1)+": "+number);
					if(reponse==0)
						out.println("Case #"+(i+1)+": Volunteer cheated!");
					if(reponse>1)
						out.println("Case #"+(i+1)+": Bad magician!");
				}
				
				reponse=0;
				line=in.readLine();
				answer1=Integer.parseInt(line);
				for(int j=0;j<4;j++){
					line=in.readLine();
					if(j==answer1-1){
						str=line.split(" ");
							for(int k=0;k<4;k++)
							row_answer[k]=Integer.parseInt(str[k]);
						}
				}
				line=in.readLine();
				answer2=Integer.parseInt(line);
				for(int j=0;j<4;j++){
					line=in.readLine();
					if(j==answer2-1){
					str=line.split(" ");
						for(int k=0;k<4;k++)
						row_answer2[k]=Integer.parseInt(str[k]);
					}
				}
				for(int j=0;j<4;j++){
					int k=0;
					while(k<4 && row_answer[j]!=row_answer2[k])
						k++;
					if(k!=4){
						reponse++;
						number=row_answer[j];
					}
				}
				if(reponse==1)
				out.print("Case #"+cases+": "+number);
				if(reponse==0)
					out.print("Case #"+cases+": Volunteer cheated!");
				if(reponse>1)
					out.print("Case #"+cases+": Bad magician!");
			out.close();
			
			}catch (Exception e){
					e.printStackTrace();
					
				}
		

	}

	
}
