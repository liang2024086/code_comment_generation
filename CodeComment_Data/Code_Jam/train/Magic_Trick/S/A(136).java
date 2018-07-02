package methodEmbedding.Magic_Trick.S.LYD1065;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class A {
    
    static BufferedWriter bw;
    
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(new File("A-small-attempt0.in"));
        bw = new BufferedWriter(new FileWriter(new File("output.txt")));
            
        int tc = sc.nextInt();
        for(int d=1;d<=tc;d++){
            bw.write("Case #"+String.valueOf(d)+": ");
            int solution = 0;
            
            int [] firstRow = new int[4];
            int [] secondRow = new int[4];
            
            int first = sc.nextInt(); sc.nextLine();
            
            for(int i=1;i<first;i++) sc.nextLine();
            for(int i=0;i<4;i++) firstRow[i] = sc.nextInt(); sc.nextLine();
            for(int i=first;i<4;i++) sc.nextLine();
            
            int second = sc.nextInt(); sc.nextLine();
            
            for(int i=1;i<second;i++) sc.nextLine();
            for(int i=0;i<4;i++) secondRow[i] = sc.nextInt(); sc.nextLine();
            for(int i=second;i<4;i++) sc.nextLine();
            
      A :   for(int i=0;i<4;i++){
                for(int j=0;j<4;j++){
                    if(firstRow[i]==secondRow[j]){
                        if(solution>0){
                            solution = -1;
                            break A;
                        }
                        else solution = firstRow[i];
                    }
                }
            }
            
            if(solution>0) bw.write(String.valueOf(solution));
            else if (solution<0) bw.write(String.valueOf("Bad magician!"));
            else bw.write(String.valueOf("Volunteer cheated!"));
            bw.newLine();
            bw.flush();              
        }
        sc.close();
        bw.close();
    }
}
