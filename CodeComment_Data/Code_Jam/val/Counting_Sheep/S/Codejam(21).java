package methodEmbedding.Counting_Sheep.S.LYD1226;



import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ILLUMINATI
 */
public class Codejam {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T=in.nextInt();
        int j=1;
        while(T-->0){
            String ans="";
           int[] ar=new int[10];
            int count=10;
            
            int n=in.nextInt();
            String num="";
            if (n==0) {
                num="INSOMNIA";
            }else{
                int i=1;
                while(count>0){
                    num=""+n*i;
                    for (int k = 0; k < 10; k++) {
                        if (ar[k]==0) {
                            if (num.contains(""+k)) {
                                ar[k]=1;
                                count-=1;
                            }
 
                        }
                    }
                    i++;
                }
            }
           
            System.out.println("Case #"+j+": "+num);
            j++;
        }
    }
    
}
