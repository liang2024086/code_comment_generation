package methodEmbedding.Magic_Trick.S.LYD1025;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import java.util.StringTokenizer;

public class A {
    public A() {
        super();
    }

    public static void main(String[] args) throws FileNotFoundException,
                                                  IOException {
        A a = new A();
        FileReader fr = new FileReader("A-small-attempt0.in");
      //  FileReader fr = new FileReader("A-small-practice.in");
          BufferedReader br = new BufferedReader(fr);
          String noofT = br.readLine();
          int T = Integer.parseInt(noofT);
          
          System.out.println("no of test cases = " + T);
          BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt"));
          int[][] fa = new int[4][4];
          int[][] sa = new int[4][4];
          for (int ii=1; ii <= T; ii++){
              int row1 = Integer.parseInt(br.readLine());
              for (int i=0; i <= 3; i++){
                  StringTokenizer st = new StringTokenizer(br.readLine()," ");
                  for (int j=0; j <= 3; j++){
                      fa[i][j] = Integer.parseInt(st.nextToken());
                  }
              }
              
              int row2 = Integer.parseInt(br.readLine());
              for (int i=0; i <= 3; i++){
                  StringTokenizer st = new StringTokenizer(br.readLine()," ");
                  for (int j=0; j <= 3; j++){
                      sa[i][j] = Integer.parseInt(st.nextToken());
                  }
              }
              int cnt = 0;
              int result = 0;
              for (int i=0; i <=3 ; i++){
              for (int j=0; j <= 3; j++){
                  if (fa[row1 - 1][i] == sa[row2 - 1][j]){
                      cnt++;
                      result = i;
                  }
              }
              }
              
              if (cnt == 1){
                  bw.write("Case #" + ii + ": " + fa[row1 - 1][result]);
                  bw.newLine();
              }
              if (cnt > 1){
                  bw.write("Case #" + ii + ": Bad magician!" );
                  bw.newLine();
              }
              if (cnt == 0){
                  bw.write("Case #" + ii + ": Volunteer cheated!" );
                  bw.newLine();
              }
          }
          bw.close();
    }
}
