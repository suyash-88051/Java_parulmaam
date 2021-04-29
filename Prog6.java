import java.util.Scanner;

public class Prog6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number that you want to convert to binary : ");
        int num= sc.nextInt();
        int i=0;
        int [] binary = new int[20];

        while(num!=0)
        {
            binary[i]=num%2;
            num/=2;
            i++;
        }
        System.out.println("Binary number is : ");
        for(int j=i-1;j>=0;j--)
        {
            System.out.print(binary[j]+" ");
        }
    }
}
