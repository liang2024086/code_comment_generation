package methodEmbedding.Counting_Sheep.S.LYD114;




import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class qr1 {
    public static void main(String[] args) {
        try {
            Scanner input=new Scanner(new File(args[0]));
            PrintWriter output=new PrintWriter(args[1]) ;
            int casenumber = input.nextInt();
            for(int i=0;i<casenumber;i++){
                long n=input.nextLong();
                if(n==0){
                    output.println("Case #" + (i + 1) + ": INSOMNIA" );
                } else {
                    int k=0, ten =( 1<<10)-1;
                    long j=n;
                    for(;k!=ten;j+=n){
                        long h = j;
                        while(h>0){
                            k|=1<<(h%10);
                            h/=10;
                        }
                    }
                    output.println("Case #" + (i + 1) + ": " +(j-n));
                }

            }
            output.flush();
        } catch (Exception e){

        }
    }
}
