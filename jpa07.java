import java.util.Scanner;
public class jpa07 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        for(int i=0;i<4;i++){
            System.out.print("請輸入三個整數:");
            int a=scn.nextInt();
            int b=scn.nextInt();
            int c=scn.nextInt();

            if(a+b>c){
                if(a*a+b*b==c*c){
                    System.out.println("直角三角形");
                }
                else if(a*a+b*b<c*c){
                    System.out.println("鈍角三角形");
                }
                    else if(a*a+b*b>c*c){
                        System.out.println("銳角三角形");
            }

        }else{
            System.out.println("不可以構成三角形");
        }

    }
}
}
