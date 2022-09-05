import java.util.Scanner;

public class HarshadNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Number: ");
        int n = sc.nextInt();
        int sum=0, temp=n;
        while (temp!=0) {
            int d=temp%10;
            sum+=d;
            temp=temp/10;
        }
        if (n%sum==0)
            System.out.println(n+" is a Harshad Number");
        else
            System.out.println(n+" is not a Harshad Number");

    }
}
