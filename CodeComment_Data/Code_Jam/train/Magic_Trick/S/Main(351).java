package methodEmbedding.Magic_Trick.S.LYD1634;



import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author rahulraghavan
 */
public class Main {
    public static void main(String ar[]){
      
      
        Scanner s=new Scanner(System.in);
        int test=s.nextInt();
        int index=0;
        while(test>0){
            index++;
          int number[][]=new int[4][4];
        int row1=s.nextInt();
        List<Integer> firstRowValues=new ArrayList<>();
        for (int i = 0; i < number.length; i++) {
            for (int j = 0; j < number[i].length; j++) {
                number[i][j]=s.nextInt();
                if(row1==(i+1)){
                    firstRowValues.add(number[i][j]);
                    
                }
                
            }
            
        }
        
       
        
            int row2=s.nextInt();
             int secondtrick[][]=new int[4][4];
            List<Integer> secondRowValue=new ArrayList<>();
        for (int i = 0; i < number.length; i++) {
            for (int j = 0; j < number[i].length; j++) {
                secondtrick[i][j]=s.nextInt();
                if(row2==(i+1)){
                    
                    secondRowValue.add(secondtrick[i][j]);
                }
                
            }
            
            
        }
        
        
       
        
        int match=0;
        int element=0;
          for (int i = 0; i < firstRowValues.size(); i++) {
              for (int j = 0; j < secondRowValue.size(); j++) {
                if(firstRowValues.get(i)==secondRowValue.get(j)){
                  element=firstRowValues.get(i);
                match++;
                break;
            }
                  
              }
            
            
        }
        if(match==1){
            
            System.out.println("Case #"+(index)+": "+element);
        }else{
            
            if(match>1){
                
                // Case #2: Bad magician!
                System.out.println("Case #"+(index)+": "+"Bad magician!");
            }else{
                
                System.out.println("Case #"+(index)+": "+"Volunteer cheated!");
            }
        }
        
        
        test--;
        } 
    }
        
}
