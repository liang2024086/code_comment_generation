package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1103;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
/**
 *
 * @author Alveron
 */
public class Cookie {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
    int number;    
    int count = 1;  
    String[] numbers;
     double current = 2.0;
        double c = 500.0;
        double f = 4.0;
        double x = 2000.0;
        double temp = 0;
        double total = 0;
        double temp2 = 0;
        boolean check = true;
        
  
  try
  {
  FileInputStream in = new FileInputStream("test.txt");
  BufferedReader br = new BufferedReader(new InputStreamReader(in));
  String strLine;
 
 /* while((strLine = br.readLine())!= null)
  {
   System.out.println(strLine);
  }*/
  
  strLine = br.readLine();
  number = Integer.parseInt(strLine);     
  while(count < number+1)
  {
      strLine = br.readLine();
      String delims = "[ ]+";
      numbers = strLine.split(delims);
      c = Double.parseDouble(numbers[0]);
      f = Double.parseDouble(numbers[1]);
      x = Double.parseDouble(numbers[2]);
      
       while(check)
       {
            temp = c/current;
            
            total += temp;
            if( (x-c)/current  <(x)/(current+f))
            {                        
                temp2 = (x-c)/current;
                total +=  temp2;
                check = false;
            }
            
            current = current + f;
            
    
        }
      System.out.println("Case #"+count +": " + total);  
      current = 2.0;
      check = true;
      count++;
      total = 0;
  }
  
  }catch(Exception e){
   System.out.println(e);
  }
        
        
   
        
        
        
        
        
        
       
        

        
    
      
    
    
    }
        
        
}

