import java.util.Scanner;
public class prog2 {
    public static void main(String[] args) {
        System.out.print("Enter a number : ");
        Scanner sc = new Scanner(System.in);

        int fac=1;
        int num = sc.nextInt();
        for(int i=1;i<=num;i++)
        {
            fac*=i;
        }
        System.out.println("Factorial of the entered number is = "+fac);
    }
}