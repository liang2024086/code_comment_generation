package methodEmbedding.Magic_Trick.S.LYD271;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class MagicTrick {

	 
	
	
	public static void main(String[] args) throws IOException {
		int a[][] =  new int[4][4] ;
		int a1[][] =  new int[4][4] ;;
		int castNum = 0;
		int finish = 0;
		FileReader fr=new FileReader("c:\\File.txt");
		File file = new File("c:/output"); //????????????
		FileOutputStream out = new FileOutputStream(file); //????FileOutputStream????
		BufferedReader br=new BufferedReader(fr);
		int changeRow1 = 0;
		int changeRow2 = 0;
		int count = 0;
		int iu=0;
		for(int i=0;i<10000;i++){
			String s=br.readLine();
			if(s!=null){
				if(i==0){
					castNum = Integer.valueOf(s);
				}else{
					if((i-1)%5!=0||i==2){
						String[] s1 = s.split(" ");
						if(count==4){
							count=0;
						}
						if(finish == 1){
							a[count][0] = Integer.valueOf(s1[0]);
							a[count][1] = Integer.valueOf(s1[1]);
							a[count][2] = Integer.valueOf(s1[2]);
							a[count][3] = Integer.valueOf(s1[3]);
							count++;
						}else if(finish==2){
							a1[count][0] = Integer.valueOf(s1[0]);
							a1[count][1] = Integer.valueOf(s1[1]);
							a1[count][2] = Integer.valueOf(s1[2]);
							a1[count][3] = Integer.valueOf(s1[3]);
							count++;
						}
						
					}else{
						
						if(finish == 1){
							changeRow2 = Integer.valueOf(s);
							finish++;
						}else if(finish ==0){
							changeRow1 = Integer.valueOf(s);
							count = 0;
							finish++;
						}else if(finish==2){
							int finish_count = 0;
							int temp_int = 0;
							for(int z=0;z<4;z++){
								for(int y=0;y<4;y++){
									if(a[changeRow1-1][z]==a1[changeRow2-1][y]){
										finish_count++;
										temp_int = a[changeRow1-1][z];
									}
								}
							}
							if(finish_count==1){
								System.out.println(temp_int);
								 byte buy[] = String.valueOf(temp_int).getBytes();
								 out.write(buy);  
							}else if(finish_count>1){
								System.out.println("Bad magician!");
								 byte buy[] = "Bad magician!".getBytes();
								 out.write(buy); 
							}else{
								System.out.println("Volunteer cheated!");
								 byte buy[] = "Volunteer cheated!".getBytes();
								 out.write(buy); 
							}
							finish=1;
						}
						
					}
					
				}
					
			}else{
				
				if(iu==0){
					int finish_count = 0;
					int temp_int = 0;
					for(int z=0;z<4;z++){
						for(int y=0;y<4;y++){
							if(a[changeRow1-1][z]==a1[changeRow2-1][y]){
								finish_count++;
								temp_int = a[changeRow1-1][z];
							}
						}
					}
					if(finish_count==1){
						System.out.println(temp_int);
						 out.write(temp_int);  
					}else if(finish_count>1){
						System.out.println("Bad magician!");
						 byte buy[] = "Bad magician!".getBytes();
						 out.write(buy); 
					}else{
						System.out.println("Volunteer cheated!");
						byte buy[] = "Volunteer cheated!".getBytes();
						 out.write(buy); 
					}
					iu=1;
				}
				
			}
		}
	}
}
