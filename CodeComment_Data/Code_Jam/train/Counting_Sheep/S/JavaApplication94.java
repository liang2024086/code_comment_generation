package methodEmbedding.Counting_Sheep.S.LYD86;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author ibadia
 */

public class JavaApplication94 {

    /**
     * @param args the command line arguments
     */
   
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        FileReader fileReader = 
                new FileReader("input1.in");
        PrintWriter writer = new PrintWriter("output.txt", "UTF-8");
int caseno=1;
            // Always wrap FileReader in BufferedReader.
            BufferedReader bufferedReader = 
                new BufferedReader(fileReader);
        String line;
            line=bufferedReader.readLine();
            while((line = bufferedReader.readLine()) != null) {
             //   System.out.println(line);
             int n=Integer.parseInt(line);
             int finalans=0;
             int originaln=Integer.parseInt(line);
              //  System.out.println(n);
                int len=line.length();
                int Arr[]=new int[10];
                int multiplier=2;
                String newline=line;
               // System.out.println(newline);
                int secondcount=0;
                for(int i=0; i<10; i++)Arr[i]=0;
                int count=0;
                for(int i=0; i<10000; i++){//System.out.println(newline);
                    for(int j=0; j<newline.length(); j++){
                        char A=newline.charAt(j);
                        int number=Character.getNumericValue(A);
                    //    System.out.println(number);
                        Arr[number]=1; 
                    }
                    count=0;
                    for(int a=0; a<Arr.length; a++){
                        if(Arr[a]==1){
                            count++;
                        }
                    }
                    secondcount+=1;
                    if(count==Arr.length){
                    //    System.out.println(i);
                        break;
                    }
                    
                    n=originaln*multiplier;
                    finalans=n;
                    multiplier+=1;
                    newline=n+"";
                    
                    
                }
                String str="Case #";
                
                if(count!=10 ){
                    String Toprint=str+caseno+": INSOMNIA";
                    writer.println(Toprint);
                    
                }else{
                    String Toprint1=str+caseno+": "+finalans;
                    writer.println(Toprint1);
                }
                
                caseno++;
              
            }   
            writer.close();

    }
    
}
