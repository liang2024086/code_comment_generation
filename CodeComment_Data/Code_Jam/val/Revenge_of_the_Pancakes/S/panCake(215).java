package methodEmbedding.Revenge_of_the_Pancakes.S.LYD1023;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class panCake {
    
public static void main(String[] args)throws IOException{

    BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
    int t;
    t=Integer.parseInt(br.readLine());
    int caseN = 1;
    while(t!=0){
    
    String data=br.readLine();
    
    
    int flip =0;
    
        
        
        char[] temp=data.toCharArray();
            
        for(int i=temp.length-1;i>=0;i--){
        
            
            if(temp[i] == '-'){
            flip++;
                for(int k=0;k<=i;k++){
                
                if(temp[k] == '+'){
                    temp[k]='-';
                }else {
                    temp[k]='+';
                }
                
                }
                
            }
        }
    
    
        System.out.println("Case #"+caseN+": "+flip);
        caseN++;
    t--;
    }
    

}

}
