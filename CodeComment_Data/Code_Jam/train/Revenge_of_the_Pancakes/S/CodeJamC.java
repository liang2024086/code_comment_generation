package methodEmbedding.Revenge_of_the_Pancakes.S.LYD1063;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author Nima
 */
public class CodeJamC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception{
        // TODO code application logic here
        Scanner sc=new Scanner(new File("C:\\Users\\Nima\\Downloads\\B-small-attempt0.in"));
        int count=sc.nextInt();
        sc.nextLine();
        
        for (int i = 0; i < count; i++) {
            int sum=0;
            String line=sc.nextLine();
            if(line.contains("-")){
                line=line.substring(0,line.lastIndexOf("-")+1);
            }
            int counter=0;
            for (int j = 1; j < line.length(); j++) {
                if(line.charAt(j-1)!=line.charAt(j)){
                    sum++;
                }else{
                    counter++;
                }
            }
            if(counter==line.length()-1){
                if(line.startsWith("-")){
                    System.out.println("Case #"+(i+1)+": 1");
                }else{
                    System.out.println("Case #"+(i+1)+": 0");
                }
            }else{
                
                System.out.println("Case #"+(i+1)+": "+(sum+1));
            }
             
        }
       
    }
    
}
