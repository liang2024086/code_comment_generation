package methodEmbedding.Magic_Trick.S.LYD1285;

/* Name   : A.C.Johnnirajh
   Reg.No :100229K */


import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author Nirajh
 */
public class Solution {
    public static void main(String[] args){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n=0;
        int arr[] = null;
        String selecRow1[]=new String[4];
        String selecRow2[]=new String[4];
        
        try{
        String s=br.readLine();
        
        n=Integer.parseInt(s);
        arr=new int[n];
        int select;
        for(int k=0;k<n;k++){
             select=Integer.parseInt(br.readLine());
             //System.out.println(s);
              for(int m=1;m<=4;m++){
                  s=br.readLine(); 
                  if(m==select){
                      selecRow1=s.split(" ");
                  }
                 
              }
           
              
              select=Integer.parseInt(br.readLine());
             
             //System.out.println(s);
               for(int m=1;m<=4;m++){
                    s=br.readLine();
                  if(m==select){
                      selecRow2=s.split(" ");
                  }
               }
              for(int j=0;j<4;j++){
                  for(int l=0;l<4;l++){
                      if(selecRow1[j].equals(selecRow2[l])){
                          if(arr[k]==0){
                             arr[k]=Integer.parseInt(selecRow1[j]);
                          }else{
                             arr[k]=-99;
                          }
                      }
                  }
              }
             
        }
        }
        catch(Exception e){
            System.out.println(e);
        }
        for(int k=0;k<n;k++){
             if(arr[k]==0){
                
                System.out.println("Case #"+(k+1)+": "+"Volunteer cheated!"); 
             }else if(arr[k]==-99){
                System.out.println("Case #"+(k+1)+": "+"Bad magician!"); 
             }else{
                System.out.println("Case #"+(k+1)+": "+arr[k]); 
             }
             
        }
        //System.out.println(position(17));
            
}
    
}
