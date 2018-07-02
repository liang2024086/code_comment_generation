package methodEmbedding.Counting_Sheep.S.LYD773;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Problem1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        // TODO code application logic here
        File input=new File("input.txt");
        Scanner s=new Scanner(input);
        int i=0;
        int testCases=0;
        ArrayList<Integer> N=new ArrayList<>();
        while(s.hasNext()){
            if(i==0)
                testCases=Integer.valueOf(s.nextLine());
            else{
                N.add(Integer.valueOf(s.nextLine()));
            }
            i++;
        }
        System.out.println(N);
        ArrayList<String> output=new ArrayList<>();
        ArrayList<String> check=new ArrayList<>();
        
        for (int index=0;index<N.size();index++) {
            int N1=N.get(index);
            if(N1==0){
                output.add("Case #"+(index+1)+": "+"INSOMNIA");
                System.out.println(output);
            }
            else{
                check.clear();
                Boolean flag=true;
                int k=1;
                while(flag){
                    int newNumber=k*N1;
                    String newNum=String.valueOf(newNumber);
                    for(int l=0;l<newNum.length();l++){
                        if(!check.contains(String.valueOf(newNum.charAt(l)))){
                            check.add(String.valueOf(newNum.charAt(l))); 
                             if(check.size()==10){
                                String outputLine="Case #"+(index+1)+": "+newNumber;
                                output.add(outputLine);
                                
                                System.out.println(output);
                                flag=false;
                            }
                        }
                    } 
                      k++;
                }
            }
        }
        System.out.println("output size:" +output.size() );
        PrintStream out = new PrintStream(new FileOutputStream("OutFile.txt"));
        for(int l=0;l<output.size();l++){
            out.println(output.get(l));
        }
        
    }
    
}
