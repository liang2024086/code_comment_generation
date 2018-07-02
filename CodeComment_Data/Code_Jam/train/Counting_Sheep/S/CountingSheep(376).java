package methodEmbedding.Counting_Sheep.S.LYD1255;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Doug Bunyea
 */
public class CountingSheep {
    public static void main(String[]args){
    	File inputFile = new File("Users/dougbunyea1/Desktop/Programs/Eclipse Programs/countingsheepInput.txt");
        File outputFile = new File("Users/dougbunyea1/Desktop/Programs/Eclipse Programs/countingsheepOutput.txt");

        try {
            BufferedReader br = new BufferedReader(new FileReader(inputFile));
            BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile));
            
            int testCases= Integer.parseInt(br.readLine());
            
            
            
            for (int i=1;i<=testCases;i++){
                
                String inputN= br.readLine();
                
                int intN=Integer.parseInt(inputN);
                
                boolean done=false;
                
                int zero=0;
                int one=0;
                int two=0;
                int three=0;
                int four=0;
                int five=0;
                int six=0;
                int seven=0;
                int eight=0;
                int nine=0;
                
                
                if(inputN.equals("0")){
                    bw.write("Case #"+i+": "+"INSOMNIA");
                }
                else{
                
                    int k=1;
                while(!done){
                    
                    String N=String.valueOf(k*intN);
                    int lengthN=N.length();
                    
                    
                    
                
                 for (int j=0;j<lengthN;j++){
                   if( N.substring(j, j+1).equals("1") ){
                       one++;
                   }
                   else if( N.substring(j, j+1).equals("2") ){
                       two++;
                   }     
                   else if( N.substring(j, j+1).equals("3") ){
                       three++;
                   } 
                   else if( N.substring(j, j+1).equals("4") ){
                       four++;
                   }
                   else if( N.substring(j, j+1).equals("5") ){
                       five++;
                   }
                   else if( N.substring(j, j+1).equals("6") ){
                       six++;
                   }
                   else if( N.substring(j, j+1).equals("7") ){
                       seven++;
                   }
                   else if( N.substring(j, j+1).equals("8") ){
                       eight++;
                   }
                   else if( N.substring(j, j+1).equals("9") ){
                       nine++;
                   }
                   else if( N.substring(j, j+1).equals("0") ){
                       zero++;
                   }
                   
                }
                k++;
                
                //System.out.println(zero);
                    
                if(one>0 && two >0 && three >0 && four>0 && five>0 && six>0 && seven>0 && eight >0 && nine>0 && zero>0){
                   done=true;
                   bw.write("Case #"+i+": "+N);
                   
                } 
                    
                }
                
                }
                
                
                
                
                
                
             bw.newLine();
            }
            bw.close();
            br.close();

        } catch (IOException ex) {
            ex.printStackTrace();

        }
        
        
        
    }
    
}
