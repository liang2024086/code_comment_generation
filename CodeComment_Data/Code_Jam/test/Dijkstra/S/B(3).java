package method_new_test.Dijkstra.S.LYD2;

import java.util.*;

class B {
  public static void main(String[] arg) {
    Scanner s = new Scanner(System.in);
    int t = s.nextInt();
    int id = 0, i = 1, j =2, k = 3;
    int id1 = 4, i1= 5, j1= 6, k1 = 7;
    int mat[][] = {
      {id, i, j, k, id1, i1, j1, k1},
      {i, id1, k, j1, i1, id, k1, j},
      {j, k1, id1, i, j1, k, id, i1},
      {k, j, i1, id1, k1, j1, i, id},
      {id1, i1, j1, k1, id, i, j, k},
      {i1, id, k1, j, i, id1, k, j1},
      {j1, k, id, i1, j, k1, id1, i},
      {k1, j1, i, id, k, j, i1, id1}
    };

    for (int count =1; count <=t; ++count) {
      int l;
      long x;
      l = s.nextInt();
      x = s.nextLong();
      String inp = s.next();
      inp = inp.replaceAll("i","1").replaceAll("j","2").replaceAll("k","3");
      int reduceAll = id, reduceJ = id;
      long ipos = -1, jpos = -1;
      for (long xc = 0; xc < x; xc++) {
        for (int lc = 0; lc < l; lc++) {
          reduceAll = mat[reduceAll][inp.charAt(lc) - '0'];
          if (ipos != -1 && jpos == -1) {
            reduceJ = mat[reduceJ][inp.charAt(lc) - '0'];
            if (reduceJ == j) {
              jpos = l * xc + lc;
            }
          }
          if (reduceAll == i && ipos == -1) {
            ipos = l * xc + lc;
          }
        }
      }

      if (reduceAll != id1 || ipos == -1 || jpos == -1 || jpos >= l * x - 1) {
        System.out.println("Case #"+count+ ": " + "NO");
      } 
      else {
        System.out.println("Case #"+count+ ": " + "YES");
      }
    }
  }
}
