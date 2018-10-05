package methodEmbedding.Counting_Sheep.S.LYD183;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class CountingSheep {
 public static void main(String[] args){
      // The name of the file to open.
      String fileName = "A-small-attempt0.in";

      // This will reference one line at a time
      String line = null;

      try {
          // FileReader reads text files in the default encoding.
          FileReader fileReader = 
              new FileReader(fileName);

          // Always wrap FileReader in BufferedReader.
          BufferedReader bufferedReader =  new BufferedReader(fileReader);
          line = bufferedReader.readLine();
          int T = Integer.parseInt(line); //T number
          int Nvalue = 0;
          FileWriter filewriter = new FileWriter("output.txt");
          BufferedWriter bufferedWriter = new BufferedWriter(filewriter);
          
          for(int i = 1; i<=T; i++){
        	  line = bufferedReader.readLine();// read N
        	  Nvalue = Integer.parseInt(line);
        	  if(Nvalue == 0){ 
        		  bufferedWriter.write("Case #" + i + ": INSOMNIA\n");
        	  }else{//not insomnia case
        		  boolean[] test = new boolean[10];
        		  boolean result = false;  
        		  int Ncopy = 0;
        		  int time = 1;
        		  while(!result){        			  
        			  Ncopy = Nvalue * time;
        			  int residul = Ncopy%10;       			          			  
        			  while(Ncopy!=0){
        				  test[residul] = true;
        				  Ncopy = Ncopy /10;
        				  residul = Ncopy%10;        				
        			  }//end inner while
        			  result = test[0] && test[1] && test[2] && test[3] && test[4] && test[5] && test[6] && test[7] && test[8] && test[9];	   
        			  time++;
        		  }//end while
        		  bufferedWriter.write("Case #" + i + ": "+ Nvalue * (time-1) +"\n");
        	  }//end else
        	  
          }//end for
          ///////test banch/////////
          //FileWriter filewritera = new FileWriter("Counting_Sheep.txt");
          //BufferedWriter bufferedWritera = new BufferedWriter(filewritera);
          //
          //bufferedWritera.write("1000000\n");          
    	  //for(int i=0;i<1000000;i++)
    	//	  bufferedWritera.write((i+1) +"\n");
    	  //bufferedWritera.close(); 
          ///////end test banch///////
    	  
          bufferedReader.close();  
          bufferedWriter.close(); 
      }//end try
      catch(FileNotFoundException ex) {
          System.out.println(
              "Unable to open file '" + 
              fileName + "'");                
      }
      catch(IOException ex) {
          System.out.println(
              "Error reading file '" 
              + fileName + "'");                  
          // Or we could just do this: 
          // ex.printStackTrace();
      }		
	}// end main
}
