package methodEmbedding.Standing_Ovation.S.LYD2104;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class googlesample1{
	  /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String out ="";
        try{
        Scanner scanner= new Scanner(new File("A-small-attempt0.in"));
        
        int n = scanner.nextInt();
        
        int p=0;
        for(int a=0; a<n; a++){  
        String testCase = scanner.next();
        String line = scanner.next();   
        String dataset = String.valueOf(line);
        String[] testNumber = dataset.split("");
        
        
        int additions = 0;
        int clap = 0;
        for(int i=0; i<testNumber.length; i++){
                
                if(clap >= i){
                    int temp =  Integer.parseInt(testNumber[i]);
                    clap += temp;
                }
                if(clap < i){
                    if(Integer.parseInt(testNumber[i]) != 0){
                        int temp2 = i - clap;
                        additions = additions + temp2;
                        clap += temp2;
                    }
                    if(clap >= i){
                    int temp =  Integer.parseInt(testNumber[i]);
                    clap += temp;
                    }
                }
                   
            }
       	p++;
            out+= "case #" + p + ": " + additions + " \n";
            
        }
        
        }catch(Exception e){}
        try {   
                 File file = new File("A-small-attempt0.out");
                 PrintWriter output = new PrintWriter(file);                
                 output.write(out);  
                 output.close();   
		} 
		catch(Exception e){
			System.out.println("Error" + e.toString());
		}        
        
        
        
    }
    
}
