package methodEmbedding.Speaking_in_Tongues.S.LYD1067;

import java.util.*;
import java.io.*;
public class GCJ1{
  
  
  public static void main(String args[])throws Exception{
    
    Scanner Input = new Scanner(new File("A-small-attempt1.in"));
//    Scanner Input = new Scanner(System.in);
    
    int TC = Input.nextInt();
    
    String Total;
    
    char [] Data;
    
    String Output;
    Input.nextLine();
    for(int i = 0; i<TC; i++){
      
      Output = "";
      
      Total = Input.nextLine();
      
      Data = Total.toCharArray();
      
      for(int j = 0; j<Data.length; j++){
        
        if(Data[j] == ' '){
          Output = Output + ' ';
        }
        else if(Data[j] == 'a'){
          Output = Output + 'y';
        }
        else if(Data[j] == 'b'){
          Output = Output + 'h';
        }
        else if(Data[j] == 'c'){
          Output = Output + 'e';
        }
        else if(Data[j] == 'd'){
          Output = Output + 's';
        }
        else if(Data[j] == 'e'){
          Output = Output + 'o';
        }
        else if(Data[j] == 'f'){
          Output = Output + 'c';
        }
        else if(Data[j] == 'g'){
          Output = Output + 'v';
        }
        else if(Data[j] == 'h'){
          Output = Output + 'x';
        }
        else if(Data[j] == 'i'){
          Output = Output + 'd';
        }
        else if(Data[j] == 'j'){
          Output = Output + 'u';
        }
        else if(Data[j] == 'k'){
          Output = Output + 'i';
        }
        else if(Data[j] == 'l'){
          Output = Output + 'g';
        }
        else if(Data[j] == 'm'){
          Output = Output + 'l';
        }
        else if(Data[j] == 'n'){
          Output = Output + 'b';
        }
        else if(Data[j] == 'o'){
          Output = Output + 'k';
        }
        else if(Data[j] == 'p'){
          Output = Output + 'r';
        }
        else if(Data[j] == 'q'){
          Output = Output + 'z';
        }
        else if(Data[j] == 'r'){
          Output = Output + 't';
        }
        else if(Data[j] == 's'){
          Output = Output + 'n';
        }
        else if(Data[j] == 't'){
          Output = Output + 'w';
        }
        else if(Data[j] == 'u'){
          Output = Output + 'j';
        }
        else if(Data[j] == 'v'){
          Output = Output + 'p';
        }
        else if(Data[j] == 'w'){
          Output = Output + 'f';
        }
        else if(Data[j] == 'x'){
          Output = Output + 'm';
        }
        else if(Data[j] == 'y'){
          Output = Output + 'a';
        }
        else if(Data[j] == 'z'){
          Output = Output + 'q';
        }
        
      }
      System.out.println("Case #" + (i + 1) + ": " + Output);
    }
    
    
    
  }
  
}
