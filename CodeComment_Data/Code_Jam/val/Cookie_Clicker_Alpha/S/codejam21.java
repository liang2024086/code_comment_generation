package methodEmbedding.Cookie_Clicker_Alpha.S.LYD629;

import java.io.*;

class codejam21{
public static void main(String args[]){
try{
FileReader f = new FileReader("C:\\B-small-attempt0.in");
BufferedReader br = new BufferedReader(f);
PrintWriter pw = new PrintWriter("C:\\out1.txt");
String s1 = br.readLine();

//------------------------------------------------
//variable declaration
int T=0;
T=Integer.parseInt(s1);
double min=0;
int xx=0;
double a[][] = new double[T][3];
double C,X,F;
double rate=2.0,tp=0.0,temp=0.0;
int fr=0,deg=2000;
double[] cumtime = new double[deg];
String[] s = new String[T];
int i=0,n,l=0;
//------------------------------------------------

//reading the file
while (i!=T)
{
s[i] = br.readLine();
i++;
}

for(l=0;l<T;l++)
{
//parsing the file contents into integer array
String[] aa = s[xx].split(" ");
xx++;
n = aa.length;
for(int y=0;y<n;y++)
a[l][y] = Double.parseDouble(aa[y]);

//calculating the cumulative times required for 1000 consecutive purchases
C = a[l][0];
F = a[l][1];
X = a[l][2];

fr=0;
for(i=1;i<deg;i++)
{
if(fr==0)
{
cumtime[0] = X/rate;
fr=1;
}
tp = tp + C/rate;
temp = tp+X/(rate+F);
cumtime[i] = temp;
rate = rate+F;
}

//finding the minimum time required
min = cumtime[0];

for(i=1;i<deg;i++)
if(min>cumtime[i])
min=cumtime[i];

//System.out.println("Case #"+(l+1)+": "+min);

String s4="Case #"+(l+1)+": "+min+"\n";

//writing the result to the file
pw.write(s4);

//reinitialization
rate=2;
tp=0;
temp=0;
}
pw.close();
}
catch(Exception e){}

}
}
