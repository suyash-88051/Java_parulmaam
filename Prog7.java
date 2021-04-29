import java.util.Scanner;

public class Prog7 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num,c=0;
        System.out.print("Enter a number : ");
        num=sc.nextInt();
        for(int i=2;i<=num/2;i++)
        {
            if(num%i==0)
                c++;
        }
        if(c==0)
            System.out.println("Entered no. is a prime Number");
        else
            System.out.println("Entered number is not a prime number");
    }
}
