package methodEmbedding.Counting_Sheep.S.LYD768;


import java.util.Arrays;
import java.util.Scanner;



/**
 *
 * @author MS
 */
public class msg {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        int r[] ={1,1,1,1,1,1,1,1,1,1};
        String res=Arrays.toString(r);
       
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
     for(int i=1;i<=T;i++){
           int d= sc.nextInt();
           int temp=0;
           int b[] = new int[10];
           for(int j=1;;j++){
               if (d==0){
                   System.out.println("Case #"+i+": INSOMNIA");
                   break;
               }
            temp=d*j;
            String st = String.valueOf(temp);
            char ch[] = st.toCharArray();
            for(int k=0;k<ch.length;k++){
             b[Character.getNumericValue(ch[k])] = 1;
            }
             if(res.equals(Arrays.toString(b))){
                   System.out.println("Case #"+i+": "+temp);
                   break;
           }
             
            
                   
               
           }
        }
    }
    
}
