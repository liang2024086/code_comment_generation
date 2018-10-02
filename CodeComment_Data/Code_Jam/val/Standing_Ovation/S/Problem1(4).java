package methodEmbedding.Standing_Ovation.S.LYD1345;

import java.io.*;

public class Problem1
{
public static void main(String... a)throws IOException
{
int n,n1,n2,n3,n4,i,cnt,cnt1 = 0;
String s1;
BufferedReader br = new BufferedReader(new FileReader("A-small-attempt1.in"));
File f = new File("output.txt");
f.createNewFile();
FileWriter writer = new FileWriter(f); 

n = Integer.parseInt(br.readLine()); // no of test cases

while (n != 0)
{
s1 = br.readLine(); // Test case 
n1 = Character.getNumericValue(s1.charAt(0)); // Max shyness

n4=0;
cnt=0;

for(i=2;i<=2+n1;i++)
{
n3 = i-2; // shyness(req claps)

if(n3>n4)
{
cnt = cnt + 1;
n4 = n4 + 1;
}

n2 = Character.getNumericValue(s1.charAt(i)); // no of claps in a shyness
n4 = n4 + n2; // total claps
}
cnt1 ++; // case no
writer.write("Case #" + cnt1 + ": " + cnt);
writer.write(System.getProperty("line.separator"));
//System.out.println("Case #" + cnt1 + ": " + cnt);
n--;

}


writer.flush();
writer.close();
}

}
