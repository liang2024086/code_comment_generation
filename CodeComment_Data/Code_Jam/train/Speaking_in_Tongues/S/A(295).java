package methodEmbedding.Speaking_in_Tongues.S.LYD527;

public class A
{
    public static void main(String s[])
    {
           String str;
           String Entrada =
                "ejp mysljylc kd kxveddknmc re jsicpdrysi"+
                "rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd"+
                "de kr kd eoya kw aej tysr re ujdr lkgc jvqz";
           String Saida =
                "our language is impossible to understand" +
                "there are twenty six factorial possibilities" +
                "so it is okay if you want to just give upzq";
           char map[] = new char[255];

       int n,i,j;
       for(i=0;i<Entrada.length();i++)
         map[(int)Entrada.charAt(i)] = Saida.charAt(i);

       java.util.Scanner sc = new java.util.Scanner(System.in);
       n = sc.nextInt();
       sc.nextLine();
       for(i=0;i<n;i++)
       {
          StringBuilder nova = new StringBuilder();
          str = sc.nextLine();
          for(j=0; j<str.length();j++)
             nova.append(map[str.charAt(j)]);
          System.out.println("Case #"+(i+1)+": "+nova.toString());
       }
    }
}
