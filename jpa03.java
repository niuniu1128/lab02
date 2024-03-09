import java.util.Scanner;
public class jpa03 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        for(int i=0;i<2;i++){
            System.out.println("Input:");
            int a=scn.nextInt();

            if(a%2==0){
                System.out.println("The number is even.");
            }else{
                System.out.println("The number is odd.");
            }

        }
    }
}
