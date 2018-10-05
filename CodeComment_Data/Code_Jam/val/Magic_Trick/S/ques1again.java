package methodEmbedding.Magic_Trick.S.LYD1753;

//retry of question 1
import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.lang.*;
public class ques1again{
public static void main(String[] args) throws Exception
{
String inFile = "A-small-attempt2.in";
String outFile = "A-small-practice.out";
Scanner sc = new Scanner(new File(inFile));
PrintWriter writer = new PrintWriter(outFile);
int number_cases = sc.nextInt();

for (int i = 1; i<=number_cases; i++)
{
int answer1 = sc.nextInt();

--answer1;

int ar1[][] = new int [4] [4];
for(int q = 0; q<=3; q++)
{
for(int w = 0; w<=3; w++)
{
ar1[q][w] = sc.nextInt();
}
}

int answer2 = sc.nextInt();
--answer2;

int ar2[][] = new int [4] [4];

for(int q = 0; q<=3; q++)
{
for(int w = 0; w<=3; w++)
{
ar2[q][w] = sc.nextInt();
}
}

int z = 0;
int x1 = 0, y1 = 0;
for (int p = 0; p<4; p++)
{
for (int x = 0; x<4; x++)
{
int k = ar1[answer1][p];
int l = ar2[answer2][x];
if(k == l)
{
z = z + 1;
x1 = ar1[answer1][p];}
}}























//System.out.println(z);
//System.out.println(ar1[x1][y1]);

if (z == 1)
//System.out.println("Case #" + i + ": " + (ar1[x1][y1]));
writer.println("Case #" + i + ": " + x1);
else if(z == 0)
//System.out.println("Case #" + i + ": " + "Volunteer cheated!");
writer.println("Case #" + i + ": " + "Volunteer cheated!");
else if((z == 2)||(z == 3)||(z == 4))
//System.out.println("Case #" + i + ": " + "Bad magician!");  
writer.println("Case #" + i + ": " + "Bad magician!");

}
writer.close();
}}
