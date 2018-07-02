package methodEmbedding.Magic_Trick.S.LYD1422;

import java.util.Scanner;
import java.io.PrintWriter;
import java.io.File;
import java.io.FileNotFoundException;
public class A {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner s=new Scanner(new File("a.in"));
        PrintWriter writer = new PrintWriter(new File("a.out"));
        int n=s.nextInt();
        s.nextLine();
        for (int i = 0; i < n; i++) {
            int ans=0,c=0;
            int jv=s.nextInt()-1;
            s.nextLine();
            int mat[]=new int[4];
            for (int j = 0; j < 4; j++){
                mat[0]=s.nextInt();
                mat[1]=s.nextInt();
                mat[2]=s.nextInt();
                mat[3]=s.nextInt();
                s.nextLine();
                if(j==jv){
                    j++;
                    for (; j < 4; j++) {
                        s.nextInt();
                        s.nextInt();
                        s.nextInt();
                        s.nextInt();
                        s.nextLine();
                    }
                    break;
                }
            }
            int jvv=s.nextInt()-1;
            int matt[]=new int[4];
            for (int j = 0; j < 4; j++) {
                matt[0]=s.nextInt();
                matt[1]=s.nextInt();
                matt[2]=s.nextInt();
                matt[3]=s.nextInt();
                s.nextLine();
                if(j==jvv){
                    j++;
                    for (; j < 4; j++) {
                        s.nextInt();
                        s.nextInt();
                        s.nextInt();
                        s.nextInt();
                        s.nextLine();
                    }
                    for (int k = 0; k < 4; k++) {
                        for (int l = 0; l < 4; l++) {
                            if(mat[k]==matt[l]){
                                c++;
                                ans=mat[k];
                            }
                        }
                    }
                    break;
                }
            }
            if(c>1){
                writer.println("Case #"+(i+1)+": Bad magician!");
            }else if(c==1){
                writer.println("Case #"+(i+1)+": "+ans);
            }else{
                 writer.println("Case #"+(i+1)+": Volunteer cheated!");
            }
        }
        writer.close();
    }
}
