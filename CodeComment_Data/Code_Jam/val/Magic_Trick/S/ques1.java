package methodEmbedding.Magic_Trick.S.LYD2130;

import java.util.*;

public class quesOne {
public static void main(String args[]){
	
Scanner input=new Scanner(System.in);
	
	//Number of test cases
int test_cases=input.nextInt();
int counter=0;
int ans[]=new int[test_cases];
int c[]=new int[test_cases];
int cases=test_cases;

while(test_cases!=0) {
	
c[counter]=ans[counter]=0;
int order_one[][]=new int[4][4];


int order_two[][]=new int[4][4];


int ans_one=input.nextInt();


for (int a=0;a<4;a++)
{ 
	
	for (int b=0; b<4;b++) {
		String input_one = input.next();
		order_one[a][b]=Integer.parseInt(input_one);
	}
}


int ans_two=input.nextInt();

for (int a=0;a<4;a++)
{ 
	
	for (int b=0; b<4;b++) {
		String input_two = input.next();
		order_two[a][b]=Integer.parseInt(input_two);
	}
}

for (int a=0;a<4;a++){
	for (int d=0;d<4;d++) {
	if (order_one[ans_one-1][a]==order_two[ans_two-1][d]) {
		c[counter]+=1;; ans[counter]=order_one[ans_one-1][a];
	}}
		
}


counter++;
test_cases--;

} input.close();

for (int d=0;d<cases;d++){
	if (c[d]==1) System.out.println("Case #" + (d+1) + ": " + ans[d]);
	if (c[d]==0) System.out.println("Case #" + (d+1) + ": " + "Volunteer cheated!");
	if (c[d]>1) System.out.println("Case #" + (d+1) + ": " + "Bad magician!");
	
}

}}
 

