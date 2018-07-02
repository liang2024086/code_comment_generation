package methodEmbedding.Speaking_in_Tongues.S.LYD1540;


   import java.util.*;

   public class A{
   
      public static void main(String a[]){
      
         char array[];
         char replace[] = 
               "yhesocvxduiglbkrztnwjpfmaq".toCharArray()
               ;
         
         Scanner s = new Scanner(System.in);			
      			
         int to = s.nextInt();
         s.nextLine();
         
         for(int i=0 ; i < to ; i++){
            array = s.nextLine().toCharArray();
            
            for(int j=0 ; j< array.length ; j++){
               
               if(array[j] != ' ')
                  array[j] = replace[array[j] - 'a'];
            }
            
            System.out.printf("Case #%d: ", i + 1);
            System.out.printf("%s\n", new String(array));
         }
      }
   }
