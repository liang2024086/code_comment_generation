package methodEmbedding.Revenge_of_the_Pancakes.S.LYD501;



import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author ILLUMINATI
 */
public class Codejam{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
        int T=in.nextInt();
        int j=1;
        while(T-->0){
           int num=0;
            String str=in.next();
            int len=str.length();
            boolean check=true;
            boolean check1=true;
            for (int i = 0; i <len; i++) {
                if (str.charAt(i)=='-') {
                    while((i+1<len) &&(str.charAt(i+1)=='-')){
                        if (i==0) {
                            check=false;
                        }
                        i++;
                    }
                    
                    if ((check1==true && check==false)  || i==0) {
                        check1=false;
                        num+=1;
                    }else{
                        num +=2;
                    }
                }
            }
            
            System.out.println("Case #"+j+": "+num);
            j++;
        }
    }
    
}
