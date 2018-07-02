package methodEmbedding.Speaking_in_Tongues.S.LYD1552;

import java.io.*;
class CDA5
{
public static void main(String args[])
throws Exception
{

//Console br = System.console();
String x;

OutputStream f;
f = new FileOutputStream("c:\\users\\Nserver\\desktop\\output.txt");

BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

int T;

T = Integer.parseInt(br.readLine());

String G[] = new String[T];


StringBuffer G1[] = new StringBuffer[T];

for(int j=0; j<T; j++)
{
G[j] = br.readLine();

StringBuffer temp = new StringBuffer(G[j]);

int len = G[j].length();
//char S[] = new char[len];
char s[] = G[j].toCharArray();

for(int i=0; i<len; i++)
{




if(s[i] == 'a')
{
     temp.setCharAt(i, 'y');
}


if(s[i]=='b')
{
 temp.setCharAt(i,'h');

}



if(s[i]=='c')  {    temp.setCharAt(i,  'e'); }

if(s[i]=='d')  {    temp.setCharAt(i,  's'); }
if(s[i]=='e')  {    temp.setCharAt(i,  'o'); }
if(s[i]=='f')  {    temp.setCharAt(i,  'c'); }
if(s[i]=='g')  {    temp.setCharAt(i,  'v'); }
if(s[i]=='h')  {    temp.setCharAt(i,  'x'); }
if(s[i]=='i')  {    temp.setCharAt(i,  'd'); }
if(s[i]=='j')  {    temp.setCharAt(i,  'u'); }
if(s[i]=='k')  {    temp.setCharAt(i,  'i'); }
if(s[i]=='l')  {    temp.setCharAt(i,  'g'); }
if(s[i]=='m')  {    temp.setCharAt(i,  'l'); }
if(s[i]=='n')  {    temp.setCharAt(i,  'b'); }
if(s[i]=='o')  {    temp.setCharAt(i,  'k'); }
if(s[i]=='p')  {    temp.setCharAt(i,  'r'); }
if(s[i]=='q')  {    temp.setCharAt(i,  'z'); }
if(s[i]=='r')  {    temp.setCharAt(i,  't'); }
if(s[i]=='s')  {    temp.setCharAt(i,  'n'); }
if(s[i]=='t')  {    temp.setCharAt(i,  'w'); }
if(s[i]=='u')  {    temp.setCharAt(i,  'j'); }
if(s[i]=='v')  {    temp.setCharAt(i,  'p'); }
if(s[i]=='w')  {    temp.setCharAt(i,  'f'); }
if(s[i]=='x')  {    temp.setCharAt(i,  'm'); }
if(s[i]=='y')  {    temp.setCharAt(i,  'a'); }
if(s[i]=='z')  {    temp.setCharAt(i,  'q'); }
if(s[i]==' ')  {    temp.setCharAt(i,  ' '); }


}


G1[j] = temp;
x = "Case #" + (j+1) + ": " + temp;

byte arr[] = x.getBytes();

f.write(arr);


}

f.close();
for(int i=0; i<T; i++)
{
System.out.println("Case #" + (i+1) + ": " + (G1[i]));
}



}}
