package methodEmbedding.Revenge_of_the_Pancakes.S.LYD370;

import java.util.*;
import java.lang.*;
import java.io.*;

class PanRev
{
public static void main(String[] args)
{

try{
int in=1,md=0,en=1;
File f=new File("B-small-attempt1.in");
Scanner scn=new Scanner(f); 
int cse=scn.nextInt();
String l=scn.nextLine();
for(int c=1;c<=cse;c++)
{int flp=0;

l=scn.nextLine();
if(l.charAt(0)=='-') 
flp++;
int j=0;
while(j<l.length())
if(l.charAt(j)=='-')
j++;
else break;

out:for(;j<l.length();j++)

 {if(l.charAt(j)=='-')
flp+=2;

while(j<l.length()-1)
if(l.charAt(j)!='+')
j++;
else continue out;

}
System.out.println("Case #"+c+": "+flp);
}
}
catch(Exception e){
e.printStackTrace();}
}
}

