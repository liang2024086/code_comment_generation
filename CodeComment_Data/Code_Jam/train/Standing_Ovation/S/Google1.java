package methodEmbedding.Standing_Ovation.S.LYD1695;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AKINDELE AKINYEMI
 */
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
public class Google1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String out ="";
        try{
        Scanner scanner= new Scanner(new File("A-small-attempt0.in"));
        
        int n = scanner.nextInt();
        //System.out.println(n);
        
        int i=0;
        for(int r=0; r<n; r++){
            
            String myline = scanner.next();
            String my2line = scanner.next();
            String number = String.valueOf(my2line);
            String[] digits2 = number.split("(?<=.)");
            int newfriends = 0;
            /*for(int k=0; k<digits2.length; k++){
                System.out.println(digits2[k]);
                int temp=Integer.parseInt(digits2[k]);
                if(temp == 0){
                    newfriends++;
                }
                
            }
            System.out.println("newfriends = "+ newfriends);
            
            //System.out.println(myline);
            //System.out.println(my2line);
                    */
            int standing = 0;
            
            for(int v=0; v<digits2.length; v++){
                
                if(standing >= v){
                    int temp =  Integer.parseInt(digits2[v]);
                    standing = standing + temp;
                }
                if(standing < v){
                    if(Integer.parseInt(digits2[v]) != 0){
                        int temp2 = v - standing;
                        newfriends = newfriends + temp2;
                        standing = standing + temp2;
                    }
                    if(standing >= v){
                    int temp =  Integer.parseInt(digits2[v]);
                    standing = standing + temp;
                    }
                }
                   
            }
            //System.out.println(newfriends);
            i++;
            out+= "case #" + i + ": " + newfriends + "\n";
            
        }
        
        }catch(Exception e){}
        try {   
                 File file = new File("A-small-attempt0.out");
                 PrintWriter output = new PrintWriter(file);                
                 output.write(out);  
                 output.close();   
		} 
		catch(Exception e){
			System.out.println("There is an error" + e.toString());
		}        
        
        
        
    }
    
}
