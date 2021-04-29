import java.util.Scanner;

public class Prog8 {
    public static void main(String[] args) {
        int num, sum = 0, c=0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number : ");
        num = scan.nextInt();
        sum += num;
        do {
            sum+=c;
            System.out.print("Do you want to continue this program then enter 1, otherwise the entered no. will be added ");
            c = scan.nextInt();
        } while (c != 1);
        System.out.println("The Sum of numbers is :" + sum);
    }
}
