package methodEmbedding.Cookie_Clicker_Alpha.S.LYD884;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dell
 */
public class que2 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // take the input, put it in loop
        // put the next lines inn respective C, F, X positions
        // calculate the min time in which we can reach X pts
        int x1 = 0;
        BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\dell\\Documents\\NetBeansProjects\\java8\\codejam2014\\src\\file.txt"));
        String line = null;//String inter = null;
        line = reader.readLine();
        int loop = Integer.parseInt(line);
        double c,f,x;
        //Stack<Double> st = new Stack<>();
        String [] arr = null;       
        double result = 0,prev = 0,curr = 0;
        while (loop!=0){
            arr = reader.readLine().split(" ");         
            x1++;  
            c = Double.parseDouble(arr[0]);
            f = Double.parseDouble(arr[1]);
            x = Double.parseDouble(arr[2]);
                                 
            for(int farmno=0;;farmno++){
                
                result += x/(2+farmno*f);
                for(int j=0;j<farmno;j++){
                    result += c/(2+f*j);           
                }
                
                curr = result;
                if(farmno!=0&&curr>prev){                    
                    break;
                }
                prev = curr;               
                result =0;
            }
            System.out.print("Case #"+x1+": ");
            System.out.printf("%.7f",prev);
            System.out.println("");
            prev = curr = result =0;
            loop--;
        }
        
    }
    
}
