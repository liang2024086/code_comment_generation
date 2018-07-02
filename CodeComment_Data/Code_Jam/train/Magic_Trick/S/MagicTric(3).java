package methodEmbedding.Magic_Trick.S.LYD994;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;

/**
 *
 * @author Dumal
 */
public class MagicTric {
    public static void main(String[] args) {
        try {
            FileReader fr=new FileReader("A-small-attempt1.in");
            //FileReader fr=new FileReader("C:\\Users\\Dumal\\Documents\\NetBeansProjects\\Code jam\\src\\code\\jam\\C-small-practice.in");
            File f=new File("Magictric.out");
            f.createNewFile();
            PrintWriter pw=new PrintWriter(f);
            BufferedReader br=new BufferedReader(fr);
            String s=br.readLine();
            System.out.println("Number of Test Cases="+s);
            int Testcase=1;
            int cases=Integer.parseInt(s);
            for (int i = 1; i <= cases; i++) {
                int set1[][]=new int[4][4];
                int ans[]=new int[4];
                boolean same=true;
                int count=0;
                int r1=Integer.parseInt(br.readLine());
                String s1r1[]=(s=br.readLine()).split(" ");
                String s1r2[]=(s=br.readLine()).split(" ");
                String s1r3[]=(s=br.readLine()).split(" ");
                String s1r4[]=(s=br.readLine()).split(" ");
                
                for (int j = 0; j < 4; j++) {
                    set1[0][j]=Integer.parseInt(s1r1[j]);
                    set1[1][j]=Integer.parseInt(s1r2[j]);
                    set1[2][j]=Integer.parseInt(s1r3[j]);
                    set1[3][j]=Integer.parseInt(s1r4[j]);
                }
                int set2[][]=new int[4][4];
                int r2=Integer.parseInt(br.readLine());
                String s2r1[]=(s=br.readLine()).split(" ");
                String s2r2[]=(s=br.readLine()).split(" ");
                String s2r3[]=(s=br.readLine()).split(" ");
                String s2r4[]=(s=br.readLine()).split(" ");
                for (int j = 0; j < 4; j++) {
                    set2[0][j]=Integer.parseInt(s2r1[j]);
                    set2[1][j]=Integer.parseInt(s2r2[j]);
                    set2[2][j]=Integer.parseInt(s2r3[j]);
                    set2[3][j]=Integer.parseInt(s2r4[j]);
                }
                
                for (int j = 0; j < 4; j++) {
                    for (int k = 0; k < 4; k++) {
                        if(set1[j][k]!=set2[j][k]){
                            same=false;
                        }
                    }
                    //
                }
                for (int j = 0; j < 4; j++) {
                    //System.out.println(set1[r1-1][j]+"="+set2[r2-1][j]);
                    
                    for (int k = 0; k < 4; k++) {
                        if(set1[r1-1][j]==set2[r2-1][k]){
                            //System.out.println("qq");
                            ans[count]=set1[r1-1][j];
                            count++;
                        }
                    }
                }
                System.out.println("c="+count);
                if(same && r1!=r2){
                    pw.write("Case #"+i+": Volunteer cheated!");                   
                }
                if(count==0){
                    pw.write("Case #"+i+": Volunteer cheated!");
                }
                if(count==1){
                    pw.write("Case #"+i+": "+ String.valueOf(ans[0]));
                }
                if(count>1){
                    pw.write("Case #"+i+": Bad magician!");
                }
                //System.out.println();
//                for (int j = 0; j < 4; j++) {
//                    for (int k = 0; k < 4; k++) {
//                        System.out.print(set2[j][k]+" ");
//                    }
//                    System.out.println();
//                }
                pw.println();
                Testcase++;
            }
            pw.close();
        } catch (Exception e) {
        }
            
    }
}
