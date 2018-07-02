package methodEmbedding.Standing_Ovation.S.LYD1608;


import java.io.*;

public class StandingOvationTest {

	public static void main(String[] args) {
		try {
			FileReader FR=new FileReader("D:/shiyating/Downloads/A-small-attempt10.in");
			FileWriter FW = new FileWriter("C:/resut.txt",false);;
			BufferedReader  BR=new BufferedReader (FR);
			BufferedWriter BW=new BufferedWriter(FW);
			String data;int total=0;
			int count=0;
			do{
				data=BR.readLine();

				count++;

				if(count==1){
					total = Integer.parseInt(data);}
				if(count<=total+1 && count!=1){
					int count2=0;
					int result=0;
					String b=data;
					String []a=b.split(" ");
										System.out.println(a[0]);
										System.out.println(a[1]);
					for(int i=0;i<=Integer.parseInt(a[0])-1;i++){

							System.out.println(i+":"+(Integer.parseInt(a[1].substring(i,i+1))+count2));
							if(i<Integer.parseInt(a[1].substring(i,i+1))+count2){
//								System.out.println(Integer.parseInt(a[1].substring(i,i+1)));
								count2+=Integer.parseInt(a[1].substring(i,i+1));
								}
							else {
								count2=count2+1;
								result=result+1;
								}
						}
//					if(Integer.parseInt(a[0])-result<0)
//					result=0;
//					else
//					result=Integer.parseInt(a[0])-result;
					
					System.out.println("Case #"+(count-1)+": "+result);
					BW.write("Case #"+(count-1)+": "+result);
					BW.newLine();
				}

				if(data==null){
					System.out.println(total);
					break;}
			}
			while(true);
			BR.close();
			BW.close();
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}
