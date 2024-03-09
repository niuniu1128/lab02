import java.util.Scanner;
public class jpa02 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        for(int i=0;i<2;i++){

            System.out.println("Input:");
            int a=scn.nextInt();
            int b=scn.nextInt();

            int max;
            if(a>b){
                max=a;
                System.out.println(max+" is larger than "+b);
            }else{
                max=b;
                System.out.println(max+" is larger than "+a);
            }

            
        }
    }
}
