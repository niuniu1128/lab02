import java.util.Scanner;
public class jpa08 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        for(int i=0;i<5;i++){
            System.out.println("Input:");
            int a=scn.nextInt();

            if(a>=90){
                System.out.println("Your grade is A");
            }
            else if(a<90 && a>=80){
                System.out.println("Your grade is B");
            }
            else if(a<80 && a>=70){
                System.out.println("Your grade is Ｃ");
            }
            else if(a<70 && a>=60){
                System.out.println("Your grade is D");
            }else{
                System.out.println("Your grade is F");
            }
        }
    }
}
