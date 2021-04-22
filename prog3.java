import java.util.Scanner;

public class prog3{
    public static void main(String args[]){
        int arr[]=new int[24],s;
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        s=scan.nextInt();
        System.out.println("Enter the elements of array: ");
        for(int i=0;i<s;i++){
            arr[i]=scan.nextInt();
        }
        for(int x=0;x<s;x++){
            arr[x]=arr[x]+5;
        }
        System.out.println("After adding 5 in each element: ");
        for(int x=0;x<s;x++){
            System.out.print(arr[x]+" ");
        }
    }
}
