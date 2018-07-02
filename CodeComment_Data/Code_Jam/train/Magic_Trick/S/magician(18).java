package methodEmbedding.Magic_Trick.S.LYD358;


import java.io.*;
import java.util.Scanner;


public class magician {

	public static void main(String[] args) throws IOException {
		boolean[] t;
		t=new boolean[17];
		boolean bad=false;
		int answer=0;
		FileWriter fw=new FileWriter("output.txt");
		BufferedWriter writer=new BufferedWriter(fw);
		FileReader fr=new FileReader("A-small-attempt4.in");
		BufferedReader reader=new BufferedReader(fr);
		Scanner scan=null;
		String line=reader.readLine();
		scan=new Scanner(line);
		int n=scan.nextInt();
		for(int i=1;i<=n;i++){
			int r=i;
			for(int z=0;z<17;z++) t[z]=false;
			bad=false;
			answer=0;
			line=reader.readLine();
			scan=new Scanner(line);
			int row=scan.nextInt();
			
			//First test
			for(int j=1;j<=4;j++){
					line=reader.readLine();
					scan=new Scanner(line);
					for(int k=1;k<=4;k++){
						int a=scan.nextInt();
						if(j==row){
							t[a]=true;
						}
					}
			}
			
			//Second test
			line=reader.readLine();
			scan=new Scanner(line);
			row=scan.nextInt();
			for(int j=1;j<=4;j++){
					line=reader.readLine();
					scan=new Scanner(line);
					for(int k=1;k<=4;k++){
						int a=0;
						a=scan.nextInt();
						
						if(j==row){
							if(t[a]==true)
								if(answer==0){
									answer=a;
									
								}else bad=true;
							
							}
						}
					
			}
			
			if(bad==true) writer.write("Case #"+r+": Bad magician!\n"); else
				if(answer!=0) writer.write("Case #"+r+": "+answer+"\n"); else
					writer.write("Case #"+r+": Volunteer cheated!\n");
			
			
			
		}
		
		
		writer.close();
		reader.close();
		
		
		
		
		

	}

}
