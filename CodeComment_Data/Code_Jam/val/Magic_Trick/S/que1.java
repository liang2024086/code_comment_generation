package methodEmbedding.Magic_Trick.S.LYD664;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

            //read inputs from file
            //no of test casses in loop
            //first choice in fchoice
            //go directly to the row of choice
            //put it in array, say arr1
            //second choice in schoice
            //go directly to that choice
            //put it in arr2
            // compare those arrays
            //if count == 1 output the number
            // count >= 2 "Bad Magician"
            // count==0 "Volunteer cheated"

/**
 *
 * @author dell
 */
public class que1 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
                   
        BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\dell\\Documents\\NetBeansProjects\\java8\\codejam2014\\src\\file.txt"));
        String line = null;//String inter = null;
        line = reader.readLine();
        int loop = Integer.parseInt(line);int x=0;
        int count = 0; int result = 0;String[] arr;String[] arr1 = null;
        while(loop!=0){
            int end = 0;
            x++;
            line = reader.readLine();
            int fchoice = Integer.parseInt(line);
            while(fchoice!=0){
                line = reader.readLine();
                fchoice--;
            }
            
            arr = line.split(" ");
            
            //System.out.println(line);
            while(line.length()!=1){
                line = reader.readLine();
            }
            int schoice = Integer.parseInt(line);
            //System.out.println(schoice);
            
            while(schoice!=0){
                line = reader.readLine();
                schoice--;
                end++;
            }            
            //System.out.println(line);
            arr1 = line.split(" ");
            for(int i=0;i<arr.length;i++){
                for(int j=0;j<arr1.length;j++){
                    if(Integer.parseInt(arr[i])==Integer.parseInt(arr1[j])){
                    count++;
                    result = Integer.parseInt(arr[i]);
                        //System.out.println(count);
                        //System.out.println(result);
                }
              }                
            }
            //System.out.println(count);
            if(count==1){
                System.out.println("Case #"+x+": "+result);
            }
            else if(count>1){
                System.out.println("Case #"+x+": Bad magician!");
            }
            else if(count==0){
                System.out.println("Case #"+x+": Volunteer cheated!");
            }
            end = 4-end;
            while(end!=0){
                end--;
                line = reader.readLine();
            }
            count =0;
            loop--;
        }  
    }
    
}
