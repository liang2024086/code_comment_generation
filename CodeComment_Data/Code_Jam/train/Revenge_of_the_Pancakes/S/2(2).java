package methodEmbedding.Revenge_of_the_Pancakes.S.LYD295;

import java.io.*;

class demo {
    public static void main(String args[]) throws IOException{
       BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
       int test = Integer.parseInt(br.readLine());
       
       for(int t=1; t<=test; t++){
            String str=br.readLine();
            int n=str.length();
            int count=0;
            if(n==1){
                if(str.charAt(0)=='+'){
                    System.out.println("Case #"+t+": "+"0");
                }
                else{
                    System.out.println("Case #"+t+": "+"1");
                }
            }
            else{
                for(int i=1;i<n;i++){
                    if(str.charAt(i)!=str.charAt(i-1)){
                        count++;
                    }
                }
                if(str.charAt(n-1)=='-'){
                    count++;
                }
                System.out.println("Case #"+t+": "+count);
            }   
            
       }
    }
    
}
