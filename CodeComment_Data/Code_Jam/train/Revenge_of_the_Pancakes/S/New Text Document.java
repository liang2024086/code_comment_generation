package methodEmbedding.Revenge_of_the_Pancakes.S.LYD228;

import java.util.*;
class codejam2
{
public static void main(String[] args)
{
int count=0,test,k=0;
String s;
Scanner in=new Scanner(System.in);
test=in.nextInt();
while(test!=0)
{
test--;
count=0;
s=in.next();
for(int i=0;i<s.length()-1;i++)
{
if(s.charAt(i)!=s.charAt(i+1))
count++;
}
if(s.charAt(s.length()-1)=='-')
count++;
System.out.println("Case #"+(++k)+": "+count);
}
}
}
