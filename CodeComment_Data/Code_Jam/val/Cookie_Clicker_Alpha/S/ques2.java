package methodEmbedding.Cookie_Clicker_Alpha.S.LYD487;

import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.lang.*;
public class ques2{
public static void main(String[] args) throws Exception{
String inFile = "B-small-attempt2.in";
String outFile = "ques2solution.out";
Scanner sc = new Scanner(new File(inFile));
PrintWriter writer = new PrintWriter(outFile);
int num_test = sc.nextInt();

//iterating through the test cases

for(int i = 1; i<= num_test; i++)
{
double c = sc.nextDouble();
double f = sc.nextDouble();
double x = sc.nextDouble();

// strategy will be to seee what to do to get the most points faster
double nc = 0;
double time = 0;
double rate_ini = 2;
double time_default = x/2;
double rate_aftercf = 2 + f;

//calculating time required to get X cookies without buying a cookie farm and after buying a cookie farm
double time_cover = c/rate_ini;

double time_cf = time_cover + x/rate_aftercf;

if (time_default < time_cf)
{
writer.println("Case #" + i + ": " + time_default);
}
else
{
do
{
time_default = time_cf;

//



time_cover += c/rate_aftercf;

rate_aftercf += f;

time_cf = time_cover + x/rate_aftercf;

rate_ini = rate_aftercf;

if (time_cf < time_default)
time = time_cf;

else
time = time_default;

}

while (time_cf < time_default);
writer.println("Case #" + i + ": " + time);
}
}
writer.close();
}
}
