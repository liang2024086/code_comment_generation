package methodEmbedding.Speaking_in_Tongues.S.LYD759;


import java.util.Arrays;
import java.util.Scanner;

public class A {
  public static void main(String[] args) {
    String orig[] =  {
        "ejp mysljylc kd kxveddknmc re jsicpdrysi",
        "rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd",
        "de kr kd eoya kw aej tysr re ujdr lkgc jv"
    };
    String ans[] = {
        "our language is impossible to understand",
        "there are twenty six factorial possibilities",
        "so it is okay if you want to just give up"
    };
    char map[] = new char[26];
    Arrays.fill(map, '?');
    for(int i = 0 ; i < orig.length ; ++i){
      for(int j = 0 ; j < orig[i].length() ; ++j){
        char c = orig[i].charAt(j);
        char d = ans[i].charAt(j);
        if(c == ' ')continue;
        map[c - 'a'] = d;
      }
    }
    // q,z
    map[16] = 'z';
    map[25] = 'q';
//    System.out.println(Arrays.toString(map));
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    sc.nextLine();
    for(int i = 1 ; i <= N ; ++i){
      String l = sc.nextLine();
      System.out.printf("Case #%d: " , i);
      for(int j = 0 ; j < l.length() ; ++j){
        char c = l.charAt(j);
        if(c == ' '){
          System.out.print(c);
        }else{
          System.out.print(map[c - 'a']);
        }
      }
      System.out.println();
    }
  }
}
