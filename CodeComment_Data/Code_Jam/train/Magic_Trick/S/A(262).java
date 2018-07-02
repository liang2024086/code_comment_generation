package methodEmbedding.Magic_Trick.S.LYD1706;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class A {
	
		private static String BAD_MAGICIAN = "Bad magician!" ;
		private static String VOL_CHEATED  = "Volunteer cheated!" ;
	
	
		public static void main(String args[]){
			
			try{
				
				BufferedReader br = new BufferedReader(new FileReader(args[0]));
				
				String strTmp = br.readLine();
				
				BufferedWriter bw = new BufferedWriter(new FileWriter( new File("output.txt"),false));
				
				
				int inputSize = Integer.parseInt(strTmp);
				
				for(int i=0;i<inputSize;i++  ){

					List<String> ansList = new ArrayList<String>(); 
					int ans = Integer.parseInt(br.readLine());
					String output ;
					
					// processing inputline
					for(int j=1;j<5;j++){
						
						String finp = br.readLine();
						if(j==ans){
							ansList = new ArrayList<String>( Arrays.asList(finp.split(" ") ) );
						}
						
					}
					
					ans = Integer.parseInt(br.readLine());
					
					for(int j=1;j<5;j++){
						
						String finp = br.readLine();
						if(j==ans){
							List tmpList = new ArrayList<String> ( Arrays.asList(finp.split(" ")) );
							ansList.retainAll(tmpList);
						}
						
					}
					
					
					// produce output
					
					if(ansList.size()==1){
						output = ansList.get(0);
					}else if(ansList.size()>1 ){
						output = BAD_MAGICIAN ;
					}else{
						output = VOL_CHEATED ;
					}


		
					System.out.println("Case #"+(i+1)+": "+	output );			

					bw.write("Case #"+(i+1)+": "+ output );
					bw.newLine();
				}
				
				bw.close();
				br.close();
			
			
			}catch(Exception ex){
				ex.printStackTrace();
			}
		}
		

}
