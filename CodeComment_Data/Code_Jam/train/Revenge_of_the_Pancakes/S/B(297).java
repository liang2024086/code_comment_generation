package methodEmbedding.Revenge_of_the_Pancakes.S.LYD967;


import java.io.File;
import java.io.FileInputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class B {
    static {
        try {
            System.setIn(new FileInputStream(new File("B-small-attempt0.in")));
        }
        catch(Exception e){
            System.err.println("Error setting input");
        }
        try {
            System.setOut(new PrintStream(new File("B-small-attempt0.out")));
        }
        catch(Exception e){
            System.err.println("Error setting output");
        }
    }
    public static void main(String[]args)throws Exception{
        Scanner sc = new Scanner(System.in);
        int cases = Integer.parseInt(sc.nextLine());

        for(int c=1;c<=cases;++c){
            String str =sc.nextLine().trim();
            char[]ary = str.toCharArray();
            int count = 0;
            boolean minus=(ary[0]=='-');
            for(int i=0;i<ary.length;++i){
                if(minus){
                    if(ary[i]=='-'){
                        continue;
                    }
                    else{//+
                        count++;
                        minus = false;
                    }
                }
                else{//collecting pluses
                    if(ary[i]=='-'){
                        count++;
                        minus=true;
                    }
                    else{//+
                        continue;
                    }
                }

            }
            if(ary[ary.length-1]=='-')
                count++;
            System.out.println("Case #"+c+": "+count);



        }
    }
}
