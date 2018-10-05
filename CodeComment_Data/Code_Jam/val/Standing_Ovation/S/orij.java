package methodEmbedding.Standing_Ovation.S.LYD2220;




import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
public class orij {


    public static void main(String[] args) {
        
        
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
            
            int standing = 0;
            
            for(int level = 0; level < digits2.length; level++){
                
                if(standing >= level){
                    int temp =  Integer.parseInt(digits2[level]);
                    standing = standing + temp;
                }
                if(standing < level){
                    if(Integer.parseInt(digits2[level]) != 0){
                        int temp2 = level - standing;
                        newfriends = newfriends + temp2;
                        standing = standing + temp2;
                    }
                    if(standing >= level){
                    int temp =  Integer.parseInt(digits2[level]);
                    standing = standing + temp;
                    }
                }
                   
            }
            
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
			System.out.println("Error occur" + e.toString());
		}        
        
        
        
    }//end of main method
    
}//end of class orij
