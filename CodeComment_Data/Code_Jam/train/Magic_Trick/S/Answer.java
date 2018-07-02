package methodEmbedding.Magic_Trick.S.LYD44;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Answer {
    public static void main(String[] args){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n=0;
        int arr[] = null;
        String row[]=null;
        String rowString=null;
        
        try{
        String s=br.readLine();
        
        n=Integer.parseInt(s);
        arr=new int[n];
        int select;
        for(int k=0;k<n;k++){
             select=Integer.parseInt(br.readLine());
              for(int m=1;m<=4;m++){
                  s=br.readLine(); 
                  if(m==select){
                      row=s.split(" ");
                  }                
              }            
              select=Integer.parseInt(br.readLine());
       
               for(int m=1;m<=4;m++){
                    s=br.readLine();
                  if(m==select){
                      rowString=s;
                  }
               }
              for(int j=0;j<4;j++){                  
                      if(rowString.contains(row[j])){
                          if(arr[k]==0){
                             arr[k]=Integer.parseInt(row[j]);
                          }else{
                             arr[k]=-1;
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
             }else if(arr[k]==-1){
                System.out.println("Case #"+(k+1)+": "+"Bad magician!"); 
             }else{
                System.out.println("Case #"+(k+1)+": "+arr[k]); 
             }
             
        }           
	}    
}
