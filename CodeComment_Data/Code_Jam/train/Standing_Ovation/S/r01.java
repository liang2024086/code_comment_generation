package methodEmbedding.Standing_Ovation.S.LYD998;



import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: WANG
 * Date: 4/10/15
 * Time: 8:50 PM
 * To change this template use File | Settings | File Templates.
 */
public class r01 {
    public static void main(String[] args) {
        try {

            Scanner input=new Scanner(new File(args[0]));
            PrintWriter output=new PrintWriter(args[1]) ;
            int casenumber = input.nextInt();
            for(int i=0;i<casenumber;i++){
                int audNum = 0, smax=input.nextInt(),total=0;
                String level = input.next();
                for(int j=0;j<smax+1;j++){
                    int curnum=level.charAt(j)-'0';
                    if(total<j){
                        audNum = Math.max(audNum,j-total);
                    }
                    total+=curnum;
                }
                output.println("Case #"+(i+1)+": "+audNum);
            }
            output.flush();
        }catch(FileNotFoundException e){}

    }
}

