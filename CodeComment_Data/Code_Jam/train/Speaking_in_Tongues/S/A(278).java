package methodEmbedding.Speaking_in_Tongues.S.LYD1124;

import java.io.File;
import java.util.Scanner;

class A {

	public static void main(String[] args) {

	if(args.length==100){
		System.out.println("Error	::  Please provide input file name as first command line argument");
		System.out.println("Usage	::  java Main <file_name>");
		System.out.println("Example	::  java Main A-small-practice.in");
 	}
   	else{
   		try{
    	Scanner input=new Scanner(new File("A-small-attempt0.in"));
		//Scanner input=new Scanner(new File("input.txt"));
		//System.out.println("Reading Input from "+ args[0]+" file");
		int no=input.nextInt();
                input.nextLine();

                String s[]=new String[no];
                for(int i=0;i<no;i++){
                    s[i]=input.nextLine();
                }
                //Algorithm
                //Create Dictionary
                char dict[][]=new char[26][2];

                dict[0][0]='a';
                dict[0][1]='y';

                dict[1][0]='b';
                dict[1][1]='h';

                dict[2][0]='c';
                dict[2][1]='e';

                dict[3][0]='d';
                dict[3][1]='s';

                dict[4][0]='e';
                dict[4][1]='o';

                dict[5][0]='f';
                dict[5][1]='c';

                dict[6][0]='g';
                dict[6][1]='v';

                dict[7][0]='h';
                dict[7][1]='x';

                dict[8][0]='i';
                dict[8][1]='d';

                dict[9][0]='j';
                dict[9][1]='u';

                dict[10][0]='k';
                dict[10][1]='i';

                dict[11][0]='l';
                dict[11][1]='g';

                dict[12][0]='m';
                dict[12][1]='l';

                dict[13][0]='n';
                dict[13][1]='b';

                dict[14][0]='o';
                dict[14][1]='k';

                dict[15][0]='p';
                dict[15][1]='r';

                dict[16][0]='q';
                dict[16][1]='z';

                dict[17][0]='r';
                dict[17][1]='t';

                dict[18][0]='s';
                dict[18][1]='n';

                dict[19][0]='t';
                dict[19][1]='w';

                dict[20][0]='u';
                dict[20][1]='j';

                dict[21][0]='v';
                dict[21][1]='p';

                dict[22][0]='w';
                dict[22][1]='f';

                dict[23][0]='x';
                dict[23][1]='m';

                dict[24][0]='y';
                dict[24][1]='a';

                dict[25][0]='z';
                dict[25][1]='q';

                for(int i=0;i<s.length;i++){
                    char c[]=s[i].toCharArray();
                    for(int j=0;j<c.length;j++){
                        for(int k=0;k<26;k++){
                            if(new String(c[j]+"").equals(dict[k][0]+"")){
                                c[j]=dict[k][1];
                                break;
                            }
                        }
                    }
                    s[i]=new String(c);
                }
                for(int i=0;i<no;i++){
                    System.out.println("Case #"+(i+1)+": "+s[i]);
                }
		}catch(Exception e){
			e.printStackTrace();
         }
      }
   }
}
