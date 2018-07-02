package methodEmbedding.Magic_Trick.S.LYD2022;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Rashmika Local
 */
public class CodeJam2014 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        BufferedReader br = null;
        
        try {
 
            String sCurrentLine;
            br = new BufferedReader(new FileReader("input.txt"));
            
            int i=0;
            int n=0;
            int[] row1nums = new int[4];
            int[] row2nums = new int[4];
            String[] answers = new String[1];
            
            int row1, row2;
            
            if ((sCurrentLine = br.readLine()) != null) {
                
                //Get the numbre of test cases
                if(i==0){
                   n=Integer.parseInt(sCurrentLine); 
                   answers = new String[n];
                }
                
                if(n>=1){
                    
                    //Loop through all the n text cases
                    for(int j=0; j<n; j++){
                        
                        //Read User input - row number
                        sCurrentLine = br.readLine();
                        row1 = Integer.parseInt(sCurrentLine); 
                        
                        String temp;
                        
                        if(row1 == 1){
                            temp = br.readLine();
                            br.readLine();
                            br.readLine();
                            br.readLine();
                        }else if(row1 ==2){
                            br.readLine();
                            temp = br.readLine();
                            br.readLine();
                            br.readLine();
                        }else if(row1 ==3){
                            br.readLine();
                            br.readLine();
                            temp = br.readLine();
                            br.readLine();
                        }else{
                            br.readLine();
                            br.readLine();
                            br.readLine();
                            temp = br.readLine();
                        }
                        
                        //Save the numbers in row1
                        String[] rowans = temp.split(" ");
                        row1nums[0] = Integer.parseInt(rowans[0]);
                        row1nums[1] = Integer.parseInt(rowans[1]);
                        row1nums[2] = Integer.parseInt(rowans[2]);
                        row1nums[3] = Integer.parseInt(rowans[3]);
                        
                        sCurrentLine = br.readLine();
                        row2 = Integer.parseInt(sCurrentLine);
                        
                        if(row2 == 1){
                            temp = br.readLine();
                            br.readLine();
                            br.readLine();
                            br.readLine();
                        }else if(row2 ==2){
                            br.readLine();
                            temp = br.readLine();
                            br.readLine();
                            br.readLine();
                        }else if(row2 ==3){
                            br.readLine();
                            br.readLine();
                            temp = br.readLine();
                            br.readLine();
                        }else{
                            br.readLine();
                            br.readLine();
                            br.readLine();
                            temp = br.readLine();
                        }
                        
                        //Save the numbers in row2
                        rowans = temp.split(" ");
                        row2nums[0] = Integer.parseInt(rowans[0]);
                        row2nums[1] = Integer.parseInt(rowans[1]);
                        row2nums[2] = Integer.parseInt(rowans[2]);
                        row2nums[3] = Integer.parseInt(rowans[3]);                        
                        
                        int counter = 0;
                        int value = -1;
                        
                        for(int k=0; k<4; k++){
                            for(int l=0; l<4; l++){                                
                                if( row1nums[k] == row2nums[l] ){
                                    counter++;
                                    value = row2nums[l];
                                }                                
                            }
                        }
                        
                        if(counter==0){
                            answers[j] = "Case #" + (j+1) + ": Volunteer cheated!";
                        }else if(counter==1){
                            answers[j] = "Case #" + (j+1) + ": " + value;
                        }else{
                            answers[j] = "Case #" + (j+1) + ": Bad magician!";
                        }
                        
                    }
                }
                
                for(int p=0; p<answers.length; p++){
                    System.out.println(""+answers[p]);
                }
                
            }
 
        } catch (IOException e) {
                e.printStackTrace();
        } finally {
                try {
                        if (br != null)br.close();
                } catch (IOException ex) {
                        ex.printStackTrace();
                }
        }
        
    }
    
}
