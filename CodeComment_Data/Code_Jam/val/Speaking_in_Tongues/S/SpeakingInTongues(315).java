package methodEmbedding.Speaking_in_Tongues.S.LYD304;



import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


/**
 *
 * @author Mudasar  */
public class SpeakingInTongues {
    
    static String strLine =null;
 static String result="" ;
    
 public static void main(String[] args) {
  
     try {
        
         FileInputStream fstream = new FileInputStream("textfile.in");
         // Get the object of DataInputStream
         DataInputStream in = new DataInputStream(fstream);
         BufferedReader br = new BufferedReader(new InputStreamReader(in));
         FileWriter ifstream = new FileWriter("out.txt");
         BufferedWriter out = new BufferedWriter(ifstream);


         int resultCounter = 0;
         
         while ((strLine = br.readLine()) != null) {
        	 if (resultCounter == 0) {
        		 resultCounter = 1;
        		 continue;
        	 }

        	 StringTokenizer st = new StringTokenizer(strLine, " ");
        	 int count = st.countTokens();
        	 //System.out.println(count);
        	 String[] record = new String[st.countTokens()];
        	 for (int i = 0; i < count; i++) {
        		 record[i] = st.nextToken();

        	 }
        	 for (int i = 0; i < count ; i++) {
        		
        		 	 String str =  record[i];
        		 	for(int j = 0 ; j< str.length(); j++)
           		 {			char chr =	str.charAt(j);
        		 	 switch(chr){
        			 case 'a':
        				 result += 'y';
        				 break;
        			 case 'b':
        				 result += 'h';
        				 break;
        			 case 'c':
        				 result += 'e';
        				 break;
        			 case 'd':
        				 result += 's';
        				 break;
        			 case 'e':
        				 result += 'o';
        				 break;
        			 case 'f':
        				 result += 'c';
        				 break;
        			 case 'g':
        				 result += 'v';
        				 break;
        			 case 'h':
        				 result += 'x';
        				 break;
        			 case 'i':
        				 result += 'd';
        				 break;
        			 case 'j':
        				 result += 'u';
        				 break;
        			 case 'k':
        				 result += 'i';
        				 break;
        			 case 'l':
        				 result += 'g';
        				 break;
        			 case 'm':
        				 result += 'l';
        				 break;
        			 case 'n':
        				 result += 'b';
        				 break;
        			 case 'o':
        				 result += 'k';
        				 break;
        			 case 'p':
        				 result += 'r';
        				 break;
        			 case 'q':
        				 result += 'z';
        				 break;
        			 case 'r':
        				 result += 't';
        				 break;
        			 case 's':
        				 result += 'n';
        				 break;
        			 case 't':
        				 result += 'w';
        				 break;
        			 case 'u':
        				 result += 'j';
        				 break;
        			 case 'v':
        				 result += 'p';
        				 break;
        			 case 'w':
        				 result += 'f';
        				 break;
        			 case 'x':
        				 result += 'm';
        				 break;
        			 case 'y':
        				 result += 'a';
        				 break;
        			 case 'z':
        				 result += 'q';
        				 break;
        			 case 'A':
        				 result += 'Y';
        				 break;
        			 case 'B':
        				 result += 'H';
        				 break;
        			 case 'C':
        				 result += 'E';
        				 break;
        			 case 'D':
        				 result += 'S';
        				 break;
        			 case 'E':
        				 result += 'O';
        				 break;
        			 case 'F':
        				 result += 'C';
        				 break;
        			 case 'G':
        				 result += 'V';
        				 break;
        			 case 'H':
        				 result += 'X';
        				 break;
        			 case 'I':
        				 result += 'D';
        				 break;
        			 case 'J':
        				 result += 'U';
        				 break;
        			 case 'K':
        				 result += 'I';
        				 break;
        			 case 'L':
        				 result += 'G';
        				 break;
        			 case 'M':
        				 result += 'L';
        				 break;
        			 case 'N':
        				 result += 'B';
        				 break;
        			 case 'O':
        				 result += 'K';
        				 break;
        			 case 'P':
        				 result += 'R';
        				 break;
        			 case 'Q':
        				 result += 'Z';
        				 break;
        			 case 'R':
        				 result += 'T';
        				 break;
        			 case 'S':
        				 result += 'N';
        				 break;
        			 case 'T':
        				 result += 'W';
        				 break;
        			 case 'U':
        				 result += 'J';
        				 break;
        			 case 'V':
        				 result += 'P';
        				 break;
        			 case 'W':
        				 result += 'F';
        				 break;
        			 case 'X':
        				 result += 'M';
        				 break;
        			 case 'Y':
        				 result += 'A';
        				 break;
        			 case 'Z':
        				 result += 'Q';
        				 break;
        			 default :
        				 break;
        			 }
        		 	 
        		 }
        		 	result += " ";
        	 }
             String output = "Case #" + resultCounter + ": " + result + "\n";
             System.out.println("Case #" + resultCounter + ": " + result);
             try {
                
                 out.write(output);
                

             } catch (Exception e) {
                 System.err.println("Error: " + e.getMessage());
             }
             result ="";
             resultCounter++;
         }
         
         in.close();
         out.close();
     } catch (Exception e) {// Catch exception if any
         System.err.println("Error: " + e.getMessage());
     }
 }
}
