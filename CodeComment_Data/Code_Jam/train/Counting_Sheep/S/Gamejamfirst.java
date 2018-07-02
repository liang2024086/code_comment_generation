package methodEmbedding.Counting_Sheep.S.LYD613;


// Author: Sandip Subedi

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;


public class Gamejamfirst {

    public static void main(String[] args) throws FileNotFoundException {
        
        File file = new File("numers.txt");


        Scanner scan = new Scanner(file);
        
        
        
        int length = scan.nextInt();
        
        
        HashSet<Integer> list = new HashSet<>();
        
        
        for(int i=1;i<length+1;i++){
            
            
            
         
            
            list = new HashSet<>();
            int temp = scan.nextInt();
            
            if(temp <1){         
                   
            System.out.println("Case #" + i + ": INSOMNIA" );
           //  break;
                
            }
            
            
            boolean bool = false;
            
            
            int count = 1;            
            while(bool!=true){
                
                int mul = count*temp;
                
               //  list.add(mul);
                
                String mulStr =  mul+"";
                
                if(mulStr.contains("0")){
                    list.add(0);
                }
                if(mulStr.contains("1")){
                    list.add(1);
                }
                if(mulStr.contains("2")){
                    list.add(2);
                }
                if(mulStr.contains("3")){
                    list.add(3);
                }
                if(mulStr.contains("4")){
                    list.add(4);
                }
                if(mulStr.contains("5")){
                    list.add(5);
                }
                if(mulStr.contains("6")){
                    list.add(6);
                }
                if(mulStr.contains("7")){
                    list.add(7);
                }
                if(mulStr.contains("8")){
                    list.add(8);
                }
                if(mulStr.contains("9")){
                    list.add(9);
                }
                        
                
                
                count++;
                
                 if(list.size()> 9){
                System.out.println("Case #" + i + ": " + mul);
              //   System.out.println("Breaking");
                    break;   
                 }
                
                if(count > 200){
                    bool = true;
                }
            }
            
           
            
            
            
            
        }
        
        
        
        

            


        
        
       
    }

}
