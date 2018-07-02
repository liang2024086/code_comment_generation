package methodEmbedding.Counting_Sheep.S.LYD1244;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CountingSheep {

	public static void main(String[] args) throws IOException {
	
		String path =  "A-small-attempt0.in";

			File f = new File(path);
		
			PrintWriter out = null;
			
			
			
			try{
				File fi = new File("result.txt");
				fi.createNewFile();
				
				out = new PrintWriter(fi);
				
				
				 Scanner sc = new Scanner(f);
				 
				 int num = sc.nextInt();
					
				Date d = new Date();
					for(int k=0; k<num; k++){
						
						// System.out.print(k + ". ");
						Set<Character> digits = new HashSet<>(); //all the digits that have already passed
						
						Long n = sc.nextLong();
					
						
						Long last = n;
						Long []array = new Long[3];
						
						for(int i=0; i<3; i++){
							
							array[i] = null;
						}
						
						for(int i = 1; ; i++){
							
							
							
							if(digits.size() == 10){
								last = (i-1)*n;
								break;
							}
								
							if(i < 4) array[i-1] = i*n;
							if(i == 4) {
								
								if(array[0] == array[1] && array[1] == array[2] && array[2] != null){
									last = null;
									break;
								}
								
							}

							Long current = i * n;
							
							
							String line = current.toString();
							char [] dig = line.toCharArray();
							
							for(int j = 0; j<dig.length; j++){
								
								digits.add(dig[j]);
					
							}
	
						}
						
						
						//Case #1: INSOMNIA
						out.printf("Case #%d: ", (k+1));
						
						if(last == null) out.println("INSOMNIA");
						else out.println(last);

					}
					
					sc.close();
				
				
			} catch(FileNotFoundException e){
				
				out.write("File not found\n");
			}finally{
				
				out.close();
				
			}
			

			
		
	}
	
	
	
	
	
}
