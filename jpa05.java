import java.util.Scanner;
public class jpa05 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        for(int i=0;i<4;i++){
            System.out.println("Enter an integer:");
            int a=scn.nextInt();

            if(a%6==0){
                System.out.printf("%d是2、3、6的倍數\n", a);
            }else if(a%3==0){
                System.out.printf("%d是3的倍數\n",a);
            }else if(a%2==0){
                System.out.printf("%d是2的倍數\n",a);
            }else{
                System.out.printf("%d不是2、3、6的倍數\n",a);
            }
        }
    }
}
