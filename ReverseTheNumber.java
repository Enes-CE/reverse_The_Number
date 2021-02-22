import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);
        int temp=0,step;
        System.out.print("Enter the number you want to see the opposite. : ");
        int number=scanner.nextInt();

        for (; number!=0;number/=10){
            step=number%10;
            temp=temp*10+step;
        }
        System.out.println("The reverse of the number entered. :"+temp);
    }
}
