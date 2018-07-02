package methodEmbedding.Speaking_in_Tongues.S.LYD538;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author seadof
 */
public class Dashboard {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Dash dash  = new Dash();
	Scanner scan;
	FileReader read;
	
	
	List<String> eachline= new LinkedList<String>();
        String output="";
	int i=0;
	
	try{
	
	 read = new FileReader(new File("C:\\Users\\seadof\\Documents\\NetBeansProjects\\Dashboard\\src\\dashboard\\A-small-attempt2.in"));
	 scan = new Scanner(read);
	 while (scan.hasNextLine()){
             String s = scan.nextLine();
		 eachline.add(s);
		
	 }	 
	scan.close(); 
	 
	}catch(FileNotFoundException exe){
		System.out.print("Can locate file specified");
	}
	
	
	for(int a=1 ; a < eachline.size() ; ++a){
            String str = eachline.get(a);
             output+="Case #"+(a)+": ";
            for (int d = 0 ; d < str.length() ; d++){
                           
                output+=dash.getChatEqv(str.charAt(d));
            }
            output+="\n";
        }
        
        try{
        File file2 = new File("C:\\Users\\seadof\\Documents\\NetBeansProjects\\Dashboard\\src\\dashboard\\output.out");
        FileWriter fw = new  FileWriter(file2);
        fw.write(output);
        fw.close();
        }catch(IOException ioe){
            ioe.printStackTrace();
        }
        }
        
        
	
    }

