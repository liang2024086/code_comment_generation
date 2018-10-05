package methodEmbedding.Magic_Trick.S.LYD2142;

import java.io.*;

public class MagicTrick {

	public static void main(String[] args) {
		
		
		try {
			
			FileReader Reader = new FileReader("input.txt");
			BufferedReader Input= new BufferedReader(Reader);
			PrintWriter PW = new PrintWriter ("output.txt","UTF-8");
			int T,i1,i2,i3,i4,i5,i6,RowNum,Answer;		
			int [][] Matrix=new int [2] [4];
			String Str1;
			String [] Str2=null;
			
			T=Integer.parseInt(Input.readLine());
			
			for(i1=1; i1<=T; i1++) {
				
				for(i2=0; i2<2; i2++) {
					
					RowNum=Integer.parseInt(Input.readLine()); 
					
					for(i3=1; i3<=4; i3++) {
						
						Str1= Input.readLine();
						
						if(i3==RowNum){
							
						Str1=Str1.trim();						
					    Str2=Str1.split("\\s+");
					    
					    for (i4=0; i4<4; i4++){
					    	
					    	Matrix[i2][i4]=Integer.parseInt(Str2[i4]);
					      }
									
						}
						
				    }   			   
				
			    } 
				
				Answer=0;
				
				for (i5=0; i5<4; i5++){
				 
					for (i6=0; i6<4; i6++){
			    	
				        if(Matrix[0][i5]==Matrix[1][i6]){
					  
					        if(Answer==0)
						
					          Answer=Matrix[0][i5];
					        
					        else
					          
					          Answer=99;
						       
				          }
					}  
			    }

			 if(Answer==0) 
				 PW.println("Case #"+i1+": Volunteer cheated!");
			 
			 else if (Answer==99)
			      PW.println("Case #"+i1+": Bad magician!");	
			 
			 else
				 PW.println("Case #"+i1+": " + Answer);
			}
			
			Input.close();
			PW.close();
			
		}
			
		catch (IOException e) {

			e.printStackTrace();
		}
			  
  }
	
}
