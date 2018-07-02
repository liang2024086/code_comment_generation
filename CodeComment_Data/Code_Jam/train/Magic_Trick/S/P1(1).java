package methodEmbedding.Magic_Trick.S.LYD1639;


import java.util.Scanner;
class P1
{

    public static void main(String args[])
    {
        int T;       
           Scanner scanner = new Scanner(System.in);

      //  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int I=0;   
        int tmp=0;
           T= scanner.nextInt();
           while(T>0)
           {
              int input1[] = new int[4]; 
              int input2[] = new int[4];
         
              int n1 = scanner.nextInt();
          
               for( int i=0; i<4 ; i++)
               {
                   for( int j=0; j<4 ; j++)
                   {
                      if(i==(n1-1))
                      {
                             input1[j] = scanner.nextInt();
               
                      }
                      else
                      {
                             tmp = scanner.nextInt();
               
                      }       
                   }  
                
    		   }  
              
              int n2 = scanner.nextInt();
          
               for( int i=0; i<4 ; i++)
               {
                   for( int j=0; j<4 ; j++)
                   {
                      if(i==(n2-1))
                      {
                             input2[j] = scanner.nextInt();

                         }
                      else
                      {
                             tmp = scanner.nextInt();
                    
                      }       
                   }  
                
    		   }  
        
               int count=0;
               int val =0;
          
        
        
               for(int k=0;k<4;k++)
               {
                  for(int f=0;f<4;f++)
                  {
                     if(input1[k] == input2[f])
                     {   count++;
                        val=input1[k];
                     }
                  }
               } 
 
             I++;
             if(count==1)
                System.out.println("Case #"+ I +": "+ val);
             else if (count ==0)
                System.out.println("Case #"+ I +": Volunteer cheated!");
             else
                System.out.println("Case #"+ I +": Bad magician!");
           
      		   T--;
      		   
           }
 
        

    
    }


}
