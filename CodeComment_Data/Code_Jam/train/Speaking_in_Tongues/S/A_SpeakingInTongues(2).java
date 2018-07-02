package methodEmbedding.Speaking_in_Tongues.S.LYD1296;


import java.io.*;

public class A_SpeakingInTongues {
  private static File in=new File("data/A-small-attempt0.in"); // Read from file
  private static File out=new File("data/A-small-attempt0.out"); // Write to file
  //private static File out=null; // Write to console
  public static void main(String[] args) throws Throwable {
    String example[][]={
        {"ejp mysljylc kd kxveddknmc re jsicpdrysi","our language is impossible to understand"},
        {"rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd","there are twenty six factorial possibilities"},
        {"de kr kd eoya kw aej tysr re ujdr lkgc jv","so it is okay if you want to just give up"}
    };
    char mapping[]=new char[26];
    mapping['y'-'a']='a';
    mapping['e'-'a']='o';
    mapping['q'-'a']='z';
    for (String possibility[]:example) {
      for (int i=0; i<possibility[0].length(); i++) {
        char a=possibility[0].charAt(i),b=possibility[1].charAt(i);
        if (a!=' '||b!=' ') mapping[a-'a']=b;
      }
    }
    char[] reverse=new char[26];
    for (int i=0; i<26; i++) {
      if (mapping[i]!=0) reverse[mapping[i]-'a']=(char)('a'+i);
    }
    int missing1=new String(mapping).indexOf('\0');
    int missing2=new String(reverse).indexOf('\0');
    mapping[missing1]=(char)(missing2+'a');
    reverse[missing2]=(char)(missing1+'a');
    BufferedReader reader=new BufferedReader(new FileReader(in));
    if (out!=null) System.setOut(new PrintStream(out));
    for (int c=0,T=Integer.parseInt(reader.readLine()); c<T; c++) {
      char line[]=reader.readLine().toCharArray();
      for (int i=0; i<line.length; i++) {
        if (line[i]>='a'&&line[i]<='z') line[i]=(char)(mapping[line[i]-'a']);
      }
      System.out.println("Case #"+(c+1)+": "+new String(line));
    }
    reader.close();
    if (out!=null) System.out.close();
  }
}
