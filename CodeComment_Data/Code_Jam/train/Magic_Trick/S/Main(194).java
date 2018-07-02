package methodEmbedding.Magic_Trick.S.LYD746;


import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int a[][];
        for(int i=1;i<=T;i++){
            int fa = sc.nextInt();
            fa--;
            a = new int[4][4];
            for(int k=0;k<4;k++){
                for(int j=0;j<4;j++){
                    a[k][j] = sc.nextInt();
                }
            }
            int n=0,n1,n2,n3,n4;
            n1 = a[fa][0];
            n2 = a[fa][1];
            n3 = a[fa][2];
            n4 = a[fa][3];
            int sa = sc.nextInt();
            sa--;
            boolean flag = false,flag2 = false;
            for(int k=0;k<4;k++){
                for(int j=0;j<4;j++){
                    a[k][j] = sc.nextInt();
                }
            }
            if(a[sa][0]==n1 || a[sa][1]==n1 || a[sa][2]==n1 || a[sa][3]==n1){
                n=n1;
                if(a[sa][0]==n2 || a[sa][1]==n2 || a[sa][2]==n2 || a[sa][3]==n2 ||
                        a[sa][0]==n3 || a[sa][1]==n3 || a[sa][2]==n3 || a[sa][3]==n3 ||
                        a[sa][0]==n4 || a[sa][1]==n4 || a[sa][2]==n4 || a[sa][3]==n4){
                    flag = true;
                }
            }
            else if(a[sa][0]==n2 || a[sa][1]==n2 || a[sa][2]==n2 || a[sa][3]==n2){
                n=n2;
                if(a[sa][0]==n1 || a[sa][1]==n1 || a[sa][2]==n1 || a[sa][3]==n1 ||
                        a[sa][0]==n3 || a[sa][1]==n3 || a[sa][2]==n3 || a[sa][3]==n3 ||
                        a[sa][0]==n4 || a[sa][1]==n4 || a[sa][2]==n4 || a[sa][3]==n4){
                    flag = true;
                }
            }
            else if(a[sa][0]==n3 || a[sa][1]==n3 || a[sa][2]==n3 || a[sa][3]==n3){
                n=n3;
                if(a[sa][0]==n2 || a[sa][1]==n2 || a[sa][2]==n2 || a[sa][3]==n2 ||
                        a[sa][0]==n1 || a[sa][1]==n1 || a[sa][2]==n1 || a[sa][3]==n1 ||
                        a[sa][0]==n4 || a[sa][1]==n4 || a[sa][2]==n4 || a[sa][3]==n4){
                    flag = true;
                }
            }
            else if(a[sa][0]==n4 || a[sa][1]==n4 || a[sa][2]==n4 || a[sa][3]==n4){
                n=n4;
                if(a[sa][0]==n2 || a[sa][1]==n2 || a[sa][2]==n2 || a[sa][3]==n2 ||
                        a[sa][0]==n3 || a[sa][1]==n3 || a[sa][2]==n3 || a[sa][3]==n3 ||
                        a[sa][0]==n1 || a[sa][1]==n1 || a[sa][2]==n1 || a[sa][3]==n1){
                    flag = true;
                }
            }
            else{
                flag2= true;
            }
            if(flag){
                System.out.println("Case #"+i+": Bad magician!");
            }
            else{
                if(flag2){
                    System.out.println("Case #"+i+": Volunteer cheated!");
                }
                else{
                    System.out.println("Case #"+i+": "+n);
                }
            }
        }
    }
}
