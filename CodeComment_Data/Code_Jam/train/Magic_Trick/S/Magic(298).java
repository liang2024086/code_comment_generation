package methodEmbedding.Magic_Trick.S.LYD519;


import java.io.*;
import java.util.Scanner;



public class Magic {
		static int card[][] = new int[4][4];
		static int card2[][] = new int[4][4];
		static BufferedReader br;
		static BufferedWriter bw;
		static int num=0;
		static int count = 0;
		static int sit =0;
		
		public static void main(String[] args) throws IOException{
			try{
				File file = new File("C:\\2.txt");
				br = new BufferedReader(new FileReader("C:\\1.txt"));
				bw = new BufferedWriter(new FileWriter(file));
				int set =  Integer.parseInt(br.readLine());
				if(!file.exists())
				{
					file.createNewFile();
				}
				for(int i=0;i<set;i++){
					
						
					int row1 = Integer.parseInt(br.readLine());	
					for(int j=0;j<4;j++){//read data
							//card[j][0]= Integer.parseInt(br.readLine().split(" ")) ;
								String[] str=br.readLine().split(" ");
								for(int x=0;x<4;x++){
									card[j][x]=Integer.parseInt(str[x]);
								}
							
						}
					 int row2=Integer.parseInt(br.readLine());
					 for(int j=0;j<4;j++){//read data
							//card[j][0]= Integer.parseInt(br.readLine().split(" ")) ;
								String[] str=br.readLine().split(" ");
								for(int x=0;x<4;x++){
									card2[j][x]=Integer.parseInt(str[x]);
								}
							
						}
					 //compare
					 
					 for(int y=0;y<4;y++){
						 for(int z=0;z<4;z++){
							 if(card[row1-1][y]==card2[row2-1][z]){
							 		num=card2[row2-1][z];
							 		count++;
						 	  }
						}
						
					 }
					 if(count==1){
						sit=1;
					 }else if(count>=2){
						 sit=2; 
					 }else if(count==0){
						 sit=3;
					}
					 
					 if(sit==1){
					 System.out.println("Case #"+(i+1)+": " + num);
					 bw.write("Case #"+(i+1)+": " + num);
					 bw.newLine();
					 }else if(sit==2){
					 System.out.println("Case #"+(i+1)+": " + "Bad magician!");
					 bw.write("Case #"+(i+1)+": " + "Bad magician!");
					 bw.newLine();
					 }else if(sit==3){
					System.out.println("Case #"+(i+1)+": " + "Volunteer cheated!");
					bw.write("Case #"+(i+1)+": " + "Volunteer cheated!");
					bw.newLine();
					 }
					 
					 count=0;
					sit=0;
				}
				
			
			
			
			}catch(Exception e){
				  e.printStackTrace();
			}finally{
				br.close();
				bw.close();
			}
		}
		
		
		
}
