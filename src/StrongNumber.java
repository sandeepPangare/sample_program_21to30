import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {

        System.out.println("Enter a Number to Check Strong Number :");

        Scanner scanner=new Scanner(System.in);
        int n = scanner.nextInt();
        int num = n;
        int sum = 0;
        int d;           //145 factorial are 1,4,5 --- 1+24+120=145
                        // given num = factor 145=145
        while (n > 0) {
            int f = 1;
            d = n % 10;
            for (int i = 1; i <= d; i++) {
                f = f * i;
            }
            sum = sum + f;
            n = n / 10;
        }
        if (num == sum) {
            System.out.println(num+" is a Strong number");
        } else {
            System.out.println(num+" Not a strong number");
        }

    }
}
