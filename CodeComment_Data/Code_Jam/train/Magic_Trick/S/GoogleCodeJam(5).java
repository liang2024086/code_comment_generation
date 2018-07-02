package methodEmbedding.Magic_Trick.S.LYD1168;

import java.io.BufferedReader;  
import java.io.BufferedWriter;  
import java.io.File;  
import java.io.FileReader;  
import java.io.FileWriter;  
import java.io.IOException;  
import java.util.ArrayList;
 public class GoogleCodeJam {  
      
     static BufferedWriter writer;  
     static BufferedReader reader;  
      
     public static void main(String[] args) throws IOException {  
         
          
         
          /*framework
         *************************************************************************
         */
            File outFile = new File("src\\googlecodejam\\output2.out"); // outputfile  
           File inFile = new File("src\\googlecodejam\\A-small.in"); // input file 
           
           FileWriter fwriter = new FileWriter(outFile);  
           writer = new BufferedWriter(fwriter);  
           FileReader freader = new FileReader(inFile);  
           reader = new BufferedReader(freader);  
           ArrayList<Integer> list = new ArrayList<>();
           int[][] old_layout = new int[4][4];
           int[][] new_layout = new int[4][4];
           int numCases = Integer.parseInt(reader.readLine()); 
           //System.out.println(numCases);
           // looping on number of cases  
           for (int i = 1; i < numCases+1; ++i) {  
           //reading all the lines
           int row1 = Integer.parseInt(reader.readLine()) - 1;
           String line1 = reader.readLine();
           String line2 = reader.readLine();
           String line3 = reader.readLine();
           String line4 = reader.readLine();
           int row2 = Integer.parseInt(reader.readLine()) - 1;
           String new_line1 = reader.readLine();
           String new_line2 = reader.readLine();
           String new_line3 = reader.readLine();
           String new_line4 = reader.readLine();
           
           //processing input
           String line1_array[] = line1.split("\\s+");
               String line2_array[] = line2.split("\\s+");
               String line3_array[] = line3.split("\\s+");
               String line4_array[] = line4.split("\\s+");
               String new_line1_array[] = new_line1.split("\\s+");
               String new_line2_array[] = new_line2.split("\\s+");
               String new_line3_array[] = new_line3.split("\\s+");
               String new_line4_array[] = new_line4.split("\\s+");
           for(int y = 0;y < 4; y++){
               for(int x = 0;x < 4; x++){
               old_layout[0][x] = Integer.parseInt(line1_array[x]);
               old_layout[1][x] = Integer.parseInt(line2_array[x]);
               old_layout[2][x] = Integer.parseInt(line3_array[x]);
               old_layout[3][x] = Integer.parseInt(line4_array[x]);
               new_layout[0][x] = Integer.parseInt(new_line1_array[x]);
               new_layout[1][x] = Integer.parseInt(new_line2_array[x]);
               new_layout[2][x] = Integer.parseInt(new_line3_array[x]);
               new_layout[3][x] = Integer.parseInt(new_line4_array[x]);
               }//end of x for loop
           }//end of y for loop
          
           //System.out.println(old_layout[0][0]);
           for(int x = 0;x < 4; x++){
               for(int y = 0;y < 4; y++){
                   
                    if(old_layout[row1][x] == new_layout[row2][y]){
                    list.add(new_layout[row2][y]);
                    
                    //System.out.println(new_layout[y][row2]);
                    //System.out.println(list.get(0));
                    
                    }
                }      
           }
           System.out.println(list.size());
           if(list.size() == 1){
               writer.write("Case #" + i + ": " + list.get(0));
               
           }
           else if(list.isEmpty()){
               writer.write("Case #" + i + ": Volunteer cheated!");
               }
           else{
               writer.write("Case #" + i + ": Bad magician!");
               } 
           list.clear();
           writer.newLine();
           }//end of number of cases loop
           writer.close();
     
     
   }
 }
 
