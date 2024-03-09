import java.util.Scanner;
public class jpa01 {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        for(int i=0;i<2;i++){

        System.out.println("Please enter score:");
        int a=scn.nextInt();

            if(a>60){
                System.out.println("You pass");
                System.out.println("END");
            }else{
                System.out.println("END");
            }
        }
    }
}
