package methodEmbedding.Revenge_of_the_Pancakes.S.LYD954;



import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: WANG
 * Date: 4/9/16
 * Time: 12:23 PM
 * To change this template use File | Settings | File Templates.
 */
public class qr2 {
    public static void main(String[] args) {
        try {
            Scanner input=new Scanner(new File(args[0]));
            PrintWriter output=new PrintWriter(args[1]) ;

            int casenumber = input.nextInt();
            input.nextLine();
            for(int i=0;i<casenumber;i++){
                char[] stack=input.nextLine().toCharArray();
                char pre='+';
                int result=0;
                for(int j=stack.length-1;j>=0;j--)   {
                    if(stack[j]!=pre){
                        result++;
                        pre = stack[j];
                    }

                }


                    output.println("Case #" + (i + 1) + ": "+result );


            }
            output.flush();
        } catch (Exception e){

        }
    }
}
