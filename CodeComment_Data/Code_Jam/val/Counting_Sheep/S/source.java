package methodEmbedding.Counting_Sheep.S.LYD739;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;


public class CountingSheep {
    public static void main(String args[]) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        for(int i=0;i<N;i++){
            
            int input=Integer.parseInt(br.readLine());
            Boolean flag=true;
            Boolean res=false;
            int last_number=0;
            HashMap<Integer,Boolean> hs=new HashMap<>();
            if(input==0)
                flag=false;
            else{
            for(int j=0;j<=9;j++)
                hs.put(j, false);
            for(int k=1;res==false;k++){
                last_number=k*input;
               
                String s=Integer.toString(last_number);
                for(int z=0;z<s.length();z++){
                    hs.put(Character.getNumericValue(s.charAt(z)), true);
                    
                }
                
                
                if(!hs.containsValue(false)){
                    res=true;
                } 
            }
            }
            if(flag)
            System.out.println("Case #"+(i+1)+": "+last_number);
            else
            System.out.println("Case #"+(i+1)+": INSOMNIA");   
        }
    }
}
